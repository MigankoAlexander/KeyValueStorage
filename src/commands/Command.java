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
public interface Command {
    boolean validateParams(List<String> params);
    void execute(List<String> params)  throws BadCommandParameters;
}
