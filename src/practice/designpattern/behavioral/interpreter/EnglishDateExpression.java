package practice.designpattern.behavioral.interpreter;

public class EnglishDateExpression implements DateExpression{
    private Long timestamp;

    public EnglishDateExpression(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String interpreter(DateInterpreterContext dic) {
       return dic.getEnglishFormatDate(timestamp);
    }
}
