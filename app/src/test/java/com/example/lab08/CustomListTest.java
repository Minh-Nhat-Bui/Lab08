package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList mockCityList() {
        return new CustomList();
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testHasCity() {
        CustomList cityList = mockCityList();
        City city = new City("Langley", "British Columbia");
        cityList.addCity(city);

        assertTrue(cityList.hasCity(city));
        assertFalse(cityList.hasCity(new City("Calgary", "Alberta")));
    }

    @Test
    void testDelete() {
        CustomList cityList = mockCityList();
        City city = new City("Langley", "BC");
        cityList.addCity(city);

        cityList.delete(city);

        assertFalse(cityList.hasCity(city));
    }

    void testCountCities() {
        CustomList cityList = mockCityList();
        City city = new City("Edmonton", "Alberta");
        cityList.addCity(city);

        cityList.addCity(city);

        assertEquals(2, cityList.countCity);
    }

}
