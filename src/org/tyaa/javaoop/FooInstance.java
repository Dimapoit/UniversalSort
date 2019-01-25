/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoop;

/**
 *
 * @author student
 */
public class FooInstance implements IFoo {

    @Override
    public String foo(Integer i) {
        return "Result" + String.valueOf(i);
    }
    
}
