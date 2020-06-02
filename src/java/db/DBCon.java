package db;


import db.*;
import java.sql.*;

public class DBCon {

    Connection con = null;
    Statement stmt = null;
   
    static final String DBPATH ="C:\\Users\\AJAY\\Desktop\\mycloud\\out\\hybrid_db.db";
    static final String DRIVER = "org.sqlite.JDBC";
    static final String CONSTRING = "jdbc:sqlite:"+DBPATH;
    public static String tables[] =  new String[10];
    public void open() {

        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(CONSTRING);
            System.out.println("Connection Created");
            con.setAutoCommit(false);
            stmt = con.createStatement();
            System.out.println("Statement Created");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("DBCon Open Err>>" + e);
        }
    }

    //Table Details
    
    //1. admin_login - id,uname,passwd,status
    //2. user_login - id,uname,passwd,level,status
    //3. user_detail - id,name,gender,dob,email,contact,addr,dt
    //4. key_store - id,user_id,keycode,dt
    //5. signature_index - id,file_id,signature,dt
    //6. file_store - id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt
    //7. file_access - id,file_id,user_id,fname,key,status,dt,tags
    //8. user_log - id,user_id,action,dt
    //9. file_share - id,file_id,user_id,share_user_id,status,dt
    
    
    
    
   
    public void createTables() {
        try {
            
            //1. admin_login - id,uname,passwd,status
            tables[0] = "CREATE TABLE IF NOT EXISTS admin_login("
                    + "id INT,"
                    + "uname VARCHAR(50),"
                    + "passwd VARCHAR(50),"
                    + "status VARCHAR(50))";
                  
            //2. user_login - id,uname,passwd,level,status
            tables[1] = "CREATE TABLE IF NOT EXISTS user_login("
                    + "id INT,"
                    + "uname VARCHAR(50),"
                    + "passwd VARCHAR(50),"
                    + "level INT,"
                    + "status VARCHAR(10))";
                   
            //3. user_detail - id,name,gender,dob,email,contact,addr,dt
            tables[2] = "CREATE TABLE IF NOT EXISTS user_detail("
                    + "id INT,"
                    + "name VARCHAR(50),"
                    + "gender VARCHAR(50),"
                    + "dob VARCHAR(50),"
                    + "email VARCHAR(50),"
                    + "contact VARCHAR(50),"
                    + "addr VARCHAR(50),"
                    + "dt VARCHAR(50))";
                    
                    
            
            //4. key_store - id,user_id,keycode,dt
            tables[3] = "CREATE TABLE IF NOT EXISTS key_store("
                    + "id INT,"
                    + "user_id INT,"
                    + "keycode VARCHAR(40),"
                    + "dt VARCHAR(40))";
            
            //5. signature_index - id,file_id,signature,dt
            tables[4] = "CREATE TABLE IF NOT EXISTS signature_index("
                    + "id INT,"
                    + "file_id INT,"
                    + "signature VARCHAR(50),"
                    + "dt VARCHAR(50))";
                    
            
            //6. file_store - id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt
            tables[5] = "CREATE TABLE IF NOT EXISTS file_store("
                    + "id INT,"
                    + "user_id INT,"
                    + "file_name VARCHAR(40),"
                    + "file_type VARCHAR(40),"
                    + "file_newname VARCHAR(40),"
                    + "file_address VARCHAR(240),"
                    + "file_size VARCHAR(40),"
                    + "email VARCHAR(40),"
                    + "con_key VARCHAR(140),"
                    + "file_tags VARCHAR(40),"
                    + "dt VARCHAR(40))";
                   
                  
            //7. file_access - id,file_id,user_id,fname,key,status,dt,tags
            tables[6] = "CREATE TABLE IF NOT EXISTS file_access("
                    + "id INT,"
                    + "file_id INT,"
                    + "user_id INT,"
                    + "fname VARCHAR(40),"
                    + "key VARCHAR(40),"
                    + "status VARCHAR(140),"
                    + "dt VARCHAR(40),"
                    + "tags VARCHAR(40))";
            
            //8. user_log - id,user_id,action,dt
            tables[7] = "CREATE TABLE IF NOT EXISTS user_log("
                    + "id INT,"
                    + "user_id INT,"
                    + "action VARCHAR(340),"
                    + "dt VARCHAR(40))";
            
            //9. file_share - id,file_id,user_id,share_user_id,status,dt
            tables[8] = "CREATE TABLE IF NOT EXISTS file_share("
                    + "id INT,"
                    + "file_id INT,"
                    + "user_id INT,"
                    + "share_user_id INT,"
                    + "status VARCHAR(40),"
                    + "dt VARCHAR(40))";
            
        
            
            
           
            
            
            for(int i=0;i<tables.length;i++){
                if(tables[i]==null)continue;
                int j = executeUpdate(tables[i]);

                if (j > 0) {
                    System.out.println("Table Created");
                }
            }
            
        } catch (Exception e) {
            System.out.println("DBConn Create Tables Err>>" + e);
        }
    }

    public void dropTables() {
        try {
     
    
            tables[0] = "DROP TABLE IF EXISTS admin_login";
            tables[1] = "DROP TABLE IF EXISTS user_login";
            tables[2] = "DROP TABLE IF EXISTS user_detail";
            tables[3] = "DROP TABLE IF EXISTS key_store";
            tables[4] = "DROP TABLE IF EXISTS signature_index";
            
            tables[5] = "DROP TABLE IF EXISTS file_store";
            tables[6] = "DROP TABLE IF EXISTS file_access";
            tables[7] = "DROP TABLE IF EXISTS user_log";
            tables[8] = "DROP TABLE IF EXISTS file_share";
            
            
        
            
         
           
            
            for(int i=0;i<tables.length;i++){
                if(tables[i]==null)continue;
                int j = executeUpdate(tables[i]);

                if (j > 0) {
                    System.out.println("Table Deleted");
                }
            }
        } catch (Exception e) {
            System.out.println("DBCon Drop Tables Err>>" + e);
        }

    }

    public int executeUpdate(String query) {
        int result = 0;
        try {
            System.out.println("DBCon Query>>" + query);
            result = stmt.executeUpdate(query);
            con.commit();
        } catch (Exception e) {
            System.out.println("DBCon Execute Update Error>>" + e);
        }
        return result;
    }

    public ResultSet executeQuery(String query) {
        ResultSet rset = null;
        try {

            System.out.println("DBCon Query>>" + query);
            con.commit();
            rset = stmt.executeQuery(query);

        } catch (Exception e) {
            System.out.println("DBCon Execute Query Err>>" + e);
        }
        return rset;
    }

    public void close() {
        try {
            stmt.close();
             System.out.println("Statement Closed");
            con.close();
            System.out.println("Connection Closed");
        } catch (Exception e) {
            System.out.println("DBCon Close Err>>" + e);
        }
    }

    public static void main(String args[]) {
        DBCon dbcon = new DBCon();
        dbcon.open();
        dbcon.createTables();
        //dbcon.dropTables();
        dbcon.close();
    }
}
