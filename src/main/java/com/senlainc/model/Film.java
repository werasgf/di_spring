package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @ToString
public class Film {
    private Integer filmId;
    private String nameFilm;
    private Integer filmCompanyId;
    private Integer genreId;

    @Autowired
    public Film(Integer filmId, String nameFilm, Integer filmCompanyId, Integer genreId) {
        this.filmId = filmId;
        this.nameFilm = nameFilm;
        this.filmCompanyId = filmCompanyId;
        this.genreId = genreId;
    }
}
