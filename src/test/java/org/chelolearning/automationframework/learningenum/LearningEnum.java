/*
 * @ LearningEnum.java 1.0.1 6/21/18 2:07 PM
 *
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */
package org.chelolearning.automationframework.learningenum;

public enum LearningEnum {
    MILENKA("milenka.claure", 15, 71456123),
    LIZ("liz.cespedez", 15, 70111111);

    private String username;
    private int age;
    private int phone;

    LearningEnum(String username, int age, int phone){
        this.username = username;
        this.age = age;
        this.phone = phone;
    }

    public String getUsername(){
        return this.username;
    }
}