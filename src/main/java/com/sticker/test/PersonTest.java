package com.sticker.test;

import com.sticker.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    public void test01() {

        //Person person = (Person) applicationContext.getBean("person02");

        //Person person = (Person) applicationContext.getBean(Person.class);

        Person person = (Person) applicationContext.getBean("person03");

        System.out.println(person);
    }

}
