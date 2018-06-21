/*
 * @ LearningGoodWayInsteadOfSwitch.java 1.0.1 6/21/18 2:07 PM
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learningmapinterfaces;

public class LearningGoodWayInsteadOfSwitch {
    public static void main(String[] args) {
        //This type of case will helps us to recognize any type of scenario that we need to use
        //instead of use SWITCH for example.

        //First execution
        String data1 = DriverFactory.getWebDriverManager(BrowserNavigator.CHROME);
        System.out.println(data1);

        //Second execution
        String data2 = DriverFactory.getWebDriverManager(BrowserNavigator.FIREFOX);
        System.out.println(data2);
    }
}
