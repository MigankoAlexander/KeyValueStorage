/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyvaluestorage;

import commands.Command;
import commands.CommandsFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Александр
 */
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("add name number\n"
                + "get name\ndelete name\n"
                + "update name number\n"
                + "show\nquit\n");

        List<String> params = readParameters();
        while (!params.get(0).equals("quit")) {
            executeCommand(params);
            params = readParameters();
        }
        
    }

    private static void executeCommand(List<String> params) {
        //System.out.println("Command execution...");
        String commandName = params.get(0);
        List<String> commandParams = params.subList(1, params.size());

        Command cmd = CommandsFactory.getCommand(commandName);
        try {
            cmd.execute(commandParams);
        } catch (BadCommandParameters ex) {
            System.out.println(ex);
        }

    }

    private static List<String> readParameters() {
        System.out.println("Your command: ");
        Scanner sc = new Scanner(StdIn.readLine());

        List<String> params = new ArrayList();
        while (sc.hasNext()) {
            params.add(sc.next());
        }
        return params;
    }
}
