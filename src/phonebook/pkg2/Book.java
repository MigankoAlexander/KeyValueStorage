/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Александр
 */
public class Book {

    private List<Record> book = new ArrayList<>();
    
    public Book() {
    }
    
    public void add(String name, String number){
        Record record = new Record(name, number);
        book.add(record);
    }
    
    public List<Record> get(String name){
        List<Record> suitableRecords = new ArrayList<>();
        for (Record record : book){
            if (record.getName().contains(name)){
                suitableRecords.add(record);
            }
        }
        return suitableRecords;
    }
    
    public void delete (String name){
        for (int index = 0; index < book.size(); index++){
            if(name.equals((book.get(index)).getName())){
                book.remove(index);
            }
        }
    }
    
    public void update (String name, String number){
        for (int index = 0; index < book.size(); index++){
            if(name.equals((book.get(index)).getName())){
                (book.get(index)).setNumber(number);
            }
        }
    }
}
