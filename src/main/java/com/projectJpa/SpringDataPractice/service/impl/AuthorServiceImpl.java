package com.projectJpa.SpringDataPractice.service.impl;

import com.projectJpa.SpringDataPractice.dto.AuthorDto;
import com.projectJpa.SpringDataPractice.entity.Author;
import com.projectJpa.SpringDataPractice.repository.AuthorRepository;
import com.projectJpa.SpringDataPractice.service.AuthorService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private static final Logger logger= LoggerFactory.getLogger(AuthorServiceImpl.class);

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public AuthorDto createAuthor(AuthorDto authorDto) {
        Author author = modelMapper.map(authorDto, Author.class);
        Author savedAuthor = authorRepository.save(author);
        return modelMapper.map(savedAuthor,AuthorDto.class);
    }

    @Override
    public AuthorDto getAuthor(Long authorId) {
        return null;
    }

    @Override
    public List<AuthorDto> getAllAuthor() {
        return List.of();
    }

    @Override
    public String deleteAuthor(Long authorId) {
        return "";
    }
}
