package com.softtech.bootcamp.case1.repository;

import com.softtech.bootcamp.case1.model.House;
import com.softtech.bootcamp.case1.model.Housing;
import com.softtech.bootcamp.case1.model.SummerHouse;
import com.softtech.bootcamp.case1.model.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HousingRepository {

    private List<Housing> houseList = new ArrayList<>();
    private List<Housing> villaList = new ArrayList<>();
    private List<Housing> summerHouseList = new ArrayList<>();

    public List<Housing> getHouseList() { return houseList; }

    public void setHouseList(List<Housing> houseList) {
        this.houseList = houseList;
    }

    public List<Housing> getVillaList() {
        return villaList;
    }

    public void setVillaList(List<Housing> villaList) {
        this.villaList = villaList;
    }

    public List<Housing> getSummerHouseList() {
        return summerHouseList;
    }

    public void setSummerHouseList(List<Housing> summerHouseList) {
        this.summerHouseList = summerHouseList;
    }

    public List<Housing> getHousings(){
        List<Housing> housingList = new ArrayList<>();
        housingList.addAll(getHouseList());
        housingList.addAll(getVillaList());
        housingList.addAll(getSummerHouseList());
        return housingList;
    }
    public void setDummyHousings(int count){
        for(int i = 0; i < count; i++){
            houseList.add(new House(new BigDecimal(50 + i), new BigDecimal(200), 5, 2));
            villaList.add(new Villa(new BigDecimal(50 * i), new BigDecimal(500), 5, 2));
            summerHouseList.add(new SummerHouse(new BigDecimal(100 * i), new BigDecimal(800), 7, 3));
        }
    }

}
