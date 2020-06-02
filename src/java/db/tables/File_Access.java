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
public class File_Access {
    //7. file_access - id,file_id,user_id,fname,key,status,dt,tags
    
    public int id,file_id,user_id;
    public String fname,key,status,dt,tags;

    public File_Access(int id, int file_id, int user_id, String fname, String key, String status, String dt, String tags) {
        this.id = id;
        this.file_id = file_id;
        this.user_id = user_id;
        this.fname = fname;
        this.key = key;
        this.status = status;
        this.dt = dt;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "File_Access{" + "id=" + id + ", file_id=" + file_id + ", user_id=" + user_id + ", fname=" + fname + ", key=" + key + ", status=" + status + ", dt=" + dt + ", tags=" + tags + '}';
    }
    
    
}
