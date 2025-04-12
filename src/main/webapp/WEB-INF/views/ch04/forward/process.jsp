 <%-- 
    Document   : process
    Created on : 2025. 4. 9., 오후 11:11:00
    Author     : beki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>process.jsp</title>
    </head>
    <body>
        반갑습니다.
        <%=request.getParameter("user")%> 님!
        
        <%@include file="/WEB-INF/jspf/main_footer.jspf" %>
    </body>
</html>
