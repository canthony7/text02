package com.work3;

import java.io.*;
import java.util.ArrayList;

public class Text01 {
    public static void main(String[] args) {

        //电影票1
        Movie movie1 = new Movie("疯狂的石头", MovieType.喜剧片);
        MovieSchedule movieSchedule1 = new MovieSchedule("放映厅1", "2010年7月12日 20时20分");
        Seat seat1 = new Seat(10, 12);
        Ticket ticket1 = new Ticket(movie1, movieSchedule1, seat1);

        //电影票2
        Movie movie2 = new Movie("疯狂的石头", MovieType.喜剧片);
        MovieSchedule movieSchedule2 = new MovieSchedule("放映厅1", "2010年7月12日 20时20分");
        Seat seat2 = new Seat(10, 13);
        Ticket ticket2 = new Ticket(movie2, movieSchedule2, seat2);

        //电影票3
        Movie movie3 = new Movie("2012", MovieType.科幻片);
        MovieSchedule movieSchedule3 = new MovieSchedule("放映厅2", "2010年7月14日 19时40分");
        Seat seat3 = new Seat(8, 8);
        Ticket ticket3 = new Ticket(movie3, movieSchedule3, seat3);

        //电影票4
        Movie movie4 = new Movie("2012", MovieType.科幻片);
        MovieSchedule movieSchedule4 = new MovieSchedule("放映厅2", "2010年7月14日 19时40分");
        Seat seat4 = new Seat(18, 9);
        Ticket ticket4 = new Ticket(movie4, movieSchedule4, seat4);

        ArrayList<Ticket> tickets= new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);

        try {
            //导出
            FileOutputStream fos = new FileOutputStream("Movie.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tickets);

            //导入
            FileInputStream fis = new FileInputStream("Movie.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Ticket> tickets1 = new ArrayList<>((ArrayList)ois.readObject());

            //遍历输出
            for(Ticket ticket: tickets1){
                ticket.printTicket();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
