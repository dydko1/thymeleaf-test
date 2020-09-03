package com.dydko.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String get(Model model) {
        Car car = new Car("Renault1", "Megane1");
        model.addAttribute("car", car);
        return "hello";
    }
}
