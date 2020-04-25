package com.work3;

import java.io.Serializable;

public class Ticket implements Serializable {
    Movie movie;
    MovieSchedule movieSchedule;
    Seat seat;

    public Ticket(){

    }

    public Ticket(Movie movie, MovieSchedule movieSchedule, Seat seat) {
        this.movie = movie;
        this.movieSchedule = movieSchedule;
        this.seat = seat;
    }

    public void printTicket(){
        System.out.println(this.movie.movieName);
        System.out.println("类型：" + this.movie.movieType);
        System.out.println("放映厅：" + this.movieSchedule.room);
        System.out.println("时间：" + this.movieSchedule.time);
        System.out.println("座位：" + this.seat.row + "排" + this.seat.column + "座");
        System.out.println("***********************************************");
    }
}
