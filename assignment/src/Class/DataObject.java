/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author New
 */
public class DataObject {
    public final String Seperator = ",";
    protected DataAccess da;
    
    public DataObject(){
        this.da = new DataAccess();
    }
}
