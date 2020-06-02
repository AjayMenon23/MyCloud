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
public class User_Log {
    //8. user_log - id,user_id,action,dt
    
    public int id,user_id;
    public String action,dt;

    public User_Log(int id, int user_id, String action, String dt) {
        this.id = id;
        this.user_id = user_id;
        this.action = action;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "User_Log{" + "id=" + id + ", user_id=" + user_id + ", action=" + action + ", dt=" + dt + '}';
    }
    
    
}
