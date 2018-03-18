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
    {url: "zz_template_files.html", titleDisplay: "___________"},
    {url: "lesson_15_Encapsulation_in_Java.html", titleDisplay: "___________"},
    {url: "lesson_15_Encapsulation_in_Java.html", titleDisplay: "___________"}
];

initPageData();

function initPageData(){
    var currentPageData = null;
    var currentPageURL = getCurrentPageURL();

    var menuHTML = new Array();
    for(var i = 0; i < LIST_LESSON_DATA.length; i++){
        var lessonData = LIST_LESSON_DATA[i];

        if(lessonData.url.indexOf(currentPageURL) == 0){
            menuHTML.push('<li><a class="active">' + lessonData.titleDisplay + '</a></li>');
            currentPageData = lessonData;
        } else {
            menuHTML.push('<li><a href="../lesson/' + lessonData.url + '">' + lessonData.titleDisplay + '</a></li>');
        }
    }

    if(currentPageData != null){
        $('head').find('title').html(currentPageData.titleDisplay);
    }

    var $mainLessonMenu = $('#main-lesson-menu');
    $mainLessonMenu.find('.list-unstyled').empty().append(menuHTML.join(""));


    function getCurrentPageURL (){
        var location = window.location.href;
        var currentURL = location.substring(0, location.lastIndexOf(".html"));
        return currentURL.substring(currentURL.lastIndexOf("/") + 1);
    }

}