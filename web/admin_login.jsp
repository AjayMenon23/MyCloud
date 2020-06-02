<%-- 
    Document   : user_login
    Created on : 24 jan, 2017, 12:21:16 PM
    Author     : febin
--%>

<%@page import="util.Variables"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% session.invalidate();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
    </head>
    <body background="img/1.png">
    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
         <%@include file="home_menu.jsp" %>
        <h2><font color="#366092">ADMIN LOGIN</font></h2>
        <img src="img/person.png" width="200" height="200">
        <form name="frm" action="admin_login_action.jsp" method="post">
            <table>
                <tr>
                    <td> User Name </td>
                    <td> <input type="text" name="uname"> </td>
                </tr>
                <tr>
                    <td>  Password </td>
                    <td> <input type="password" name="passwd"> </td>
                </tr>
                
                <tr>
                    <td>  </td>
                    <td> <input type="submit" name="s1" value="Login"> <input type="reset" name="r1" value="Reset"> </td>
                    
                </tr>
                
            </table>
        </form>
    </center>
    </body>
</html>
