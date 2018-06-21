/*
 * @ BlueBottleCoffeShop.java 1.0.1 6/21/18 2:07 PM
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learninginterfaces;

public class BlueBottleCoffeShop implements MakingCoffe {

    /**
     * Each method is forced to prepare its own coffee
     * @return
     */
    @Override
    public String makeCoffe() {
        return "Blue bootle coffe shop";
    }
}
