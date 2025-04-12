<%-- 
    Document   : index
    Created on : 2025. 4. 7., 오후 5:39:42
    Author     : beki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page info="page 지시어 사용 방법을 보여 줍니다."%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page 지시어 사용 방법</title>
    </head>
    <body>
        지금 시간은 <%= new Date()%>입니다.
    </body>
</html>
