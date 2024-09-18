package com.projectJpa.SpringDataPractice.service.impl;

import com.projectJpa.SpringDataPractice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl {
    @Autowired
    private BookRepository bookRepository;
}
