package ru.gorbachev.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.ws.soap.Addressing;
import java.util.HashMap;
import java.util.Map;

@Component
public class FuelMap {
    HashMap<String, Fuel> fuelHashMap;

    {
        fuelHashMap = new HashMap<>();
        fuelHashMap.put("petrol", new PetrolFuel());
        fuelHashMap.put("diesel", new DieselFuel());
    }

    public HashMap<String, Fuel> getMap() {
        return fuelHashMap;
    }
}

