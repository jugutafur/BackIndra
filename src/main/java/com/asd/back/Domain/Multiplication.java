package com.asd.back.Domain;

import java.math.BigInteger;
import java.util.Date;

public class Multiplication {
    private int id;
    private Date dateCreate;
    private BigInteger numberOne;
    private BigInteger numberTwo;
    private BigInteger result;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public Date getDateCreate() {return dateCreate;}
    public void setDateCreate(Date dateCreate) {this.dateCreate = dateCreate;}

    public BigInteger getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(BigInteger numberOne) {
        this.numberOne = numberOne;
    }

    public BigInteger getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(BigInteger numberTwo) {
        this.numberTwo = numberTwo;
    }

    public BigInteger getResult() {
        return result;
    }

    public void setResult(BigInteger result) {
        this.result = result;
    }
}
