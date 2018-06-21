/*
 * @ Enterprise.java 1.0.1 6/21/18 2:07 PM
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learningabstracts;

public abstract class Enterprise {
    private String name;

    abstract int workHours();

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return "BARBRI-".concat(this.name);
    }
}
