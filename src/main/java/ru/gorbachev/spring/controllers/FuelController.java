package ru.gorbachev.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gorbachev.spring.service.Fuel;
import ru.gorbachev.spring.service.FuelMap;

import java.util.HashMap;

@Controller
@RequestMapping("/mvc/fuel")
public class FuelController {
    @Autowired
    private FuelMap fuelMap;

    @FuelExceptionHandler
    @GetMapping("/check")
    public String greet(@RequestParam("type") String param, Model model) throws Exception {
        model.addAttribute("message", fuelMap.getMap().get(param).powerUp());
        return "fuelType";
    }
}
