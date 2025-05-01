/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author 915-14
 */
@Controller
public class SystemErrorController implements ErrorController {
    
    @RequestMapping("/error")
    public String errorPage(HttpServletRequest request, RedirectAttributes attrs) {
        Integer status = (Integer)request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        String uri = (String)request.getAttribute(RequestDispatcher.ERROR_REQUEST_URI);

        System.out.println("🔴 에러 감지! 상태코드: " + status + ", 요청 URI: " + uri);

        attrs.addFlashAttribute("msg", "오류가 발생하여 컨텍스트 루트로 이동하였습니다. 오류 코드 = " + status);
        return "redirect:/";
    }
}
