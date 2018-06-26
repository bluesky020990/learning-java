package practice.designpattern.behavioral.interpreter;

public class InterpresterClient {
    public DateInterpreterContext dic;

    public InterpresterClient(DateInterpreterContext dic) {
        this.dic = dic;
    }

    public String interpreter(String format, long timestamp){
        DateExpression expression = null;
        if(format.equals("dd/mm/yyyy")){
            expression = new VietNamDateExpression(timestamp);
        } else {
            expression = new EnglishDateExpression(timestamp);
        }

        return expression.interpreter(this.dic);
    }

    public static void main(String args[]){
        InterpresterClient ec = new InterpresterClient(new DateInterpreterContext());

        System.out.println(ec.interpreter("dd/mm/yyyy", System.currentTimeMillis()));

        System.out.println(ec.interpreter("mm/dd/yyyy", System.currentTimeMillis()));
    }
}
