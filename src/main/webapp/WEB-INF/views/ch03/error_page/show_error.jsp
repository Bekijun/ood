<%-- 
    Document   : show_error
    Created on : 2025. 3. 20., 오전 10:12:10
    Author     : 915-14
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>오류 원인</title>
    </head>
    <body>
        오류 원인: <%= exception.toString() %>입니다.
    </body>
</html>
