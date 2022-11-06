<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lab-01</title>
</head>
<body>

<%!
    private int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
%>

<%@include file="header.jsp"%>

<div class="container">
    <h2>Show 1 to 5</h2>
    <% for(int i=0; i<5; i++) {%>
    <b><%=i+1%> </b><br>
    <%}%>
    <br>

    <% int s = 10; %>
    Sum of 1 to 5 = <%= sum(5) %><br>
    Sum of 1 to s = <%= sum(s) %>


</div>

</body>
</html>