/*
 * @ DriverFactory.java 1.0.1 6/21/18 2:07 PM
 * Created on : 6/21/18 2:07 PM
 * Author     : marcelo.garay
 *
 */

package org.chelolearning.automationframework.learningmapinterfaces;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private DriverFactory(){}

    public static String getWebDriverManager(BrowserNavigator chooseBrowser){
        Map<BrowserNavigator, Browser> allBrowser = new HashMap<>();
        allBrowser.put(BrowserNavigator.CHROME, new Chrome());
        allBrowser.put(BrowserNavigator.FIREFOX, new Firefox());

        return allBrowser.get(chooseBrowser).iniatilizeDriver();
    }
}
