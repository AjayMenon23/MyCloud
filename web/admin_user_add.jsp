
<%@page import="util.Variables"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db.DBProcess"%>
<!DOCTYPE html>
<%

Object obj= session.getAttribute("al");
if(obj==null)response.sendRedirect("admin_login.jsp");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User  </title>
    </head>
    <!--  
        //2. user_login - id,uname,passwd,level,status
        //3. user_detail - id,name,gender,dob,email,contact,addr,dt
        //4. key_store - id,user_id,keycode,dt
    -->
    <body>
    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
       
        <%@include file="admin_menu.jsp" %>
        <h2 ><font color="#366092">Add User</font></h2>
        <%
      
                            
        %>
                        
        <form name="frm" action="admin_user_add_action.jsp" method="post">
            <table>
                <tr>
                    <td> Name </td>
                    <td> <input type="text" name="name"> </td>
                </tr>
                <tr>
                    <td> Gender </td>
                    <td> 
                        <select name="gender">
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                        </select> 
                    </td>
                </tr>
                    <tr>
                    <td> Date Of Birth </td>
                    <td> <input type="date" name="dob"> </td>
                </tr>
                <tr>
                    <td> Address </td>
                    <td> 
                        <TextArea name="addr"></textarea> <br>
                        
                    </td>
                </tr>
                <tr>
                    <td> Contact </td>
                    <td> <input type="number" name="contact"> </td>
                </tr>
                <tr>
                    <td> Email </td>
                    <td> <input type="email" name="email"> </td>
                </tr>
                <tr>
                     <td></td>
                     <td> 
                         <input type="submit" name="s1" value="Add"> 
                        <input type="reset" name="r1" value="Reset"> 
                     </td>
                </tr>
                
            </table>
        </form>
        <center>
    </body>
</html>
