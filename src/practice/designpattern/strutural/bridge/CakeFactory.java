package practice.designpattern.strutural.bridge;

public class CakeFactory {
    public static Cake getCakeForEvent(String type, String event){
        Decorate decorate = event.equals("birthday") ? new BirthdayDecorate() : new CongratulationDecorate();

        if(type.equals("triangle")){
            return new TriangleCake(decorate);
        } else if (type.equals("circle")){
            return new CircleCake(decorate);
        } else if (type.equals("rectangle")){
            return new RectangleCake(decorate);
        } else {
            return null;
        }
    }
}
