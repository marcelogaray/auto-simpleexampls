/*
 * @ PreparingCoffe.java 1.0.1 6/21/18 2:07 PM
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learninginterfaces;

public class PreparingCoffe {
    public static void main(String[] args) {
        MakingCoffe liz = new Boulder();
        System.out.println(liz.makeCoffe());

        MakingCoffe mile = new BoxcarCoffeRoasters();
        System.out.println(mile.makeCoffe());

        MakingCoffe alain = new BlueBottleCoffeShop();
        System.out.println(alain.makeCoffe());
    }
}
