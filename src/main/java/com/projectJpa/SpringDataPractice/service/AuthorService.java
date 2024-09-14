package com.projectJpa.SpringDataPractice.service;

import com.projectJpa.SpringDataPractice.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

    AuthorDto createAuthor(AuthorDto authorDto);

    AuthorDto getAuthor(Long authorId);

    List<AuthorDto> getAllAuthor();

    String deleteAuthor(Long authorId);


}
