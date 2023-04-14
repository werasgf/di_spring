package com.senlainc.starter;

import com.senlainc.config.MyConfig;
import com.senlainc.model.Film;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Film film = getFilmFromJavaConfig();

        System.out.println(film);
    }

    private static Film getFilmFromJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        return context.getBean(Film.class);
    }
}