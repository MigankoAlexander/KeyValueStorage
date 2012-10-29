/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import keyvaluestorage.BadCommandParameters;

/**
 *
 * @author Александр
 */
public class Commit implements Command {

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
        keyvaluestorage.Execution.Commit();
    }
}
