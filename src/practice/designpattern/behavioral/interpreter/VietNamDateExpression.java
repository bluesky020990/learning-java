package practice.designpattern.behavioral.interpreter;

import java.util.Date;
import java.util.Timer;

public class VietNamDateExpression implements DateExpression {
    private long timestamp;

    public VietNamDateExpression(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String interpreter(DateInterpreterContext dic) {
        return dic.getVietNameseFormatDate(timestamp);
    }
}
