/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Александр
 */
public class PhoneBook2 {

    public static void main(String[] args) throws IOException {
        Book book = InitData.getInit();
        
        System.out.print("add name number\n"
                + "get name\ndelete name\n"
                + "update name number\n");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose comand");
        Scanner scanner = new Scanner(reader.readLine());
        scanner.useDelimiter(" ");
        
        String comand = null;
        String name = null;
        String number = null;
        
        while(scanner.hasNext()){
            comand = scanner.next();
            if(scanner.hasNext()){
                name = scanner.next();
                if(scanner.hasNext()){
                    number = scanner.next().trim();
                }
            }
        }
        switch (comand){
            case ("add"):
                book.add(name, number);
            case ("get"):
                List <Record> suitableRecords = new ArrayList<>();
                suitableRecords = book.get(name);
                for (Record record : suitableRecords){
                    record.display();
                }
            case ("delete"):
                book.delete(name);
            case ("update"):
                book.update(name, number);
        }
    }
    
}
