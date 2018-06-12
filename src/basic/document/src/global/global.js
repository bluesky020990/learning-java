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
    {url: "lesson_23_Java_Data_Structure2.html", titleDisplay: "Java Data Structures"},
    {url: "lesson_24_Java_Collections_Framework.html", titleDisplay: "Java Collections Framework"},
    {url: "lesson_25_Collections_Sumary.html", titleDisplay: "Java Collection Summary"},
    {url: "lesson_26_String_in_Java.html", titleDisplay: "String in Java"},
    {url: "lesson_26_Java_Generic.html", titleDisplay: "Java Generic"},
    {url: "lesson_27_Maven_Project.html", titleDisplay: "Maven Apache"},
    // {url: "zz_template_files.html", titleDisplay: "___________"},
];


const LIST_DESIGN_PATTERN_LESSON_DATA = [
    {url: "lesson_01_Design_Pattern.html", titleDisplay: "Design Pattern Overview"},
    {url: "lesson_02_Factory_Pattern.html", titleDisplay: "Factory Pattern"},
    {url: "lesson_03_Abstract_Factory_Pattern.html", titleDisplay: "Abstract Factory Pattern"},
    {url: "lesson_04_Singleton_Pattern.html", titleDisplay: "Singleton Pattern"},
    {url: "lesson_05_Builder_Pattern.html", titleDisplay: "Builder Pattern"},
    {url: "lesson_06_prototype_pattern.html", titleDisplay: "Prototype Pattern"},
    {url: "lesson_07_adapter_pattern.html", titleDisplay: "Adapter Pattern"},
    {url: "lesson_08_bridge_pattern.html", titleDisplay: "Bridge Pattern"},
    {url: "lesson_09_composite_pattern.html", titleDisplay: "Composite Pattern"},
    {url: "lesson_10_decorate_pattern.html", titleDisplay: "Decorate Pattern"},
    {url: "lesson_11_facade_pattern.html", titleDisplay: "Facade Pattern"},
    {url: "lesson_12_flyweight.html", titleDisplay: "Flyweight Pattern"},
    {url: "lesson_13_proxy_pattern.html", titleDisplay: "Proxy Pattern"},
    {url: "lesson_14_chain_of_responsibility_pattern.html", titleDisplay: "Proxy Pattern"},
];

const JAVA_CONTENT_LIST = [{
    category : "Java Basic",
    prefixUrl: "lesson",
    contents: LIST_LESSON_DATA
}, {
    category : "Design Pattern",
    prefixUrl: "design_pattern",
    contents: LIST_LESSON_DATA
}];

generateCategory();

function generateCategory (){
    var lessonCategoryArray = new Array();

    var category = $('body').attr("category") != null && $('body').attr("category").trim() != "" ? $('body').attr("category") : null;

    if(category == "design-pattern"){
        lessonCategoryArray.push(["Design Pattern", LIST_DESIGN_PATTERN_LESSON_DATA, "design_pattern"]);
        lessonCategoryArray.push(["Java Basic",     LIST_LESSON_DATA, "lesson"                      ]);
    } else {
        lessonCategoryArray.push(["Java Basic",     LIST_LESSON_DATA, "lesson"                      ]);
        lessonCategoryArray.push(["Design Pattern", LIST_DESIGN_PATTERN_LESSON_DATA, "design_pattern"]);
    }

    initPageData(lessonCategoryArray);
}

function initPageData(lessonCategoryArray){
    var previousPageData = null;
    var currentPageData = null;
    var nextPageData = null;
    var currentPageURL = getCurrentPageURL();

    var $mainLessonMenu = $('#main-lesson-menu');
    $mainLessonMenu.empty();

    for(var k = 0; k < lessonCategoryArray.length; k++){
        var lessonCategory = lessonCategoryArray[k];
        var headerDisplay  = lessonCategory[0];
        var listLessonData = lessonCategory[1];
        var prefixUrl      = lessonCategory[2];

        var categoryContentHTML = new Array();

        categoryContentHTML.push('<h4 class="font-italic">' + headerDisplay +'</h4>');
        categoryContentHTML.push('<ol>');
        for(var i = 0; i < listLessonData.length; i++){
            var lessonData = listLessonData[i];

            if(lessonData.url.indexOf(currentPageURL) == 0){
                categoryContentHTML.push('<li><a class="active">' + lessonData.titleDisplay + '</a></li>');
                currentPageData = lessonData;

                if(i > 0){
                    previousPageData = listLessonData[i - 1];
                }

                if(i < listLessonData.length - 1){
                    nextPageData = listLessonData[i + 1];
                }
            } else {
                categoryContentHTML.push('<li><a href="' + generatePageUrl(lessonData.url, prefixUrl) + '">' + lessonData.titleDisplay + '</a></li>');
            }
        }
        categoryContentHTML.push('</ol>');
        $mainLessonMenu.append($(categoryContentHTML.join("")));
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




    function getCurrentPageURL (){
        var location = window.location.href;
        var currentURL = location.substring(0, location.lastIndexOf(".html"));
        return currentURL.substring(currentURL.lastIndexOf("/") + 1);
    }

    function generatePageUrl(pageUrl, prefixUrl){
        return '../' + prefixUrl + '/' + pageUrl;
    }

}