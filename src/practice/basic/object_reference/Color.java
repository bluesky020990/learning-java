package practice.basic.object_reference;

public class Color {
    private String color;
    private Color subColor;

    Color(String color){
        this.color = color;
    }

    public Color(String color, Color subColor) {
        this.color = color;
        this.subColor = subColor;
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

    public Color getSubColor() {
        return subColor;
    }

    public void setSubColor(Color subColor) {
        this.subColor = subColor;
    }
}
