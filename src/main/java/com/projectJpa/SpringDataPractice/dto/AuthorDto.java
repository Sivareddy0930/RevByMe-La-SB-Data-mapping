package com.projectJpa.SpringDataPractice.dto;

import com.projectJpa.SpringDataPractice.entity.Book;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private Long id;
    private String name;
    private List<Book> book;
}
