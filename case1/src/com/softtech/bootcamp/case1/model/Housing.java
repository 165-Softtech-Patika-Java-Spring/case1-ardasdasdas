package com.softtech.bootcamp.case1.model;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Housing {

    String id = UUID.randomUUID().toString();
    BigDecimal squareMeter;
    BigDecimal price;
    int roomNumber;
    int livingRoomNumber;

    public Housing(BigDecimal squareMeter, BigDecimal price, int roomNumber, int livingRoomNumber) {
        this.squareMeter = squareMeter;
        this.price = price;
        this.roomNumber = roomNumber;
        this.livingRoomNumber = livingRoomNumber;
    }

    public String getUniqueID() {
        return id;
    }

    public void setUniqueID(String id) {
        this.id = id;
    }

    public BigDecimal getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(BigDecimal squareMeter) {
        this.squareMeter = squareMeter;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getLivingRoomNumber() {
        return livingRoomNumber;
    }

    public void setLivingRoomNumber(int livingRoomNumber) {
        this.livingRoomNumber = livingRoomNumber;
    }
}
