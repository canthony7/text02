package com.work3;

import java.io.Serializable;

public class MovieSchedule implements Serializable {
    String room;
    String time;

    public MovieSchedule(){

    }

    public MovieSchedule(String room, String time) {
        this.room = room;
        this.time = time;
    }
}
