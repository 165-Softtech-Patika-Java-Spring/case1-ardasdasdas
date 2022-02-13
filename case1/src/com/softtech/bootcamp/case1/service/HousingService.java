package com.softtech.bootcamp.case1.service;

import com.softtech.bootcamp.case1.model.House;
import com.softtech.bootcamp.case1.model.Housing;
import com.softtech.bootcamp.case1.repository.HousingRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HousingService {

    private HousingRepository housingRepository = new HousingRepository();
    private List<Housing> houseList;
    private List<Housing> villaList;
    private List<Housing> summerHouseList;

    public HousingService(int count){
        housingRepository.setDummyHousings(count);
        houseList = housingRepository.getHouseList();
        villaList = housingRepository.getVillaList();
        summerHouseList = housingRepository.getSummerHouseList();
    }

    public BigDecimal getTotalHousesPrice(){
        BigDecimal totalHousesPrice = BigDecimal.ZERO;
        for(Housing house : houseList){
            totalHousesPrice = totalHousesPrice.add(house.getPrice());
        }
        return totalHousesPrice;
    }

    public BigDecimal getTotalVillasPrice(){
        BigDecimal totalVillasPrice = BigDecimal.ZERO;
        for(Housing villa : villaList){
            totalVillasPrice = totalVillasPrice.add(villa.getPrice());
        }
        return totalVillasPrice;
    }

    public BigDecimal getTotalSummerHousesPrice(){
        BigDecimal totalSummerHousesPrice = BigDecimal.ZERO;
        for(Housing summerHouse : summerHouseList){
            totalSummerHousesPrice = totalSummerHousesPrice.add(summerHouse.getPrice());
        }
        return totalSummerHousesPrice;
    }

    public BigDecimal getHousingsPrice(){
        BigDecimal totalHousingsPrice = BigDecimal.ZERO;
        totalHousingsPrice = totalHousingsPrice.add(getTotalHousesPrice());
        totalHousingsPrice = totalHousingsPrice.add(getTotalVillasPrice());
        totalHousingsPrice = totalHousingsPrice.add(getTotalSummerHousesPrice());
        return totalHousingsPrice;
    }

    public BigDecimal getTotalHousesSquareMeter(){
        BigDecimal totalHousesSquareMeter = BigDecimal.ZERO;
        for(Housing house : houseList){
            totalHousesSquareMeter = totalHousesSquareMeter.add(house.getSquareMeter());
        }
        return totalHousesSquareMeter;
    }

    public BigDecimal getTotalVillasSquareMeter(){
        BigDecimal totalVillasSquareMeter = BigDecimal.ZERO;
        for(Housing villa : villaList){
            totalVillasSquareMeter = totalVillasSquareMeter.add(villa.getSquareMeter());
        }
        return totalVillasSquareMeter;
    }

    public BigDecimal getTotalSummerHousesSquareMeter(){
        BigDecimal totalSummerHousesSquareMeter = BigDecimal.ZERO;
        for(Housing summerHouse : summerHouseList){
            totalSummerHousesSquareMeter = totalSummerHousesSquareMeter.add(summerHouse.getSquareMeter());
        }
        return totalSummerHousesSquareMeter;
    }

    public BigDecimal getHousesAverageSquareMeter(){
        BigDecimal divisor = new BigDecimal(houseList.size());
        BigDecimal averageHousesSquareMeter = getTotalHousesSquareMeter();
        averageHousesSquareMeter = averageHousesSquareMeter.divide(divisor);
        return averageHousesSquareMeter;
    }

    public BigDecimal getVillasAverageSquareMeter(){
        BigDecimal divisor = new BigDecimal(villaList.size());
        BigDecimal averageVillasSquareMeter = getTotalVillasSquareMeter();
        averageVillasSquareMeter = averageVillasSquareMeter.divide(divisor);
        return averageVillasSquareMeter;
    }

    public BigDecimal getSummerHousesAverageSquareMeter(){
        BigDecimal divisor = new BigDecimal(summerHouseList.size());
        BigDecimal averageSummerHousesSquareMeter = getTotalSummerHousesSquareMeter();
        averageSummerHousesSquareMeter = averageSummerHousesSquareMeter.divide(divisor);
        return averageSummerHousesSquareMeter;
    }

    public List<Housing> filterHousingsByRoomAndLivingRoom(Integer roomNumber, Integer livingRoomNumber) {
        List<Housing> filteredHousingList =  new ArrayList<>();
        List<Housing> housingList = housingRepository.getHousings();
        if (!housingList.isEmpty()){
            filteredHousingList = housingList.stream()
                    .filter(housing -> housing.getRoomNumber() == roomNumber && housing.getLivingRoomNumber() == livingRoomNumber)
                    .collect(Collectors.toList());
        }
        return filteredHousingList;
    }

}
