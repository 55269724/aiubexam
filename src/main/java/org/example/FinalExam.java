package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component("finalExam")
public class FinalExam implements InterfaceAiubExam{
    @Value("${final}")
    private String date;
    @Override
        public String examGoing() {
        Date date1=null;
        try {
             date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(new Date().compareTo(date1) >= 0){
                return "Final";
            }
            return null;
        }
    public void setDate(String date) {
        this.date = date;
    }
}
