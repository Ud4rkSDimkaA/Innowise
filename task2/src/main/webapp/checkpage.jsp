<%@ page import="model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: d4rkdimka
  Date: 9.04.24
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2>Dear  <%=request.getSession().getAttribute("username")%></h2>
<ul>
    <%List<Product> innerProducts = (List<Product>) request.getSession().getAttribute("innerProducts");
        for (Product product : innerProducts) { %>
    <li>Name: <%= product.getName() %>, Price: <%= product.getPrice() %></li>
    <% } %>
</ul>
<p>
<h3>Total: <%=request.getSession().getAttribute("overallSum")%></h3>
</body>
</html>
