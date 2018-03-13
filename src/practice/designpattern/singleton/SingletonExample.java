package practice.designpattern.singleton;

public class SingletonExample {
    public static boolean isSingleTonIsCreated = false;

    //1. Khai bao 1 thực thể instance. Thực thể này là duy nhất trong toàn bộ hệ thống.
    private static SingletonExample instance;
    //Tao instance ngay khi vua load Class
    private static SingletonExample lazyLoadInstance;
    private static SingletonExample doubleCheckInstance;


    //2. Khai báo private constructor, để ngăn chặn các các lớp khác tạo nên Instance này.
    private SingletonExample(){

    }

    //3. Khai báo hàm getInstances. Hàm này sẽ quản lý việc tạo nên instance và đảm bảo chỉ có duy nhất 1 instance
    // trong hệ thống.
    public static SingletonExample getInstance(){
        if(instance == null){
            instance = new SingletonExample();
            isSingleTonIsCreated = true;
        }
        return instance;
    }


    //4. Các loại single ton

//    a. Eager - Load. Single ton được tạo ngay khi mà class được load.
    private static SingletonExample eagerLoadInstance = new SingletonExample();

    public static SingletonExample getEagerLoadSingleton (){
        return eagerLoadInstance;
    }


//    b. Lazy load với synchronized function
    public static synchronized SingletonExample getLazyLoadSingleton(){
        // chỉ tạo instance khi thực sự cần thiết
        // Hạn chế là trong multiple thread vẫn có thể xuất hiện 2 instance.

        if(lazyLoadInstance == null){
            lazyLoadInstance = new SingletonExample();
            isSingleTonIsCreated = true;
        }
        return lazyLoadInstance;
    }

//    c. Double Check LazyLoad function

    public static SingletonExample getDoubleCheckSynchronizedSingleton(){
        //i. sử dụng local variable để lưu volatile object nhằm tăng hiệu năng và đảm bảo hạn chế trường hợp  Lazy
        // SingletonExample
        SingletonExample result = doubleCheckInstance;
        if(result == null){                               // first check
            // synchronized ở đây để tăng hiệu năng.
            synchronized (SingletonExample.class){
                //ii.  kiểm tra 1 lần nữa trước khi khởi tạo. Đây cũng là lý do nó được gọi là double check.
                result = doubleCheckInstance;

                if(result == null){                      // second check **
                    // sau khi khởi tạo thì cập nhật lại giá trị result, thông báo cho các thread khác đang sử dụng
                    // nó biết được rằng, instance đã được tạo, nhằm tránh trường hợp vào điều kiện if thứ 2 (second
                    // check)
                    doubleCheckInstance = result = new SingletonExample();
                    isSingleTonIsCreated = true;
                }
            }
        }

        return result;
    }


    //    d. Lazy Holder
    // ban chat cua Lazy Holder la su dung cai Class Loader de dat duoc singleton don gian nhat va hieu qua nhat.
    // Dieu nay the hien ntn. Khi class LazyHolder duoc nap vao JVM, thi cai bien static final nay cua no se duoc khoi
    // tao gia tri. Va do do, trong moi truong multithread, cac thread khac van phai cho Class nay duoc load xong, nhung
    // khi no load xong thi no da co san instance o ben trong no roi.

    private static class LazyHolder {
        static final SingletonExample lazyHolderInstance = new SingletonExample();
    }

    public static SingletonExample getLazyHolderInstance() {
        return LazyHolder.lazyHolderInstance;
    }


    /* Other methods protected by singleton-ness */
    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}