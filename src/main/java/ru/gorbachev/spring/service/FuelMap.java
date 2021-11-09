package ru.gorbachev.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.ws.soap.Addressing;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class FuelMap {
    @Autowired
    private List<Fuel> fuelList;

    public Map<String, Fuel> getMap() {
        return fuelList.stream().collect(Collectors.toMap(Fuel::getName, value -> value));
    }
}

