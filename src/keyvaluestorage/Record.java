/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyvaluestorage;

/**
 *
 * @author Александр
 */
public class Record {
    private String name;
    private String number;
    
    public Record(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void display(){
        System.out.println(name + "  " + number);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
}
