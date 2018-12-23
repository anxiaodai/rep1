<%--
  Created by IntelliJ IDEA.
  User: 青南山
  Date: 2018/12/21
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <form action="${pageContext.request.contextPath}/user/register" >
         username:  <input type="text" name="username">
         <span style="color: red">${username}</span> <br>
         password: <input type="text" name="password">
         <span style="color: red">${password}</span> <br>
         email:  <input type="text" name="email">
         <span style="color: red">${email}</span><br>
         <input type="submit" value="注册">
     </form>
</body>
</html>
