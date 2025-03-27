package com.week2homework;

import com.week2homework.Repository.HouseRepository;
import com.week2homework.Services.*;

public class Main {
    public static void main(String[] args) {

        HouseRepository houseRepository = new HouseRepository();
        HouseService houseService = new HouseService(houseRepository);

        System.out.println("Total price of regular houses: $" + houseService.getTotalPriceOfRegularHouses());
        System.out.println("Total price of villas: $" + houseService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: $" + houseService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all houses: $" + houseService.getTotalPriceOfAllHouses());

        System.out.println("Average size of regular houses: " + houseService.getAverageSizeOfRegularHouses() + " sqm");
        System.out.println("Average size of villas: " + houseService.getAverageSizeOfVillas() + " sqm");
        System.out.println("Average size of summer houses: " + houseService.getAverageSizeOfSummerHouses() + " sqm");
        System.out.println("Average size of all houses: " + houseService.getAverageSizeOfAllHouses() + " sqm");

        System.out.println("Filtered houses with 3 rooms and 1 living room: " + houseService.filterHousesByRoomsAndLivingRooms(3, 1));
      
    }
}