package ru.gorbachev.spring.service;

import org.springframework.stereotype.Component;

@Component
public class DieselFuel implements Fuel {


    @Override
    public String powerUp() {
        return "diesel info";
    }
@Override
    public String getName() {
        return "diesel";
    }

}
