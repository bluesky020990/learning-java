package practice.basic.nestedclass;

public class NestedClass {

    public void showMessage(){
        System.out.println("This is function of Outer Class!!");
    }

    static class StaticNestedCLass {
        public void showMessage(){
            System.out.println("This is function of Inner Class!!");
        }
    }


    class NonStaticNestedClass {
        public void showMessage(){
            System.out.println("This is function of Non-static Inner Class!!");
        }
    }

    public void localClassExample(){
        class NonStaticLocalClass {
            public void showMessage (){
                System.out.println("This is show message function of Non-static Local Class");
            }
        }

        NonStaticLocalClass nonStaticNestedClass = new NonStaticLocalClass();
        nonStaticNestedClass.showMessage();
    }

    interface ShowMessageInterface{
        void showMessage();
    }

    abstract class ShowDefaultMessage{
        public abstract void showDefaultMessage();
    }

    public void anonymounsClassExample (){
        ShowMessageInterface showMessageInterface = new ShowMessageInterface() {
            @Override
            public void showMessage() {
                System.out.println("This is show message function of annonymous nested class!! (INTERFACE)");
            }
        };

        showMessageInterface.showMessage();
    }

    public void anonymousClassAbstractExample (){
        ShowDefaultMessage showDefaulMessage = new ShowDefaultMessage() {
            @Override
            public void showDefaultMessage() {
                System.out.println("This is show message function of annonymous nested class!! (ABSTRACT CLASS)");
            }
        };

        showDefaulMessage.showDefaultMessage();
    }

}
