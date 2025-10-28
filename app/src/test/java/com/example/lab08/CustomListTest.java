package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> mockCityList() {
        ArrayList<City> cityList = new ArrayList<City>();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }


    void testHasCity(){
        ArrayList<City> cityList = mockCityList();

        City city = new City("Langley", "British Columbia");
        cityList.add(city);

        assertTrue(cityList.hasCity(city));
        assertFalse(cityList.hasCity(new City("Calgary", "Alberta")));

    }
}
