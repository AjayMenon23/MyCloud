<%@page import="util.Variables"%>
<html>
    <head>
        <title>Welcome Home Admin</title>

    </head>

    <body background="img/1.png">

    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
            <%@include file="home_menu.jsp" %>
         <h2 ><font color="#366092">CONTACT</font></h2>
        <form>
            <img src="img/contact_us.png" width="600" height="300">
        </form>
         <p style="color: white">Phone no:123456</p>
         <p style="color: white">Email: xyz@gmail.com</p>
    </center>    

</body>
</html>
