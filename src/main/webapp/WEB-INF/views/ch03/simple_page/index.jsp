<%-- 
    Document   : index.jsp
    Created on : 2025. 3. 18., 오후 1:07:27
    Author     : 915-14
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>page 지시어 사용 방법</title>
    </head>
    <body>
        지금 시각은 <%= LocalDateTime.now() %>입니다.
                
    </body>
</html>
