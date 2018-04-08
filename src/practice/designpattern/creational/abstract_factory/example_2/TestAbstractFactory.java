package practice.designpattern.creational.abstract_factory.example_2;


public class TestAbstractFactory {

    // Trong mo hinh nay, ta se xay dung mot Abstract Factory de tao ra cac loai xe gan may.

    // Giả sử mỗi xe máy được xây dựng từ 2 bộ phận cho đơn giản : động cơ và màu xe.

    // Bây giờ ta sẽ xây dựng 2 đối tượng, 1 đối tượng sirius màu xám đen với động cơ 115cc và một cái exciter với động cơ 150 và màu đỏ.

    // Step 1. Ta xây dựng các Factory cho Động cơ và Màu sơn.

    // Step 2. Ta xây dựng một AbstractProduct, đại diện cho mỗi cái xe. Trong này nó sẽ có 2 đối tượng là động cơ và màu xe.

    // Step 3. Ta xây dựng 2 Concrete Factory  Sirius và Exciter, tại đây chính là SiriusProducer và ExciterProducer dựa trên abstract MotobikeAbstractFactory

    // Step 4. Có nhà máy sản xuất rồi, chạy thôi.


    public static void main(String args[]){
        SiriusProducer siriusProducer = new SiriusProducer();
        ExciterProducer exciterProducer = new ExciterProducer();
        HybridProducer hybridProducer = new HybridProducer();


        MotobikeProduct sirius = siriusProducer.createMotobike();
        MotobikeProduct exciter = exciterProducer.createMotobike();
        MotobikeProduct hybrid = hybridProducer.createMotobike();

        sirius.show();
        exciter.show();
        hybrid.show();
    }
}
