/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.tables;

/**
 *
 * @author kites
 */
public class User_Login {
    //2. user_login - id,uname,passwd,level,status
    public int id;
    public String uname,passwd;
    public int level;
    public String status;

    public User_Login(int id, String uname, String passwd, int level, String status) {
        this.id = id;
        this.uname = uname;
        this.passwd = passwd;
        this.level = level;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User_Login{" + "id=" + id + ", uname=" + uname + ", passwd=" + passwd + ", level=" + level + ", status=" + status + '}';
    }
    
    
}
