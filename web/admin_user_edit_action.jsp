


<%@page import="db.tables.User_Login"%>
<%@page import="db.tables.User_Detail"%>
<%@page import="util.Variables"%>
<%@page import="util.DateTime"%>
<%@page import="db.DBProcess"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Edit Action</title>
    </head>
    <body>
    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
       
        <%@include file="admin_menu.jsp" %>
        <h2 ><font color="#366092">Edit User Result</font></h2>
    <%
       //2. user_login - id,uname,passwd,level,status
    //3. user_detail - id,name,gender,dob,email,contact,addr,dt
    //4. key_store - id,user_id,keycode,dt
    int id = Integer.parseInt(request.getParameter("id") + "");
    String name = request.getParameter("name");
    String dob = request.getParameter("dob");
    String gender = request.getParameter("gender");
    String addr = request.getParameter("addr");
    String contact = request.getParameter("contact");
    String email = request.getParameter("email");
    
    String dt = DateTime.getDate();
   
    
    
    
    DBProcess dbp =new DBProcess();
    dbp.open();
    User_Detail ud = dbp.select_user_detail(id);
    dbp.close();
    String status="new";
    String uname=email;
    String passwd="12345";
    int level=1;
    
    ud = new User_Detail(id, name, gender, dob, email, contact, addr, dt);
    User_Login ul =new User_Login(id, uname, passwd, level, status);
    dbp.open();
    int result = dbp.update_user_detail(ud);
    dbp.close();
    out.println(result + ">>"+ud.toString()+"<br>");
    dbp.open();
    result = dbp.update_user_login(ul);
    dbp.close();
    out.println(result + ">>"+ul.toString()+"<br>");
    
    %>
    Record Updated
    </center>
</body>
</html>
