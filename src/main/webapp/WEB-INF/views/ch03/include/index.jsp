<%-- 
    Document   : index
    Created on : 2025. 4. 9., 오후 10:39:55
    Author     : beki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Include Test Project</title>
    </head>
    <body>
        <%-- <%@include file="header.jsp" %> --%>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        본문 내용이 들어갈 자리입니다.
        <jsp:directive.include file="/WEB-INF/jspf/footer.jspf" />
    </body>
</html>
