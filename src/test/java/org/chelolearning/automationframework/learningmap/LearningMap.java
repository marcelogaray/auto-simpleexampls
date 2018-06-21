/*
 * @ LearningMap.java 1.0.1 6/21/18 2:07 PM
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learningmap;

import java.util.HashMap;
import java.util.Map;

/**
 * This class will helps us to understand a MAP
 */
public class LearningMap {
    public static void main(String[] args) {
        //Sunitha is a person
        Map<String, String> sunithaBag = new HashMap<>();
        sunithaBag.put("key car", "it is an especifc value in it");
        sunithaBag.put("makeup", "her best makeup will put in her bag");
        sunithaBag.put("redbull", "she needs a this type of drink");

        //once you push everything that you need, just we need to pick up one of them as unique. in this way
        //and we are going to print it.
        System.out.println(sunithaBag.get("key car"));

        //if we need to look for everything we need to use this one
        for (Map.Entry<String, String> itemInTheBag : sunithaBag.entrySet()) {
            System.out.println(itemInTheBag.getKey() +  " - " + itemInTheBag.getValue());
        }

        //lambda
        sunithaBag.entrySet().forEach(data -> System.out.println(data.getKey() + " - " + data.getValue()));
    }
}
