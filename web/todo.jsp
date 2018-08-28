<%--
  Created by IntelliJ IDEA.
  User: jshwang
  Date: 2018-08-28
  Time: 오후 5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TODO 등록</title>
</head>
<body>
    <h3>TO DO 등록</h3>
    <div>
        <form method="POST" action="/todo">
            <input type="text" name="todoName" value=""/>
            <input type="date" name="todoDate" value=""/>
            <input type="submit" value="등록"/>
        </form>
    </div>
    <div>
        <h4>TO DO List</h4>
    </div>
</body>
</html>
