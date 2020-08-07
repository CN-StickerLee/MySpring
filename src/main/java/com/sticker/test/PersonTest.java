package com.sticker.test;

import com.sticker.dao.BookDao;
import com.sticker.pojo.Person;
import com.sticker.service.BookService;
import com.sticker.servlet.BookServlet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:ioc.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonTest {

    //private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");

    @Autowired
    BookService bookService;

    @Test
    public void test02() {

        System.out.println(bookService);
//        BookDao bookDao = applicationContext.getBean(BookDao.class);
//        System.out.println(bookDao);
//
//        BookServlet bookServlet = applicationContext.getBean(BookServlet.class);
//        bookServlet.doGet();
    }


    @Test
    public void test01() {



        //Person person = (Person) applicationContext.getBean("person02");

        //Person person = (Person) applicationContext.getBean(Person.class);

//        Person person = (Person) applicationContext.getBean("person03");

        //System.out.println(person);

//        Object bean = applicationContext.getBean("bookDao");
//        Object bean2 = applicationContext.getBean("bookDao");
//
//        Object bean3 = applicationContext.getBean("nihao");
//        System.out.println(bean==bean2);
//
//        System.out.println(bean3);

    }

}
