package practice.designpattern.behavioral.chain_of_responsibility;

import practice.designpattern.behavioral.chain_of_responsibility.Student;

public class ChainOfResponsibilityExample {
    public static void main (String args[]){
        Student khanhTran = new Student("Khanh Tran");
        Student moiMoi = new Student("Moi Moi");
        Student beBong = new Student("Be Bong");
        Student cuOc = new Student("Cu Oc");

        khanhTran.setNextStudent(moiMoi);
        moiMoi.setNextStudent(beBong);
        beBong.setNextStudent(cuOc);


        khanhTran.process("Be Bong");
    }
}
