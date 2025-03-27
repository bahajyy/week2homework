package com.week2homework.Repository;

import java.util.ArrayList;
import com.week2homework.Model.*;
import java.util.List;

public class HouseRepository {
    private List<NormalHouse> normalHouses = new ArrayList<>();
    private List<Villa> villas = new ArrayList<>();
    private List<SummerHouse> summerHouses = new ArrayList<>();

    public HouseRepository() {
        normalHouses.add(new NormalHouse(100000, 120, 3, 1));
        normalHouses.add(new NormalHouse(150000, 140, 4, 1));
        normalHouses.add(new NormalHouse(200000, 160, 5, 2));

        villas.add(new Villa(300000, 250, 5, 2));
        villas.add(new Villa(500000, 350, 6, 3));
        villas.add(new Villa(700000, 450, 7, 3));

        summerHouses.add(new SummerHouse(200000, 150, 3, 1));
        summerHouses.add(new SummerHouse(250000, 180, 4, 2));
        summerHouses.add(new SummerHouse(300000, 200, 5, 2));
    }

    public List<NormalHouse> getRegularHouses() {
        return normalHouses;
    }

    public List<Villa> getVillas() {
        return villas;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }
}