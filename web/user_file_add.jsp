
<%@page import="util.Variables"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db.DBProcess"%>
<!DOCTYPE html>
<%

Object obj= session.getAttribute("ul");
if(obj==null)response.sendRedirect("user_login.jsp");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add File  </title>
    </head>
   
    <body>
    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
       
        <%@include file="user_menu.jsp" %>
        <h2 ><font color="#366092">Add File</font></h2>
        <%
       //6. file_store - id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt
    //7. file_access - id,file_id,user_id,fname,key,status,dt,tags
                            
        %>
                        
        <form name="frm" action="user_file_add_action.jsp" enctype="multipart/form-data" name="form1" id="form1" method="post">
            <table>
                <tr>
                    <td> File </td>
                    <td> <input type="file" name="fl1"> </td>
                </tr>
                <tr>
                    <td> Tags </td>
                    <td> <input type="text" name="tags"> </td>
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
