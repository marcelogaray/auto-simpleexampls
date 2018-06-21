/*
 * @ Students.java 1.0.1 6/21/18 2:07 PM
 *
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 */

package org.chelolearning.automationframework.learningoop;
public class Students extends Trainer {

    public String personalActivities;

    public Students(String username, int age, int phone, int numberWhatsapp){
        super(username, age, phone, numberWhatsapp);
    }

    public Students(String username, int age, int phone, int numberWhatsapp, String personalActivities){
        super(username, age, phone, numberWhatsapp);
        this.personalActivities = personalActivities;
    }

    @Override
    public String getUserName() {
        return this.username.concat(" - ").concat(String.valueOf(this.numberWhatsapp));
    }
}
