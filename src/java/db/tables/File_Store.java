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
public class File_Store {
    //6. file_store - id,user_id,file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt
    
    public int id,user_id;
    public String file_name,file_type,file_newname,file_address,file_size,email,con_key,file_tags,dt;

    public File_Store(int id, int user_id, String file_name, String file_type, String file_newname, String file_address, String file_size, String email, String con_key, String file_tags, String dt) {
        this.id = id;
        this.user_id = user_id;
        this.file_name = file_name;
        this.file_type = file_type;
        this.file_newname = file_newname;
        this.file_address = file_address;
        this.file_size = file_size;
        this.email = email;
        this.con_key = con_key;
        this.file_tags = file_tags;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "File_Store{" + "id=" + id + ", user_id=" + user_id + ", file_name=" + file_name + ", file_type=" + file_type + ", file_newname=" + file_newname + ", file_address=" + file_address + ", file_size=" + file_size + ", email=" + email + ", con_key=" + con_key + ", file_tags=" + file_tags + ", dt=" + dt + '}';
    }
    
    
}
