

<%@page import="db.tables.Key_Store"%>
<%@page import="db.tables.User_Login"%>
<%@page import="db.tables.User_Detail"%>
<%@page import="util.Variables"%>
<%@page import="util.DateTime"%>
<%@page import="db.DBProcess"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medical Shop Add Action</title>
    </head>
    <body>
    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
       
        <%@include file="admin_menu.jsp" %>
        <h2 ><font color="#366092">Add User Result</font></h2>
    <%
        //2. user_login - id,uname,passwd,level,status
        //3. user_detail - id,name,gender,dob,email,contact,addr,dt
        //4. key_store - id,user_id,keycode,dt
    
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String dob = request.getParameter("dob");
    String addr = request.getParameter("addr");
    
    String contact = request.getParameter("contact");
    String email = request.getParameter("email");
    
    String uname=email;
    String passwd="12345";
    String status="new";
    int level=1;
    String keycode = "1234567890123456"; 
    String dt = DateTime.getDate();
   try{ 
    DBProcess dbp =new DBProcess();
    dbp.open();
    int id = dbp.getMaxID_user_detail()+1;
    dbp.close();
    User_Detail  ud =new User_Detail(id, name, gender, dob, email, contact, addr, dt);
    dbp.open();
    int result = dbp.insert_user_detail(ud);
    dbp.close();
    out.println(result + ">>"+ud.toString()+"<br>");
    User_Login ul = new User_Login(id, uname, passwd, level, status);
    dbp.open();
    result = dbp.insert_user_login(ul);
    dbp.close();
    out.println(result + ">>"+ul.toString()+"<br>");
    dbp.open();
    int ks_id = dbp.getMaxID_key_store()+1;
    dbp.close();
   
      
    Key_Store ks =new Key_Store(ks_id, id, keycode, dt);
    dbp.open();
    result = dbp.insert_key_store(ks);
    dbp.close();
    out.println(result + ">>"+ks.toString()+"<br>");
   }
    catch(Exception e)
   {} 
    %>
    Record Added
    </center>
</body>
</html>
