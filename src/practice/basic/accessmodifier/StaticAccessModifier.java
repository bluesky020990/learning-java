package practice.basic.accessmodifier;

public class StaticAccessModifier {
    static String message;

    private boolean active;

    private Boolean activeObject;

    static {
        message = "It's default message !!!";
    }

    static void showMessage(){
        System.out.println("This is show message" + message);
    }

    static void showMessageOfClass(String newMessage){
        message = newMessage;
        showMessage();
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Boolean getActiveObject() {
        return activeObject;
    }

    public void setActiveObject(Boolean activeObject) {
        this.activeObject = activeObject;
    }

    public static void main(String args[]){
        StaticAccessModifier staticAccessModifier = new StaticAccessModifier();
        staticAccessModifier.setActive(true);
        staticAccessModifier.setActiveObject(true);

        System.out.println(staticAccessModifier.getActive());
        System.out.println(staticAccessModifier.getActiveObject().hashCode());
    }
}
