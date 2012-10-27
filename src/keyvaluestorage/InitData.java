/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyvaluestorage;

/**
 *
 * @author Александр
 */
public class InitData {
    public static Book getInit(){
        Book book = new Book();
        
        book.Add("Petrov_Igor","+79271683429");
        book.Add("Saharov_Pavel","88137866058");
        book.Add("Pavlova_Anna","88137864393");
        book.Add("Nosov_Maxim","ololo");
        book.Add("Agafonov_Semen","03");
        
        return book;
}
    
}
