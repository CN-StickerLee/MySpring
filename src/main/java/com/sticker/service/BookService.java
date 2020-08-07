package com.sticker.service;

import com.sticker.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void save() {
        System.out.println("正在调用DAO");
        bookDao.saveBook();
    }
}
