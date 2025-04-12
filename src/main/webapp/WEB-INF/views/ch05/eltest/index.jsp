<%-- 
    Document   : index.jsp
    Created on : 2025. 4. 1., 오후 1:12:28
    Author     : 915-14
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>표현식 언어 예제</title>
    </head>
    <body>
        <jsp:useBean id="userBean" scope="page"
                     class="deu.se.ood.ch05.UserInfo" />
        <jsp:setProperty name="userBean" property="name" value="홍길동" />
        <jsp:setProperty name="userBean" property="age" value="20" />
        
        사용자 이름: ${userBean.name} <br>
        나이: ${userBean["age"]} <br>
        10년 뒤 나이: ${userBean.age + 10} <br>
        
        <%@include file="/WEB-INF/jspf/main_footer.jspf" %>
    </body>
</html>
