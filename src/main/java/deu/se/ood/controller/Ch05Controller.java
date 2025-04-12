/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author 915-14
 */
@Controller
@Slf4j
public class Ch05Controller {
    @GetMapping("/ch05/eltest")
    public String ch05() {
        return "ch05/eltest/index";
    }
    
    @GetMapping("/ch05/elimplicitobject")
    public String elimplicitobject() {
        return "ch05/elimplicitobject/index";
    }
    
    /**
     * 
     * @param number 1..3
     * @return 
     */
    @GetMapping("/ch05/simpletagtest/{number}")
    public String simpleTagTest(@PathVariable Integer number) {
        return String.format("ch05/simpletagtest/index%d", number);
    }
}
