<%-- 
    Document   : index1
    Created on : 2025. 4. 12., 오후 5:22:12
    Author     : beki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@taglib uri="/WEB-INF/tlds/mytags1" prefix="mytags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Simple Tag Handler 사용 예제</title>
    </head>
    <body>
        <mytags:hello />
        
        <%@include file="/WEB-INF/jspf/main_footer.jspf" %>
    </body>
</html>
