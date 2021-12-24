package com.asd.back.Domain;

import java.util.Date;

public class Multiplication {
    private int id;
    private Date dateCreate;
    private long numberOne;
    private long numberTwo;
    private long result;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public Date getDateCreate() {return dateCreate;}
    public void setDateCreate(Date dateCreate) {this.dateCreate = dateCreate;}

    public long getNumberOne() {return numberOne;}
    public void setNumberOne(long numberOne) {this.numberOne = numberOne;}

    public long getNumberTwo() {return numberTwo;}
    public void setNumberTwo(long numberTwo) {this.numberTwo = numberTwo;}

    public long getResult() {return result;}
    public void setResult(long result) {this.result = result;}
}
