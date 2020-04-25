package com.work3;

import java.io.Serializable;

public class Movie implements Serializable {
    String movieName;
    MovieType movieType;

    public Movie(){

    }

    public Movie(String movieName, MovieType movieType) {
        this.movieName = movieName;
        this.movieType = movieType;
    }
}
