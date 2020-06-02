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
public class Key_Store {
    //4. key_store - id,user_id,keycode,dt
    
    public int id,user_id;
    public String keycode,dt;

    public Key_Store(int id, int user_id, String keycode, String dt) {
        this.id = id;
        this.user_id = user_id;
        this.keycode = keycode;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "Key_Store{" + "id=" + id + ", user_id=" + user_id + ", keycode=" + keycode + ", dt=" + dt + '}';
    }
    
    
}
