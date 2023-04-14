package com.senlainc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@AllArgsConstructor
public class FilmCompany {
    private Integer filmCompanyId;
    private String nameFilmCompany;
}