package org.example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component("midExam")
public class MidExam implements InterfaceAiubExam{

    @Value("${mid}")
    private String date;
    @Override
    public String examGoing() {
        Date date1= null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(this.date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(new Date().compareTo(date1) <= 0){
          return "Mid";
        }
        return null;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
