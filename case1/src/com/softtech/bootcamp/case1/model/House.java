package com.softtech.bootcamp.case1.model;

import java.math.BigDecimal;

public class House extends Housing {

    public House(BigDecimal squareMeter, BigDecimal price, int roomNumber, int livingRoomNumber) {
        super(squareMeter, price, roomNumber, livingRoomNumber);
    }
}
