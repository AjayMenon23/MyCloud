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
public class User_Detail {
    //3. user_detail - id,name,gender,dob,email,contact,addr,dt
    
    public int id;
    public String name,gender,dob,email,contact,addr,dt;

    public User_Detail(int id, String name, String gender, String dob, String email, String contact, String addr, String dt) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.contact = contact;
        this.addr = addr;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "User_Detail{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", email=" + email + ", contact=" + contact + ", addr=" + addr + ", dt=" + dt + '}';
    }
    
    
}
