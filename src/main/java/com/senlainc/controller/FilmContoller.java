package com.senlainc.controller;//package com.senlainc.controller;
//
//import com.senlainc.model.Film;
//import com.senlainc.service.FilmService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/film")
//@Component("filmContoller")
//public class FilmContoller {
//
//    @Autowired
//    private FilmService filmService;
//
//    @ResponseBody
//    @GetMapping(value = "/sayFilm")
//    public Film film() {
//        return new Film(2, " ", 2, 2);
//    }
//}
