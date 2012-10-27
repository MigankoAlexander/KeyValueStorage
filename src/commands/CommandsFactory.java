/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

/**
 *
 * @author Александр
 */
public class CommandsFactory {

    public static Command getCommand(String name) {
        Command cmd = new BadCommand();
        name = name.toUpperCase().substring(0, 1) + name.substring(1);
        try {
            Class theClass = Class.forName("commands." + name);
            cmd = (Command) theClass.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
        }
        return cmd;
    }
}
