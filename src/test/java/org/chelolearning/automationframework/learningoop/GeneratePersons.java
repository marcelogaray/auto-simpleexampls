/*
 * @ GeneratePersons.java 1.0.1 6/21/18 2:07 PM
 *
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learningoop;

public class GeneratePersons {
    public static void main(String[] args) {

        Students alain = new Students("alain.pardo", 16, 7456456, 75464564);
        System.out.println(alain.getUserName());

        Trainer milenka = new Students("mileka.claure", 15, 712345678, 71111111);
        System.out.println(milenka.getUserName());

        Trainer liz = new Students("liz.cespedes", 15, 700111122, 132146546);
        System.out.println(liz.getUserName());

        Trainer sunitha = new Trainer("sunitha.goyal", 16, 71323213, 45646445);
        System.out.println(sunitha.getUserName());
    }
}
