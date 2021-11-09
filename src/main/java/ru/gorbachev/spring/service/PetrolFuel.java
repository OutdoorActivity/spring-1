package ru.gorbachev.spring.service;

import org.springframework.stereotype.Component;

@Component
public class PetrolFuel implements Fuel {

    @Override
    public String powerUp() {
        return "petrol info";
    }

    @Override
    public String getName() {
        return "petrol";
    }
}
