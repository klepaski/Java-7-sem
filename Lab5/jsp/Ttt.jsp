<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="tglb1" prefix="taglib" %>
<html>
<head>
    <title>
        Lab5
    </title>
</head>
<body>
<%--использование тела и предназначенный для  создания  html-тега <form>, генерирующего http-запрос типа  POST --%>
<taglib:dossier action="/Lab5/Ttt">
    <br/><taglib:surname value="Chistyakova"/>
    <br/><taglib:lastname value="Julia"/>
    <br><taglib:sex/>
    <br><taglib:submit/>
</taglib:dossier>
</body>
</html>