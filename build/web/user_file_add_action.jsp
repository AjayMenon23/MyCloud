.

<%@page import="db.tables.File_Access"%>
<%@page import="db.tables.File_Store"%>
<%@page import="db.tables.Key_Store"%>
<%@page import="db.tables.User_Login"%>
<%@page import="util.Variables"%>
<%@page import="util.DateTime"%>
<%@page import="db.DBProcess"%>
<%@page import="com.geekonjava.fileupload.FileUploading"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Add Action</title>
    </head>
    <body>
    <center>
        <h1 ><font color="#366092"><%=Variables.prjName%></font></h1>
       
        <%@include file="user_menu.jsp" %>
        <h2 ><font color="#366092">Add File Result</font></h2>
    <%
        Object obj= session.getAttribute("ul");
        if(obj==null)response.sendRedirect("user_login.jsp");

        ////////////////////////////////////////////////////////

            String filepath = config.getServletContext().getRealPath("/") + "files/";

            ArrayList<String> filename = new ArrayList<String>();
            filename.add("fl1");
            

            ArrayList<String> dataname = new ArrayList<String>();
            dataname.add("tags");
            

            HashMap map = FileUploading.UploadFile(filepath, dataname, filename, request);
            out.println(map.get("error") + "<br>");
            String fname = map.get("fl1")+"";
            String tags = map.get("tags")+"";
            
        ///////////////////////////////////////////////////////

        //6. file_store - id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt
        //7. file_access - id,file_id,user_id,fname,key,status,dt,tags
    
        User_Login ul = (User_Login)obj;
        int user_id=ul.id;
        String file_name= fname;
        String file_type = "data";
        String file_newname=System.currentTimeMillis()+"";
        String file_address=filepath;
        String email=ul.uname;
        String con_key=System.currentTimeMillis()+"";
        String file_tags = tags;
        String dt = DateTime.getDate();
        java.io.File f1 =new java.io.File(file_address+file_name);
        java.io.File f2 =new java.io.File(file_address+file_newname);
        f1.renameTo(f2);
        String file_size=f2.length()+"";
        String key=con_key;
        String status="new";    
        file_type=Variables.identifyFileTypeUsingFilesProbeContentType(f2.getAbsolutePath());
    
        DBProcess dbp =new DBProcess();
    
        dbp.open();
        int file_store_id = dbp.getMaxID_file_store()+1;
        dbp.close();
          
         dbp.open();  
        int file_access_id = dbp.getMaxID_file_access()+1;
       dbp.close();
    
        File_Store fs = new File_Store(file_store_id, user_id, file_name, file_type, file_newname, file_address, file_size, email, con_key, file_tags, dt);
        dbp.open();
        int result = dbp.insert_file_store(fs);
        dbp.close();
        out.println(result + ">>"+fs.toString()+"<br>");
        
      
   
        File_Access fa =new File_Access(file_access_id, file_store_id, user_id, fname, key, status, dt, tags);
        dbp.open();
        result = dbp.insert_file_access(fa);
        dbp.close();
        out.println(result + ">>"+fa.toString()+"<br>");
    
    %>
    Record Added
    </center>y
</body>
</html>
