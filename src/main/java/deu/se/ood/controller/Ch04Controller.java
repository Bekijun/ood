/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import deu.se.ood.beans.ch04.SumSpringBean;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author beki
 */
@Controller
@Slf4j
public class Ch04Controller {
    @Autowired
    private ServletContext ctx;
    @Autowired
    private SumSpringBean sumBean;
    
    @GetMapping("/ch04/beans")
    public String ch04Beans(Model m) {
        log.debug("Real path of \"/\" = {}", ctx.getRealPath("/"));
        m.addAttribute("ctx_path", ctx.getRealPath("/"));
        
        return "/ch04/beans/index";
    }
    
    @PostMapping("/ch04/beans/show_sum1")
    public String ch04BeansShowSum(HttpServletRequest request) {
        log.debug("show_sum: n = {}", request.getParameter("n"));
        
        return "ch04/beans/show_sum1";
    }
    
    @PostMapping("/ch04/beans/show_sum2")
    public String ch04BeansShowSum2(@RequestParam String n, Model model) {
        log.debug("show_sum2: n = {}", n);
        sumBean.setN(Integer.parseInt(n));
        sumBean.calculate();
        
        model.addAttribute("result", sumBean.getResult());
        
        return "ch04/beans/show_sum2";
    }
    
    @GetMapping("/ch04/include")
    public String ch04IncludeTest2() {
        return "ch04/include/index";
    }
    
    @RequestMapping("/ch04/forward")
    public String ch04ForwardTest(HttpServletRequest request) {
        return "ch04/forward/index";
    }
}
