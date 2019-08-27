<%--
  Created by IntelliJ IDEA.
  User: Nguyen's Computer
  Date: 27-Aug-19
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div id="content">
    <h2>Product Discount Calculator</h2>
    <form action="${pageContext.request.contextPath}/display" method="post">
        <div>
            <label>Product Description</label>
            <input type="text" name="ProductDescription" value=""><br/>

            <label>List Price:</label>
            <input type="text" name="ListPrice" value=""><br/>

            <label>Discount Percent:</label>
            <input type="text" name="DiscountPercent" value="">%<br/>
        </div>
        <div id="buttons">
            <label>&nbsp;</label>
            <input type="submit" id="submit" value="Calculate Discount">
        </div>
    </form>
</div>
</body>
</html>
