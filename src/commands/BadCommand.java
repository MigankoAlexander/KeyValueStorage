/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.util.List;
import keyvaluestorage.BadCommandParameters;

/**
 *
 * @author Александр
 */
public class BadCommand implements Command {

    @Override
    public boolean validateParams(List<String> params){
        return true;
    }

    @Override
    public void execute(List<String> params) throws BadCommandParameters {
        System.out.println("bad command");
    }
    
}
