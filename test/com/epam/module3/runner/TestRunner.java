package com.epam.module3.runner;

import com.epam.module3.listeners.SuiteListener;
import com.epam.module3.listeners.TestListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class TestRunner {

    public static void main(String[] args) {
        TestListenerAdapter adapter = new TestListenerAdapter();
        TestNG testNG = new TestNG();
        testNG.addListener(adapter);
        testNG.addListener(new TestListener());
        testNG.addListener(new SuiteListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("MySuite");

        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>(){
            {
                add("./Resources/suites/parallel.xml");
                add("./Resources/suites/trigonometry.xml");
            }
        });
        suite.setSuiteFiles(files);


        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        testNG.setXmlSuites(suites);

        testNG.run();

    }

}
