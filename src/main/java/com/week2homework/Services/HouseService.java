package com.week2homework.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.week2homework.Model.*;
import com.week2homework.Repository.*;
public class HouseService {
    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    private double calculateTotalPrice(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getPrice).sum();
    }

    private double calculateAverageSize(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getTotalPriceOfRegularHouses() {
        return calculateTotalPrice(repository.getRegularHouses());
    }

    public double getTotalPriceOfVillas() {
        return calculateTotalPrice(repository.getVillas());
    }

    public double getTotalPriceOfSummerHouses() {
        return calculateTotalPrice(repository.getSummerHouses());
    }

    public double getTotalPriceOfAllHouses() {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(repository.getRegularHouses());
        allHouses.addAll(repository.getVillas());
        allHouses.addAll(repository.getSummerHouses());
        return calculateTotalPrice(allHouses);
    }

    public double getAverageSizeOfRegularHouses() {
        return calculateAverageSize(repository.getRegularHouses());
    }

    public double getAverageSizeOfVillas() {
        return calculateAverageSize(repository.getVillas());
    }

    public double getAverageSizeOfSummerHouses() {
        return calculateAverageSize(repository.getSummerHouses());
    }

    public double getAverageSizeOfAllHouses() {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(repository.getRegularHouses());
        allHouses.addAll(repository.getVillas());
        allHouses.addAll(repository.getSummerHouses());
        return calculateAverageSize(allHouses);
    }

    public List<House> filterHousesByRoomsAndLivingRooms(int rooms, int livingRooms) {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(repository.getRegularHouses());
        allHouses.addAll(repository.getVillas());
        allHouses.addAll(repository.getSummerHouses());
        return allHouses.stream()
                .filter(h -> h.getRooms() == rooms && h.getLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }
}