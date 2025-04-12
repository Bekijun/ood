/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author 915-14
 */
@Controller
@Slf4j
public class Ch03Controller {
    
    @GetMapping("/ch03/simple_page")
    public String ch03SimplePageDirective() {
        log.debug("/ch03/simple_page called...");
        return "ch03/simple_page/index";
    }
    
    @GetMapping("/ch03/error_page/index1")
    public String ch03Error1() {
        log.debug("/ch03/index1 called...");
        return "ch03/error_page/index1";
    }
    
    @GetMapping("/ch03/error_page/index2")
    public String ch03Error2() {
        log.debug("/ch03/index2 called...");
        return "ch03/error_page/index2";
    }
    
    @GetMapping("/ch03/include")
    public String ch03Include() {
        log.debug("/ch03/include called...");
        return "ch03/include/index";
    }
}
 