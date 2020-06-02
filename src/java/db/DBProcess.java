
package db;







import db.tables.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author root
 */
public class DBProcess extends DBCon{
 
    //1. admin_login - id,uname,passwd,status
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_admin_login(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM admin_login";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("getMaxID_admin_login Err>>"+e);
        }
        return mid;
    }

    public int insert_admin_login(Admin_Login obj){
        int result =0;
        try {
            String query="INSERT INTO admin_login(id,uname,passwd,status) VALUES("+obj.id+",'"+obj.uname+"','"+obj.passwd+"','"+obj.status+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("insert_admin_login Err>>"+e);
        }
        return result;
    }
    public int delete_admin_login(int id){
        int result = 0;
        try {
            String query="DELETE FROM admin_login WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_admin_login Err>>"+e);
        }
        return result;
    }
    
    public int update_admin_login(Admin_Login obj){
        int result =0;
        try {
            String query="UPDATE admin_login SET uname='"+obj.uname+"',passwd='"+obj.passwd+"',status='"+obj.status+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_admin_login Err>>"+e);
        }
        return result;
    }
    public int update_admin_login(String uname,String opasswd,String npasswd){
        int result =0;
        try {
            String query="UPDATE admin_login SET passwd='"+npasswd+"' WHERE uname='"+uname+"' AND passwd='"+opasswd+"'";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_admin_login Err>>"+e);
        }
        return result;
    }
     public Admin_Login select_admin_login(int id){
        Admin_Login obj =null;
        try {
            String query="SELECT id,uname,passwd,status FROM admin_login WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,uname,passwd,status
                id = rset.getInt("id");
               String uname= rset.getString("uname");
               String passwd= rset.getString("passwd");
               String status= rset.getString("status");
               
               obj = new Admin_Login(id, uname, passwd, status);
               
            }
        } catch (SQLException e) {
            System.out.println("select_admin_login Err>>"+e);
        }
        return obj;
    }
  public Admin_Login select_admin_login(String uname,String passwd){
        Admin_Login obj =null;
        try {
            String query="SELECT id,uname,passwd,status FROM admin_login WHERE uname='"+uname+"' AND passwd='"+passwd+"'";
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,uname,passwd,status
               int id = rset.getInt("id");
               uname= rset.getString("uname");
               passwd= rset.getString("passwd");
               String status= rset.getString("status");
               
               obj = new Admin_Login(id, uname, passwd, status);
               
            }
        } catch (SQLException e) {
            System.out.println("select_admin_login Err>>"+e);
        }
        return obj;
    }
    public ArrayList<Admin_Login> selectAll_admin_login(){
        ArrayList<Admin_Login> objList = new ArrayList<Admin_Login>();
        try {
            String query="SELECT id,uname,passwd,status FROM admin_login ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               Admin_Login obj;
               int      id = rset.getInt("id");
               String uname= rset.getString("uname");
               String passwd= rset.getString("passwd");
               String status= rset.getString("status");
               
               obj = new Admin_Login(id, uname, passwd, status);
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_admin_login Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    
    //2. user_login - id,uname,passwd,level,status
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_user_login(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM user_login";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("getMaxID_user_login Err>>"+e);
        }
        return mid;
    }

    public int insert_user_login(User_Login obj){
        int result =0;
        try {
            String query="INSERT INTO user_login(id,uname,passwd,level,status) VALUES("+obj.id+",'"+obj.uname+"','"+obj.passwd+"',"+obj.level+",'"+obj.status+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("insert_user_login Err>>"+e);
        }
        return result;
    }
    public int delete_user_login(int id){
        int result = 0;
        try {
            String query="DELETE FROM user_login WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_user_login Err>>"+e);
        }
        return result;
    }
    
    public int update_user_login(User_Login obj){
        int result =0;
        try {
            String query="UPDATE user_login SET uname='"+obj.uname+"',passwd='"+obj.passwd+"',level="+obj.level+",status='"+obj.status+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_user_login Err>>"+e);
        }
        return result;
    }
    public int update_user_login(String uname,String  opasswd,String npasswd){
        int result =0;
        try {
            String query="UPDATE user_login SET passwd='"+npasswd+"' WHERE uname='"+uname+"' AND passwd='"+opasswd+"'";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_user_login Err>>"+e);
        }
        return result;
    }
    public User_Login select_user_login(int id){
        User_Login obj =null;
        try {
            String query="SELECT id,uname,passwd,level,status FROM user_login WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,uname,passwd,level,status
                id = rset.getInt("id");
               String uname= rset.getString("uname");
               String passwd= rset.getString("passwd");
               String level= rset.getString("level");
               String status= rset.getString("status");
               obj = new User_Login(id, uname, passwd, id, status);
            }
        } catch (SQLException e) {
            System.out.println("select_user_login Err>>"+e);
        }
        return obj;
    }
    public User_Login select_user_login(String uname,String passwd){
        User_Login obj =null;
        try {
            String query="SELECT id,uname,passwd,level,status FROM user_login WHERE uname='"+uname+"' AND passwd='"+passwd+"'";
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,uname,passwd,level,status
               int id = rset.getInt("id");
               uname= rset.getString("uname");
               passwd= rset.getString("passwd");
               String level= rset.getString("level");
               String status= rset.getString("status");
               obj = new User_Login(id, uname, passwd, id, status);
            }
        } catch (SQLException e) {
            System.out.println("select_user_login Err>>"+e);
        }
        return obj;
    }

    public ArrayList<User_Login> selectAll_user_login(){
        ArrayList<User_Login> objList = new ArrayList<User_Login>();
        try {
            String query="SELECT id,uname,passwd,level,status FROM user_login ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               User_Login obj ;
               int     id = rset.getInt("id");
               String uname= rset.getString("uname");
               String passwd= rset.getString("passwd");
               String level= rset.getString("level");
               String status= rset.getString("status");
               obj = new User_Login(id, uname, passwd, id, status);
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_user_login Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    
    //3. user_detail - id,name,gender,dob,email,contact,addr,dt
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_user_detail(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM user_detail";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("getMaxID_user_detail Err>>"+e);
        }
        return mid;
    }

    public int insert_user_detail(User_Detail obj){
        int result =0;
        try {
            String query="INSERT INTO user_detail(id,name,gender,dob,email,contact,addr,dt) VALUES("+obj.id+",'"+obj.name+"','"+obj.gender+"','"+obj.dob+"','"+obj.email+"','"+obj.contact+"','"+obj.addr+"','"+obj.dt+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("insert_user_detail Err>>"+e);
        }
        return result;
    }
    public int delete_user_detail(int id){
        int result = 0;
        try {
            String query="DELETE FROM user_detail WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_user_detail Err>>"+e);
        }
        return result;
    }
    
    public int update_user_detail(User_Detail obj){
        int result =0;
        try {
            String query="UPDATE user_detail SET name='"+obj.name+"',gender='"+obj.gender+"',dob='"+obj.dob+"',email='"+obj.email+"',contact='"+obj.contact+"',addr='"+obj.addr+"',dt='"+obj.dt+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_user_detail Err>>"+e);
        }
        return result;
    }
     public User_Detail select_user_detail(int id){
        User_Detail obj =null;
        try {
            String query="SELECT id,name,gender,dob,email,contact,addr,dt FROM user_detail WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,name,gender,dob,email,contact,addr,dt
                id = rset.getInt("id");
               String name= rset.getString("name");
               String gender= rset.getString("gender");
               String dob= rset.getString("dob");
               String email= rset.getString("email");
               String contact= rset.getString("contact");
               String addr= rset.getString("addr");
               String dt= rset.getString("dt");
               
               obj = new User_Detail(id, name, gender, dob, email, contact, addr, dt);
            }
        } catch (SQLException e) {
            System.out.println("select_user_detail Err>>"+e);
        }
        return obj;
    }

    public ArrayList<User_Detail> selectAll_user_detail(){
        ArrayList<User_Detail> objList = new ArrayList<User_Detail>();
        try {
            String query="SELECT id,name,gender,dob,email,contact,addr,dt FROM user_detail ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               User_Detail obj;
               int   id = rset.getInt("id");
               String name= rset.getString("name");
               String gender= rset.getString("gender");
               String dob= rset.getString("dob");
               String email= rset.getString("email");
               String contact= rset.getString("contact");
               String addr= rset.getString("addr");
               String dt= rset.getString("dt");
               
               obj = new User_Detail(id, name, gender, dob, email, contact, addr, dt);
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_user_detail Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    
    //4. key_store - id,user_id,keycode,dt
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_key_store(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM key_store";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(" Err>>"+e);
        }
        return mid;
    }

    public int insert_key_store(Key_Store obj){
        int result =0;
        try {
            String query="INSERT INTO key_store(id,user_id,keycode,dt) VALUES("+obj.id+","+obj.user_id+",'"+obj.keycode+"','"+obj.dt+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println(" Err>>"+e);
        }
        return result;
    }
    public int delete_key_store(int id){
        int result = 0;
        try {
            String query="DELETE FROM key_storeWHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_key_store Err>>"+e);
        }
        return result;
    }
    public int delete_key_store2(int user_id){
        int result = 0;
        try {
            String query="DELETE FROM key_storeWHERE user_id="+user_id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_key_store2 Err>>"+e);
        }
        return result;
    }
    
    public int update_key_store(Key_Store obj){
        int result =0;
        try {
            String query="UPDATE key_store SET user_id="+obj.user_id+",keycode='"+obj.keycode+"',dt='"+obj.dt+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_key_store Err>>"+e);
        }
        return result;
    }
     public Key_Store select_key_store(int id){
        Key_Store obj =null;
        try {
            String query="SELECT id,user_id,keycode,dt FROM key_store WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,user_id,keycode,dt
                id = rset.getInt("id");
               int user_id = rset.getInt("user_id");
               String keycode= rset.getString("keycode");
               String dt= rset.getString("dt");
               obj = new Key_Store(id, user_id, keycode, dt);
               
               
            }
        } catch (SQLException e) {
            System.out.println("select_key_store Err>>"+e);
        }
        return obj;
    }
 public Key_Store select_key_store2(int user_id){
        Key_Store obj =null;
        try {
            String query="SELECT id,user_id,keycode,dt FROM key_store WHERE user_id="+user_id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,user_id,keycode,dt
               int id = rset.getInt("id");
               user_id = rset.getInt("user_id");
               String keycode= rset.getString("keycode");
               String dt= rset.getString("dt");
               obj = new Key_Store(id, user_id, keycode, dt);
               
               
            }
        } catch (SQLException e) {
            System.out.println("select_key_store Err>>"+e);
        }
        return obj;
    }
    public ArrayList<Key_Store> selectAll_key_store(){
        ArrayList<Key_Store> objList = new ArrayList<Key_Store>();
        try {
            String query="SELECT id,user_id,keycode,dt FROM key_store ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               Key_Store obj;
               int    id = rset.getInt("id");
               int user_id = rset.getInt("user_id");
               String keycode= rset.getString("keycode");
               String dt= rset.getString("dt");
               obj = new Key_Store(id, user_id, keycode, dt);
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_key_store Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    
    //5. signature_index - id,file_id,signature,dt
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_signature_index(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM signature_index";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("getMaxID_signature_index Err>>"+e);
        }
        return mid;
    }

    public int insert_signature_index(Signature_Index obj){
        int result =0;
        try {
            String query="INSERT INTO signature_index(id,file_id,signature,dt) VALUES("+obj.id+","+obj.file_id+",'"+obj.signature+"','"+obj.dt+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("insert_signature_index Err>>"+e);
        }
        return result;
    }
    public int delete_signature_index(int id){
        int result = 0;
        try {
            String query="DELETE FROM signature_index WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_signature_index Err>>"+e);
        }
        return result;
    }
    
    public int update_signature_index(Signature_Index obj){
        int result =0;
        try {
            String query="UPDATE signature_index SET file_id="+obj.file_id+",signature='"+obj.signature+"',dt='"+obj.dt+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_signature_index Err>>"+e);
        }
        return result;
    }
     public Signature_Index select_signature_index(int id){
        Signature_Index obj =null;
        try {
            String query="SELECT id,file_id,signature,dt FROM signature_index WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,file_id,signature,dt
                id = rset.getInt("id");
               int file_id = rset.getInt("file_id");
               String signature= rset.getString("signature");
               String dt= rset.getString("dt");
               obj =new Signature_Index(id, file_id, signature, dt);
            }
        } catch (SQLException e) {
            System.out.println("select_signature_index Err>>"+e);
        }
        return obj;
    }

    public ArrayList<Signature_Index> selectAll_signature_index(){
        ArrayList<Signature_Index> objList = new ArrayList<Signature_Index>();
        try {
            String query="SELECT id,file_id,signature,dt FROM signature_index ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               Signature_Index obj;
               int    id = rset.getInt("id");
               int file_id = rset.getInt("file_id");
               String signature= rset.getString("signature");
               String dt= rset.getString("dt");
               obj =new Signature_Index(id, file_id, signature, dt);
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_signature_index Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    
    //6. file_store - id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_file_store(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM file_store";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("getMaxID_file_store Err>>"+e);
        }
        return mid;
    }

    public int insert_file_store(File_Store obj){
        int result =0;
        try {
            String query="INSERT INTO file_store(id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt) VALUES("+obj.id+","+obj.user_id+",'"+obj.file_name+"','"+obj.file_type+"','"+obj.file_newname+"','"+obj.file_address+"','"+obj.file_size+"','"+obj.email+"','"+obj.con_key+"','"+obj.file_tags+"','"+obj.dt+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("insert_file_store Err>>"+e);
        }
        return result;
    }
    public int delete_file_store(int id){
        int result = 0;
        try {
            String query="DELETE FROM file_store WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_file_store Err>>"+e);
        }
        return result;
    }
    
    public int update_file_store(File_Store obj){
        int result =0;
        try {
            String query="UPDATE file_store SET user_id="+obj.user_id+",file_name='"+obj.file_name+"',file_type='"+obj.file_type+"',file_newname='"+obj.file_newname+"',file_address='"+obj.file_address+"',file_size='"+obj.file_size+"',email='"+obj.email+"',con_key='"+obj.con_key+"',file_tags='"+obj.file_tags+"',dt='"+obj.dt+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_file_store Err>>"+e);
        }
        return result;
    }
     public File_Store select_file_store(int id){
        File_Store obj =null;
        try {
            String query="SELECT id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt FROM file_store WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt
                 id = rset.getInt("id");
                int user_id = rset.getInt("user_id");
                String file_name= rset.getString("file_name");
                String file_type= rset.getString("file_type");
                String file_newname= rset.getString("file_newname");
                String file_address= rset.getString("file_address");
                String file_size= rset.getString("file_size");
                String email= rset.getString("email");
                String con_key= rset.getString("con_key");
                String file_tags= rset.getString("file_tags");
                String dt= rset.getString("dt");
               
                obj = new File_Store(id, user_id, file_name, file_type, file_newname, file_address, file_size, email, con_key, file_tags, dt);
            }
        } catch (SQLException e) {
            System.out.println("select_file_store Err>>"+e);
        }
        return obj;
    }

    public ArrayList<File_Store> selectAll_file_store(){
        ArrayList<File_Store> objList = new ArrayList<File_Store>();
        try {
            String query="SELECT id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt FROM file_store ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               File_Store obj;
               int      id = rset.getInt("id");
                int user_id = rset.getInt("user_id");
                String file_name= rset.getString("file_name");
                String file_type= rset.getString("file_type");
                String file_newname= rset.getString("file_newname");
                String file_address= rset.getString("file_address");
                String file_size= rset.getString("file_size");
                String email= rset.getString("email");
                String con_key= rset.getString("con_key");
                String file_tags= rset.getString("file_tags");
                String dt= rset.getString("dt");
               
                obj = new File_Store(id, user_id, file_name, file_type, file_newname, file_address, file_size, email, con_key, file_tags, dt);
                objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_file_store Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    
    //7. file_access - id,file_id,user_id,fname,key,status,dt,tags
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_file_access(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM file_access";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("getMaxID_file_access Err>>"+e);
        }
        return mid;
    }

    public int insert_file_access(File_Access obj){
        int result =0;
        try {
            String query="INSERT INTO file_access(id,file_id,user_id,fname,key,status,dt,tags) VALUES("+obj.id+","+obj.file_id+","+obj.user_id+",'"+obj.fname+"','"+obj.key+"','"+obj.status+"','"+obj.dt+"','"+obj.tags+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("insert_file_access Err>>"+e);
        }
        return result;
    }
    public int delete_file_access(int id){
        int result = 0;
        try {
            String query="DELETE FROM file_access WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_file_access Err>>"+e);
        }
        return result;
    }
    
    public int update_file_access(File_Access obj){
        int result =0;
        try {
            String query="UPDATE file_access SET file_id="+obj.file_id+",user_id="+obj.user_id+",fname='"+obj.fname+"',key='"+obj.key+"',status='"+obj.status+"',dt='"+obj.dt+"',tags='"+obj.tags+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_file_access Err>>"+e);
        }
        return result;
    }
     public File_Access select_file_access(int id){
        File_Access obj =null;
        try {
            String query="SELECT id,file_id,user_id,fname,key,status,dt,tags FROM file_access WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,file_id,user_id,fname,key,status,dt,tags
                id = rset.getInt("id");
               int file_id = rset.getInt("file_id");
               int user_id = rset.getInt("user_id");
               String fname= rset.getString("fname");
               String key= rset.getString("key");
               String status= rset.getString("status");
               String dt= rset.getString("dt");
               String tags= rset.getString("tags");
               
               obj = new File_Access(id, file_id, user_id, fname, key, status, dt, tags);
            }
        } catch (SQLException e) {
            System.out.println("select_file_access Err>>"+e);
        }
        return obj;
    }

    public ArrayList<File_Access> selectAll_file_access(){
        ArrayList<File_Access> objList = new ArrayList<File_Access>();
        try {
            String query="SELECT id,file_id,user_id,fname,key,status,dt,tags FROM file_access ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               File_Access obj ;
               int     id = rset.getInt("id");
               int file_id = rset.getInt("file_id");
               int user_id = rset.getInt("user_id");
               String fname= rset.getString("fname");
               String key= rset.getString("key");
               String status= rset.getString("status");
               String dt= rset.getString("dt");
               String tags= rset.getString("tags");
               
               obj = new File_Access(id, file_id, user_id, fname, key, status, dt, tags);
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_file_access Err>>"+e);
        }
        return objList;
    }
   
    public ArrayList<File_Access> selectAll_file_access(int user_id){
        ArrayList<File_Access> objList = new ArrayList<File_Access>();
        try {
            String query="SELECT id,file_id,user_id,fname,key,status,dt,tags FROM file_access WHERE user_id="+user_id;
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               File_Access obj ;
               int     id = rset.getInt("id");
               int file_id = rset.getInt("file_id");
                user_id = rset.getInt("user_id");
               String fname= rset.getString("fname");
               String key= rset.getString("key");
               String status= rset.getString("status");
               String dt= rset.getString("dt");
               String tags= rset.getString("tags");
               
               obj = new File_Access(id, file_id, user_id, fname, key, status, dt, tags);
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_file_access Err>>"+e);
        }
        return objList;
    }
   
    /******************************************************************/
    
    //8. user_log - id,user_id,action,dt
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_user_log(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM user_log";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("getMaxID_user_log Err>>"+e);
        }
        return mid;
    }

    public int insert_user_log(User_Log obj){
        int result =0;
        try {
            String query="INSERT INTO user_log(id,user_id,action,dt) VALUES("+obj.id+","+obj.user_id+",'"+obj.action+"','"+obj.dt+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("insert_user_log Err>>"+e);
        }
        return result;
    }
    public int delete_user_log(int id){
        int result = 0;
        try {
            String query="DELETE FROM user_log WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_user_log Err>>"+e);
        }
        return result;
    }
    
    public int update_user_log(User_Log obj){
        int result =0;
        try {
            String query="UPDATE user_log SET user_id="+obj.user_id+",action='"+obj.action+"',dt='"+obj.dt+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_user_log Err>>"+e);
        }
        return result;
    }
     public User_Log select_user_log(int id){
        User_Log obj =null;
        try {
            String query="SELECT id,user_id,action,dt FROM user_log WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,user_id,action,dt
                id = rset.getInt("id");
               int user_id = rset.getInt("user_id");
               String action= rset.getString("action");
               String dt= rset.getString("dt");
               
               obj = new User_Log(id, user_id, action, dt);
               
            }
        } catch (SQLException e) {
            System.out.println("select_user_log Err>>"+e);
        }
        return obj;
    }
    

    public ArrayList<User_Log> selectAll_user_log(){
        ArrayList<User_Log> objList = new ArrayList<User_Log>();
        try {
            String query="SELECT id,user_id,action,dt FROM user_log ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               User_Log obj;
               int     id = rset.getInt("id");
               int user_id = rset.getInt("user_id");
               String action= rset.getString("action");
               String dt= rset.getString("dt");
               
               obj = new User_Log(id, user_id, action, dt);
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_user_log Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    
    //9. file_share - id,file_id,user_id,share_user_id,status,dt
    
    /******************************************************************/
    /**
     * 
     * @return 
     */
    public int getMaxID_file_share(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM file_share";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("getMaxID_file_share Err>>"+e);
        }
        return mid;
    }

    public int insert_file_share(File_Share obj){
        int result =0;
        try {
            String query="INSERT INTO file_share(id,file_id,user_id,share_user_id,status,dt) VALUES("+obj.id+","+obj.file_id+","+obj.user_id+","+obj.share_user_id+",'"+obj.status+"','"+obj.dt+"')";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("insert_file_share Err>>"+e);
        }
        return result;
    }
    public int delete_file_share(int id){
        int result = 0;
        try {
            String query="DELETE FROM file_share WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("delete_file_share Err>>"+e);
        }
        return result;
    }
    
    public int update_file_share(File_Share obj){
        int result =0;
        try {
            String query="UPDATE file_share SET file_id="+obj.file_id+",user_id="+obj.user_id+",share_user_id="+obj.share_user_id+",status='"+obj.status+"',dt='"+obj.dt+"' WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println("update_file_share Err>>"+e);
        }
        return result;
    }
     public File_Share select_file_share(int id){
        File_Share obj =null;
        try {
            String query="SELECT id,file_id,user_id,share_user_id,status,dt FROM file_share WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
                //id,file_id,user_id,share_user_id,status,dt
                id = rset.getInt("id");
               int file_id = rset.getInt("file_id");
               int user_id = rset.getInt("user_id");
               int share_user_id = rset.getInt("share_user_id");
               String status= rset.getString("status");
               String dt= rset.getString("dt");
               
               obj = new File_Share(id, file_id, user_id, share_user_id, status, dt);
            }
        } catch (SQLException e) {
            System.out.println("select_file_share Err>>"+e);
        }
        return obj;
    }

    public ArrayList<File_Share> selectAll_file_share(){
        ArrayList<File_Share> objList = new ArrayList<File_Share>();
        try {
            String query="SELECT id,file_id,user_id,share_user_id,status,dt FROM file_share ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               File_Share obj;
               int      id = rset.getInt("id");
               int file_id = rset.getInt("file_id");
               int user_id = rset.getInt("user_id");
               int share_user_id = rset.getInt("share_user_id");
               String status= rset.getString("status");
               String dt= rset.getString("dt");
               
               obj = new File_Share(id, file_id, user_id, share_user_id, status, dt);
               
               objList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("selectAll_file_share Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    
    
    
    /******************************************************************
    public int getMaxID_(){
        int mid =0;
        try {
            String query="SELECT MAX(id) FROM **";
             ResultSet rset = executeQuery(query);
            if(rset.next()){
                mid = rset.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(" Err>>"+e);
        }
        return mid;
    }

    public int insert_(Object obj){
        int result =0;
        try {
            String query="INSERT INTO **() VALUES()";
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println(" Err>>"+e);
        }
        return result;
    }
    public int delete_(int id){
        int result = 0;
        try {
            String query="DELETE FROM ** WHERE id="+id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println(" Err>>"+e);
        }
        return result;
    }
    
    public int update_(Object obj){
        int result =0;
        try {
            String query="UPDATE ** SET ** WHERE id="+obj.id;
             result = executeUpdate(query);
        } catch (Exception e) {
            System.out.println(" Err>>"+e);
        }
        return result;
    }
     public Object select_(int id){
        Object obj =null;
        try {
            String query="SELECT ** FROM ** WHERE id="+id;
            ResultSet rset = executeQuery(query);
            if(rset.next()){
               int id = rset.getInt("id");
               String uname= rset.getString("uname");
            }
        } catch (SQLException e) {
            System.out.println(" Err>>"+e);
        }
        return obj;
    }

    public ArrayList<Object> selectAll_(){
        ArrayList<Object> objList = new ArrayList<Object>();
        try {
            String query="SELECT ** FROM ** ";
            ResultSet rset = executeQuery(query);
            while(rset.next()){
               
            }
        } catch (SQLException e) {
            System.out.println(" Err>>"+e);
        }
        return objList;
    }
   
    
    /******************************************************************/
    public static void main(String[] args) {
    }
}
