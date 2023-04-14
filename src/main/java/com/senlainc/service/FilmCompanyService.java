package com.senlainc.service;

import com.senlainc.repository.FilmCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmCompanyService {
    @Autowired
    private FilmCompanyRepository filmCompanyRepository;
}
