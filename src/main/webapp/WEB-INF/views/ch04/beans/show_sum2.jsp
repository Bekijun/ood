<%-- 
    Document   : show_sum2.jsp
    Created on : 2025. 4. 7., 오후 3:06:03
    Author     : beki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Spring Bean 사용한 계산 결과</title>
        <link rel="stylesheet" type="test/css"
              href="${pageContext.request.contextPath}/css/my_style.css">
    </head>
    <body>
        <div class="padding_bottom_30px box center" style="width: 80%;">
            Request Parameter n : ${param.n}
        </div>

        <ul>
            <li>계산 결과 1: ${result} </li>
        </ul>
        
            <%@include file="/WEB-INF/jspf/main_footer.jspf" %>
    </body>
</html>
