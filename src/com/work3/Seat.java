package com.work3;

import java.io.Serializable;

public class Seat implements Serializable {
    int row;
    int column;

    public Seat(){

    }

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
