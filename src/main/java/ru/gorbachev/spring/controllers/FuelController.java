package ru.gorbachev.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gorbachev.spring.service.DieselFuel;
import ru.gorbachev.spring.service.Fuel;
import ru.gorbachev.spring.service.PetrolFuel;

@Controller
@RequestMapping("/mvc/fuel")
public class FuelController {


    @FuelExceptionHandler
    @GetMapping("/check")
    public String greet(@RequestParam("type") String param, Model model) throws Exception {
        Fuel fuel;
        switch (param) {
            case "diesel":
                fuel = new DieselFuel();
                break;
            case "petrol":
                fuel = new PetrolFuel();
                break;
            default:
                throw new Exception();
        }
        model.addAttribute("message", fuel.powerUp());
        return "fuelType";
    }
}
