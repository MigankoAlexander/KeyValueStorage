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
public class Add implements Command {

    @Override
    public boolean validateParams(List<String> params){
        if (params.size() != 2) {
            return false;
        }
        return true;
    }

    @Override
    public void execute(List<String> params) throws BadCommandParameters {
        if(!validateParams(params)) {
            throw new BadCommandParameters();
        }
    keyvaluestorage.Execution.Add(params.get(0), params.get(1));
    }
}
