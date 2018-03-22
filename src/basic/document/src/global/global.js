const LIST_LESSON_DATA = [
    {url: "lesson_00_Beginning_Learning_java.html", titleDisplay: "Introduce Java"},
    {url: "lesson_01_Java_Virtual_Machine.html", titleDisplay: "Java Virtual Machine"},
    {url: "lesson_02_Components_of_JDK.html", titleDisplay: "Components of JDK"},
    {url: "lesson_03_Object_Reference.html", titleDisplay: "Object Reference - Java pass by value"},
    {url: "lesson_04_Object_n_Class_in_Java_01.html", titleDisplay: "Object and Class in Java(1)"},
    {url: "lesson_05_Object_n_Class_in_Java_02.html", titleDisplay: "Object and Class in Java(2)"},
    {url: "lesson_06_Object_n_Class_in_Java_03.html", titleDisplay: "Object and Class in Java(3)"},
    {url: "lesson_07_Access_Modifier_in_Java.html", titleDisplay: "Access Modifier in Java"},
    {url: "lesson_08_Constructor_in_Java.html", titleDisplay: "Constructor in Java"},
    {url: "lesson_09_Keywords_in_Class.html", titleDisplay: "Keyword in Class"},
    {url: "lesson_10_How_System_out_in_Java_works.html", titleDisplay: "How System.out.println in Java works"},
    {url: "lesson_11_Inheritance_in_Java.html", titleDisplay: "Inheritance in Java"},
    {url: "lesson_12_Polymorphism_in_Java.html", titleDisplay: "Polymorphism in Java"},
    {url: "lesson_13_Type_of_Polymorphism_in_Java.html", titleDisplay: "Types of Polymorphism in Java"},
    {url: "lesson_14_Abstract_in_Java.html", titleDisplay: "Abstract in Java"},
    {url: "lesson_15_Encapsulation_in_Java.html", titleDisplay: "Encapsulation in Java"},
    {url: "lesson_16_Java_Basic_Datatype.html", titleDisplay: "Basic data type"},
    {url: "lesson_17_Java_Modifier_Types.html", titleDisplay: "Modifier Type"},
    {url: "lesson_18_Java_Basic_Operations.html", titleDisplay: "Basic Operation"},
    {url: "lesson_19_Java_Loop_Control.html", titleDisplay: "Java Loop Control"},
    {url: "lesson_20_Number_Class.html", titleDisplay: "Java Number, String, Date Class"},
    {url: "lesson_21_Java_Files_and_IO.html", titleDisplay: "Java Files and I/O"},
    {url: "lesson_22_Java_Exceptions.html", titleDisplay: "Java Exception"},


    {url: "zz_template_files.html", titleDisplay: "___________"},
];

initPageData();

function initPageData(){
    var previousPageData = null;
    var currentPageData = null;
    var nextPageData = null;
    var currentPageURL = getCurrentPageURL();

    var menuHTML = new Array();
    for(var i = 0; i < LIST_LESSON_DATA.length; i++){
        var lessonData = LIST_LESSON_DATA[i];

        if(lessonData.url.indexOf(currentPageURL) == 0){
            menuHTML.push('<li><a class="active">' + lessonData.titleDisplay + '</a></li>');
            currentPageData = lessonData;

            if(i > 0){
                previousPageData = LIST_LESSON_DATA[i - 1];
            }

            if(i < LIST_LESSON_DATA.length - 1){
                nextPageData = LIST_LESSON_DATA[i + 1];
            }
        } else {
            menuHTML.push('<li><a href="' + generatePageUrl(lessonData.url) + '">' + lessonData.titleDisplay + '</a></li>');
        }
    }

    if(currentPageData != null){
        $('head').find('title').html(currentPageData.titleDisplay);
    }

    if(previousPageData != null){
        $('.blog-pagination').find('.btn-outline-primary').removeClass("disabled");
        $('.blog-pagination').find('.btn-outline-primary').attr("href", generatePageUrl(previousPageData.url));
        $('.blog-pagination').find('.btn-outline-primary').html(previousPageData.titleDisplay);
    } else {
        $('.blog-pagination').find('.btn-outline-primary').addClass("disabled");
    }

    if(nextPageData != null){
        $('.blog-pagination').find('.btn-outline-secondary').removeClass("disabled");
        $('.blog-pagination').find('.btn-outline-secondary').attr("href", generatePageUrl(nextPageData.url));
        $('.blog-pagination').find('.btn-outline-secondary').html(nextPageData.titleDisplay);
    } else {
        $('.blog-pagination').find('.btn-outline-secondary').addClass("disabled");
    }

    var $mainLessonMenu = $('#main-lesson-menu');
    $mainLessonMenu.find('.list-unstyled').empty().append(menuHTML.join(""));


    function getCurrentPageURL (){
        var location = window.location.href;
        var currentURL = location.substring(0, location.lastIndexOf(".html"));
        return currentURL.substring(currentURL.lastIndexOf("/") + 1);
    }

    function generatePageUrl(pageUrl){
        return '../lesson/' + pageUrl;
    }

}