package deu.se.ood.ch07.file_download.beans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author beki
 */
@WebServlet(name = "DownloadServlet", urlPatterns = {"/ch07/FileDownload/download.do"})
public class DownloadServlet extends HttpServlet {
    
    private final Logger logger = LoggerFactory.getLogger(DownloadServlet.class);
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/octet-stream");
        try {
            request.setCharacterEncoding("UTF-8");
            String targetDirectory = request.getParameter("AbsolutePath");
            String selectedFile = request.getParameter("D1");
            
            // 파일 읽기
            File f = new File(targetDirectory + "/" + selectedFile);
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            //응답 헤더 설정
            response.setHeader("Content-Disposition", "inline: filename="
                + URLEncoder.encode(selectedFile, "UTF-8"));
            
            //파일 쓰기
            ServletOutputStream sos = response.getOutputStream();
            while (bis.available() > 0) {
                sos.write(bis.read());
            }
            sos.flush();
            sos.close();
            bis.close();
            fis.close();
        } catch (Exception ex) {
            PrintWriter out = response.getWriter();
            out.println("오류 발생: " + ex.getMessage());
            out.close();
        }
    }
}
