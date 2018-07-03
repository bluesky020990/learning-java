package practice.designpattern.behavioral.observer;

public interface Subject {

    //regiter mot object nao do vao danh sach observer cua no
    public void register(Observer obj);

    //un-regiter mot object nao do ra khoi danh sach observer cua no
    public void unregister(Observer obj);


    // call the function when have a update.
    public void notifyObservers();
}
