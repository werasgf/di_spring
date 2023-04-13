package com.senlainc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@AllArgsConstructor
public class Genre {
    private Integer genreId;
    private String genre;
}
