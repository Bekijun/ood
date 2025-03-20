<%-- 
    Document   : index2.jsp
    Created on : 2025. 3. 20., 오전 10:10:45
    Author     : 915-14
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="show_error.jsp" %>
        
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= 5 / 0 %> <!-- 오류 -->
    </body>
</html>
