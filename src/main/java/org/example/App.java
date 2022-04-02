package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        InterfaceAiubExam iMidExam = applicationContext.getBean("midExam", InterfaceAiubExam.class);
        InterfaceAiubExam iFinalExam = applicationContext.getBean("finalExam", InterfaceAiubExam.class);
        if(iMidExam.examGoing() !=null){
            System.out.println(iMidExam.examGoing());
        }
        else if(iFinalExam.examGoing()!=null){
            System.out.println(iFinalExam.examGoing());
        }
    }
}
