/*
 * @ Trainer.java 1.0.1 6/21/18 2:07 PM
 *
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 *
 */

package org.chelolearning.automationframework.learningoop;

public class Trainer {

    public String username;

    protected  int numberWhatsapp;

    private int age;
    private int phone;

    public Trainer(String username, int age, int phone, int numberWhatsapp){
        this.username = username;
        this.age = age;
        this.phone = phone;
        this.numberWhatsapp = numberWhatsapp;
    }

    public String getUserName() {
        return this.username;
    }
}
