package practice.designpattern.behavioral.template;

public abstract class CakeTemplate {
    protected abstract void nhaoBot();
    protected abstract void nuongBanh();
    protected abstract void trangTri();

    public final void makeACake(){
        nhaoBot();
        nuongBanh();
        trangTri();
    }
}
