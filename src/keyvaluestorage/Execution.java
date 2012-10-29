/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyvaluestorage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Александр
 */
public class Execution {

    static Book book = InitData.getInit();
    
    public static void Add(String name, String number) {
        book.Add(name, number);
    }

    public static List<Record> Get(String name) {
        return book.Get(name);
    }

    public static void Update(String name, String number) {
        book.Update(name, number);
    }

    public static void Delete(String name) {
        book.Delete(name);
    }

    public static void displayBook() {
        book.Display();
    }
    public static void Commit(){
        book.Commit();
    }
}
