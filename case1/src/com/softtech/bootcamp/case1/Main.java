package com.softtech.bootcamp.case1;

import com.softtech.bootcamp.case1.model.Housing;
import com.softtech.bootcamp.case1.service.HousingService;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HousingService housingService = new HousingService(3);

        BigDecimal totalHousesPrice = housingService.getTotalHousesPrice();
        System.out.println("Total Price Of Houses is " + totalHousesPrice);

        BigDecimal totalVillasPrice = housingService.getTotalVillasPrice();
        System.out.println("Total Price Of Villas is " + totalVillasPrice);

        BigDecimal totalSummerHousesPrice = housingService.getTotalSummerHousesPrice();
        System.out.println("Total Price Of Summer Houses is " + totalSummerHousesPrice);

        BigDecimal totalHousingsPrice = housingService.getHousingsPrice();
        System.out.println("Total Price Of Housings is " + totalHousingsPrice);

        System.out.println("----------------------------------------------------------------------");

        BigDecimal averageHousesSquareMeter = housingService.getHousesAverageSquareMeter();
        System.out.println("Total Average Square Meters Of Houses is " + averageHousesSquareMeter);

        BigDecimal averageVillasSquareMeter = housingService.getVillasAverageSquareMeter();
        System.out.println("Total Average Square Meters Of Villas is " + averageVillasSquareMeter);

        BigDecimal averageSummerHousesSquareMeter = housingService.getSummerHousesAverageSquareMeter();
        System.out.println("Total Average Square Meters Of Summer Houses is " + averageSummerHousesSquareMeter);

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Result Of Filter According To Room And Living Room Number");
        List<Housing> filteredHousingList = housingService.filterHousingsByRoomAndLivingRoom(5, 2);
        filteredHousingList.forEach(housing ->
                System.out.println(
                        "***************************************" +
                        "\nHousing id " + housing.getUniqueID() +
                        "\nHousing price " + housing.getPrice() +
                        "\nHousing " + housing.getSquareMeter()
                ));

    }
}
