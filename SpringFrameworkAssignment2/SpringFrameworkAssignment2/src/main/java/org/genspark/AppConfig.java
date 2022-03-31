package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    public Student getStudent(){
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Phone phone1 = getPhone();
        Phone phone2 = getPhone();
        Phone phone3 = getPhone();
        phone1.setMob("123");
        phone2.setMob("456");
        phone3.setMob("789");
        phoneArrayList.add(phone1);
        phoneArrayList.add(phone2);
        phoneArrayList.add(phone3);
        Student s = new Student();
        s.setId(5);
        s.setName("TestStudent");
        s.setPh(phoneArrayList);
        return s;
    }

    @Bean
    public Address getAddress(){
        return new Address("provo", "ut", "usa", "84601");
    }

    @Bean
    public Phone getPhone(){
        return new Phone();
    }



}
