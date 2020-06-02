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
public class File_Share {
    //9. file_share - id,file_id,user_id,share_user_id,status,dt
    
    public int id,file_id,user_id,share_user_id;
    public String status,dt;

    public File_Share(int id, int file_id, int user_id, int share_user_id, String status, String dt) {
        this.id = id;
        this.file_id = file_id;
        this.user_id = user_id;
        this.share_user_id = share_user_id;
        this.status = status;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "File_Share{" + "id=" + id + ", file_id=" + file_id + ", user_id=" + user_id + ", share_user_id=" + share_user_id + ", status=" + status + ", dt=" + dt + '}';
    }
    
    
}
