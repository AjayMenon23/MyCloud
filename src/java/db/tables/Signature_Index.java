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
public class Signature_Index {
    //5. signature_index - id,file_id,signature,dt
    
    public int id,file_id;
    public String signature,dt;

    public Signature_Index(int id, int file_id, String signature, String dt) {
        this.id = id;
        this.file_id = file_id;
        this.signature = signature;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "Signature_Index{" + "id=" + id + ", file_id=" + file_id + ", signature=" + signature + ", dt=" + dt + '}';
    }
    
    
}
