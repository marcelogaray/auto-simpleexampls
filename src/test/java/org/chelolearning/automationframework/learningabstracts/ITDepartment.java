/*
 * @ ITDepartment.java 1.0.1 6/21/18 2:07 PM
 *
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learningabstracts;

public class ITDepartment extends Enterprise {
    private int myHours;

    public ITDepartment(String name){
        setName(name);
    }

    public void workByHours(int myHours){
        this.myHours = myHours;
    }

    @Override
    public int workHours() {
        return myHours;
    }
}
