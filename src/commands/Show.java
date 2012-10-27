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
public class Show implements Command{

    @Override
    public boolean validateParams(List<String> params) {
        if (params.size() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public void execute(List<String> params) throws BadCommandParameters {
        if (!validateParams(params)) {
            throw new BadCommandParameters();
        }
        keyvaluestorage.Execution.displayBook();
    }
}
