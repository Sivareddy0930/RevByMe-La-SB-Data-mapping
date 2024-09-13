package com.projectJpa.SpringDataPractice.repository;

import com.projectJpa.SpringDataPractice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
