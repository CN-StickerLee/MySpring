package com.sticker.dao;


import org.springframework.stereotype.Repository;

@Repository
public class BookDao {


    public void saveBook() {
        System.out.println("图书保存成功");
    }
}
