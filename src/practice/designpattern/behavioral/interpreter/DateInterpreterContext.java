package practice.designpattern.behavioral.interpreter;

import java.util.Date;

public class DateInterpreterContext {

    private static String[] MONTH_BY_CHARACTER_VI = {"Thang 1", "Thang 2", "Thang 3", "Thang 4", "Thang 5", "Thang 6", "Thang 7", "Thang 8", "Thang 9", "Thang 10", "Thang 11", "Thang 12"};
    private static String[] MONTH_BY_CHARACTER_EN = {"Jan", "Feb", "March", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


    String getVietNameseFormatDate(Long timestamp){
        Date date = new Date(timestamp);
        return date.getDate() + "/" +  MONTH_BY_CHARACTER_VI[date.getMonth() - 1] + "/" + date.getYear();
    }

    String getEnglishFormatDate(Long timestamp){
        Date date = new Date(timestamp);
        return MONTH_BY_CHARACTER_EN[date.getMonth() - 1] + "/" + date.getDate() + "/" + date.getYear();
    }
}
