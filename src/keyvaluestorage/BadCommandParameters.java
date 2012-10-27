/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyvaluestorage;

/**
 *
 * @author Александр
 */
public class BadCommandParameters extends Exception {

    @Override
    public String getMessage() {
        return "Bad command params";
    }
    
}
