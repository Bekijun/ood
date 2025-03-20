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
public class ch03Controller {
    
    @GetMapping("/ch03/simple_page_directive")
    public String ch03SimplePageDirective() {
        return "ch03/simple_page/index";
    }
    
    @GetMapping("/ch03/error_page/index1")
    public String ch03Error1() {
        return "ch03/error_page/index1";
    }
    
    @GetMapping("/ch03/error_page/index2")
    public String ch03Error2() {
        return "ch03/error_page/index2";
    }
}
 