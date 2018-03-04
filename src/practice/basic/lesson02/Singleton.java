package practice.basic.lesson02;

public class Singleton {
    public static boolean isSingleTonIsCreated = false;

    //1. Khai bao 1 thực thể instance. Thực thể này là duy nhất trong toàn bộ hệ thống.
    private static Singleton instance;
    //Tao instance ngay khi vua load Class
    private static Singleton lazyLoadInstance;
    private static Singleton doubleCheckInstance;
    private static Singleton lazyHolderInstance;


    //2. Khai báo private constructor, để ngăn chặn các các lớp khác tạo nên Instance này.
    private Singleton(){

    }

    //3. Khai báo hàm getInstances. Hàm này sẽ quản lý việc tạo nên instance và đảm bảo chỉ có duy nhất 1 instance
    // trong hệ thống.
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            isSingleTonIsCreated = true;
        }
        return instance;
    }


    //4. Các loại single ton

//    a. Eager - Load. Single ton được tạo ngay khi mà class được load.
    private static Singleton eagerLoadInstance = new Singleton();

    public static Singleton getEagerLoadSingleton (){
        return eagerLoadInstance;
    }


//    b. Lazy load với synchronized function
    public static synchronized Singleton getLazyLoadSingleton(){
        // chỉ tạo instance khi thực sự cần thiết
        // Hạn chế là trong multiple thread vẫn có thể xuất hiện 2 instance.

        if(lazyLoadInstance == null){
            lazyLoadInstance = new Singleton();
            isSingleTonIsCreated = true;
        }
        return lazyLoadInstance;
    }

//    c. Double Check LazyLoad function

    public static Singleton getDoubleCheckSynchronizedSingleton(){
        //i. sử dụng local variable để lưu volatile object nhằm tăng hiệu năng và đảm bảo hạn chế trường hợp  Lazy
        // Singleton
        Singleton result = doubleCheckInstance;
        if(result == null){                               // first check
            // synchronized ở đây để tăng hiệu năng.
            synchronized (Singleton.class){
                //ii.  kiểm tra 1 lần nữa trước khi khởi tạo. Đây cũng là lý do nó được gọi là double check.
                result = doubleCheckInstance;

                if(result == null){                      // second check **
                    // sau khi khởi tạo thì cập nhật lại giá trị result, thông báo cho các thread khác đang sử dụng
                    // nó biết được rằng, instance đã được tạo, nhằm tránh trường hợp vào điều kiện if thứ 2 (second
                    // check)
                    doubleCheckInstance = result = new Singleton();
                    isSingleTonIsCreated = true;
                }
            }
        }

        return result;
    }


//    d. Lazy Holder
    private static class LazyHolder {
        static final Singleton lazyHolderInstance = new Singleton();
    }

    public static Singleton getLazyHolderInstance() {
        return LazyHolder.lazyHolderInstance;
    }


    /* Other methods protected by singleton-ness */
    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}