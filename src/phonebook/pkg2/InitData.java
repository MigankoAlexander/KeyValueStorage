/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.pkg2;

/**
 *
 * @author Александр
 */
public class InitData {
    public static Book getInit(){
        Book book = new Book();
        
        book.add("Petrov_Igor","+79271683429");
        book.add("Saharov_Pavel","88137866059");
        book.add("Pavlova_Anna","88137864393");
        book.add("Nosov_Maxim","ololo");
        book.add("Agafonov_Semen","03");
        
        return book;
}
    
}
