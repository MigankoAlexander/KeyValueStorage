/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.util.List;
import keyvaluestorage.BadCommandParameters;
import keyvaluestorage.Record;

/**
 *
 * @author Александр
 */
public class Get implements Command {

    @Override
    public boolean validateParams(List<String> params) {
        if (params.size() != 1) {
            return false;
        }
        return true;
    }

    @Override
    public void execute(List<String> params) throws BadCommandParameters {
        if (!validateParams(params)) {
            throw new BadCommandParameters();
        }
        List<Record> records = keyvaluestorage.Execution.Get(params.get(0));
        for (Record record : records) {
            System.out.println(record.getName() + " " + record.getNumber());
        }
    }
}
