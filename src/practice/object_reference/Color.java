package practice.object_reference;

public class Color {
    private String color;

    Color(String color){
        this.color = color;
    }

    public String toString(){
        return "Color of object is " + this.color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
