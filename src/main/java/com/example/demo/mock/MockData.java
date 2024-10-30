package com.example.demo.mock;

import com.example.demo.generated.model.Beverage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MockData {
    public static List<Beverage> getMockBeverageList(){

        List<Beverage> mockData = new ArrayList<>();

        mockData.add(new Beverage().id(new UUID(1, 1)).brandId(1).description("Coca Cola").labelId(new UUID(1, 2)).containerTypeId(new UUID(1, 3)).ingredients(new ArrayList<UUID>()).links(new ArrayList<>()));
        mockData.add(new Beverage().id(new UUID(2, 1)).brandId(2).description("Pepsi").labelId(new UUID(2, 2)).containerTypeId(new UUID(2, 3)).ingredients(new ArrayList<UUID>()).links(new ArrayList<>()));
        mockData.add(new Beverage().id(new UUID(3, 1)).brandId(3).description("Fanta").labelId(new UUID(3, 2)).containerTypeId(new UUID(3, 3)).ingredients(new ArrayList<UUID>()).links(new ArrayList<>()));
        mockData.add(new Beverage().id(new UUID(4, 1)).brandId(4).description("Sprite").labelId(new UUID(4, 2)).containerTypeId(new UUID(4, 3)).ingredients(new ArrayList<UUID>()).links(new ArrayList<>()));
        mockData.add(new Beverage().id(new UUID(5, 1)).brandId(5).description("7up").labelId(new UUID(5, 2)).containerTypeId(new UUID(5, 3)).ingredients(new ArrayList<UUID>()).links(new ArrayList<>()));

        return mockData;

    }
}
