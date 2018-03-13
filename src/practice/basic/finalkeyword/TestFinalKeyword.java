package practice.basic.finalkeyword;

public class TestFinalKeyword {
    // tu khoa final khai bao mot gia tri bat di bat dich khi object duoc khoi tao.
    public final String company = "Ban Vien";

    // day la mot blank final variable, gia tri cua no ko duoc init tai thoi diem khai bao, ma bi dua vao trong
    // constructor. Mot blank final value luon nam trong constructor;
    public final Long employeeId;


    // day la mot static blank final keyword. No ko duoc init gia tri vao thoi diem nay, ma no se duoc dua vao trong
    // static method.
    private static final TestFinalKeyword finalKeyword;

    // static method cua cai static final kia day.
    static{
        finalKeyword = new TestFinalKeyword(1000l);
    }



    public TestFinalKeyword(Long employeeId) {
        this.employeeId = employeeId;
    }


}
