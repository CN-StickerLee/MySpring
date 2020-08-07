package com.sticker.servlet;

import com.sticker.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookServlet {

    //自动装配：自动为这个属性（类的变量）赋值
    //不需要new了 不需要定义Getter和Setter方法
    @Autowired
    private BookService bookService;

    public void doGet() {
        System.out.println("正在调用SERVICE");
        bookService.save();
    }

}
