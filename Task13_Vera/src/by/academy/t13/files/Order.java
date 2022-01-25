package by.academy.t13.files;

import java.time.LocalDate;

public class Order{
    private int id;
    private LocalDate date;
    private String productId;


    public Order() {
    }

    public Order(int id, LocalDate date, String productId) {
        this.id = id;
        this.date = date;
        this.productId = productId;

    }
        @Override
    public String toString() {
        return  id + ":" + date + ":"+productId ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
