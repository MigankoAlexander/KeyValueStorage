/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyvaluestorage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Александр
 */
public class Book {

    private static List<Record> book = new ArrayList<>();
    
    public Book() {
    }
    
    public void Add(String name, String number){
        Record record = new Record(name, number);
        book.add(record);
    }
    
    public List<Record> Get(String name){
        List<Record> suitableRecords = new ArrayList<>();
        for (Record record : book){
            if (record.getName().contains(name)){
                suitableRecords.add(record);
            }
        }
        return suitableRecords;
    }
    
    public void Delete (String name){
        for (int index = 0; index < book.size(); index++){
            if(name.equals((book.get(index)).getName())){
                book.remove(index);
            }
        }
    }
    
    public void Update (String name, String number){
        for (int index = 0; index < book.size(); index++){
            if(name.equals((book.get(index)).getName())){
                (book.get(index)).setNumber(number);
            }
        }
    }
    
    
    public void Display (){
        for (int index = 0; index < book.size(); index++){
            System.out.println(book.get(index).getName()+" "+
                    book.get(index).getNumber());
        }
    }
    
}
