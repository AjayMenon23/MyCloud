

<%@page import="db.tables.File_Store"%>
<%@page import="db.tables.User_Login"%>
<%@page import="db.tables.File_Access"%>
<%@page import="db.tables.Key_Store"%>
<%@page import="db.tables.User_Detail"%>
<%@page import="util.Variables"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db.DBProcess"%>

<%
 Object obj= session.getAttribute("ul");
if(obj==null)response.sendRedirect("user_login.jsp");
%>

<html>
    <head>
        <title>File List</title>

    </head>

    <body >

    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
        <%@include file="user_menu.jsp" %>
         <h2><font color="#366092">File List</font></h2>
         <a href="user_file_add.jsp" >Add File</a><br><br>
         
        <form>
            <%
        //7. file_access - id,file_id,user_id,fname,key,status,dt,tags
            %>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th> File Name </th>
                    <th> Tags </th>
                    <th> Date</th>
                    <th> Action </th>
                </tr>
                <%
                    User_Login ul = (User_Login)obj;
                DBProcess dbp =new DBProcess();
                dbp.open();
                ArrayList<File_Access> faList = dbp.selectAll_file_access();
                dbp.close();
                
                if(faList.size()==0){
                    %>
                    <tr>
                    <td>No</td>
                    <td>Data</td>
                    <td>----</td>
                    <td>No</td>
                    <td>Data</td>
                   
                </tr>
                    <%
                }
                else{
                    for(File_Access fa:faList){
                        //dbp.open();
                        //File_Store fs = dbp.select_file_store(fa.file_id);
                        //dbp.close();    
                        %>
                        <tr>
                        <td><%=fa.id%></td>
                        <td>
                            &nbsp;<%=fa.fname%>&nbsp;
                        </td>
                        <td>
                            &nbsp;<%=fa.tags%>&nbsp;
                        </td>
                        <td>
                            &nbsp;<%=fa.dt%>&nbsp;
                        </td>
                        
                       
                        
                        <td>
                            &nbsp; <a href="id=<%=fa.id%>">Download</a> | 
                            <a href="id=<%=fa.id%>">Delete</a>&nbsp;
                        </td>
                    </tr>
                        <%
                    }
                }
                dbp.close();
            %>
            </table>
            
        </form>
        <a href="user_file_add.jsp" >Add File</a>
    </center>    

</body>
</html>
