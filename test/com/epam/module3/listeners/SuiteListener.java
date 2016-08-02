package com.epam.module3.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class SuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        suite.getXmlSuite().setParallel(XmlSuite.PARALLEL_METHODS);
        suite.getXmlSuite().setThreadCount(2);
    }

    @Override
    public void onFinish(ISuite suite) {

    }
}
