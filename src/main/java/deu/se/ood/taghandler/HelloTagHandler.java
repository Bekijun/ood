/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package deu.se.ood.taghandler;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author beki
 */
@Slf4j
public class HelloTagHandler extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            out.println("안녕하십니까?");
        } catch (IOException e) {
            //log.error("HelloTagHandler: 예외 = {}", e.getMessage());
        }
        
    }
    
}
