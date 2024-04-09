<%@ page import="java.util.List" %>
<%@ page import="model.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Online-store</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="style">
    <h2>Hello <%=request.getSession().getAttribute("username")%></h2></p>
    <h3>Make your order</h3>
    <form action="/untitled/mainpage" method="post">
        <select name="product" multiple>
            <option value="">Выберите продукт</option>
            <% List<Product> products = (List<Product>) request.getSession().getAttribute("products");
                for (Product product : products) { %>
            <option value="<%= product.getName() %>"><%= product.getName() %> - <%= product.getPrice() %></option>
            <% } %>
        </select>
        <br><br>
        <input type="submit" value="Enter">

    </form>
</div>

</body>
</html>
