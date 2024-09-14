package com.projectJpa.SpringDataPractice.dto;

import com.projectJpa.SpringDataPractice.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Long id;
    private String title;
    private String isbn;
    private Author author;
}
