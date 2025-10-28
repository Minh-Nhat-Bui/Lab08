package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList mockCityList() {
        CustomList cityList = new CustomList();
        cityList.addCity(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }


    void testHasCity(){
        CustomList cityList = mockCityList();

        City city = new City("Langley", "British Columbia");
        cityList.addCity(city);

        assertTrue(cityList.hasCity(city));
        assertFalse(cityList.hasCity(new City("Calgary", "Alberta")));

    }
}
