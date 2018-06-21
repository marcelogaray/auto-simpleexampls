/*
 * @ Working.java 1.0.1 6/21/18 2:07 PM
 *
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learningabstracts;

public class Working {

    public static void main(String[] args) {

        Enterprise mile = new ITDepartment("mile.claure");
        System.out.println(mile.getName());


        ITDepartment liz = new ITDepartment("liz.cespedes");
        System.out.println(liz.getName());
        liz.workByHours(8);
        System.out.println(liz.workHours());

    }
}
