/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staj;

/**
 *
 * @author Excalibur
 */
public class HasNotEnougMoneyException extends Exception {

    public HasNotEnougMoneyException() {
    }

    public HasNotEnougMoneyException(String msg) {
        super(msg);
    }
}
