package com.projectJpa.SpringDataPractice.controller;

import com.projectJpa.SpringDataPractice.dto.AuthorDto;
import com.projectJpa.SpringDataPractice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/create")
    public ResponseEntity<AuthorDto> createAuthor(AuthorDto authorDto){
        AuthorDto author = authorService.createAuthor(authorDto);
        return new ResponseEntity<>(author, HttpStatus.CREATED);
    }

}
