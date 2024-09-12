package com.projectJpa.SpringDataPractice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "author" ,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Book> book;
}
