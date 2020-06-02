

<%@page import="db.tables.Key_Store"%>
<%@page import="db.tables.User_Detail"%>
<%@page import="util.Variables"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db.DBProcess"%>

<%
 Object obj= session.getAttribute("al");
if(obj==null)response.sendRedirect("admin_login.jsp");
%>

<html>
    <head>
        <title>User List</title>

    </head>

    <body >

    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
        <%@include file="admin_menu.jsp" %>
         <h2><font color="#366092">User List</font></h2>
         <a href="admin_user_add.jsp" >Add User</a><br><br>
         
        <form>
            <%
                 //2. user_login - id,uname,passwd,level,status
            //3. user_detail - id,name,gender,dob,email,contact,addr,dt
            //4. key_store - id,user_id,keycode,dt
            %>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th> Name </th>
                    <th> Gender </th>
                    <th> Dob </th>
                    <th> Address </th>
                    <th> Email </th>
                    <th> Contact </th>
                    <th> Keycode </th>
                    <th> Date</th>
                    <th> Action </th>
                </tr>
                <%
                DBProcess dbp =new DBProcess();
                dbp.open();
                ArrayList<User_Detail> udList = dbp.selectAll_user_detail();
                dbp.close();
                
                if(udList.size()==0){
                    %>
                    <tr>
                    <td>No</td>
                    <td>Data</td>
                    <td>----</td>
                    <td>No</td>
                    <td>Data</td>
                    <td>----</td>
                    <td>----</td>
                    <td>No</td>
                    <td>Data</td>
                    <td>----</td>
                </tr>
                    <%
                }
                else{
                    for(User_Detail ud:udList){
                        dbp.open();
                        Key_Store ks = dbp.select_key_store2(ud.id);
                        dbp.close();    
                        %>
                        <tr>
                        <td><%=ud.id%></td>
                        <td>
                            &nbsp;<%=ud.name%>&nbsp;
                        </td>
                        <td>
                            &nbsp;<%=ud.gender%>&nbsp;
                        </td>
                        <td>
                            &nbsp;<%=ud.dob%>&nbsp;
                        </td>
                        
                        <td>
                            &nbsp;<%=ud.addr%>,&nbsp;
                        </td>
                        <td>
                            &nbsp;<%=ud.email%>&nbsp;
                        </td>
                        <td>
                            &nbsp;<%=ud.contact%>&nbsp;
                        </td>
                        <td>
                            &nbsp;<%=ks.keycode%>&nbsp;
                        </td>
                        <td>
                            &nbsp;<%=ud.dt%>&nbsp;
                        </td>
                        
                        <td>
                            &nbsp; <a href="admin_user_edit.jsp?id=<%=ud.id%>">Update</a> | 
                            <a href="admin_user_delete_action.jsp?id=<%=ud.id%>">Delete</a>&nbsp;
                        </td>
                    </tr>
                        <%
                    }
                }
                dbp.close();
            %>
            </table>
            
        </form>
        <a href="admin_user_add.jsp" >Add User</a>
    </center>    

</body>
</html>
