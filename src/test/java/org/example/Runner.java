package org.example;

import org.example.TestClass.TestListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListener());

        XmlSuite suite = new XmlSuite();
        suite.setParallel(XmlSuite.ParallelMode.METHODS);
        suite.setThreadCount(2);
        suite.setSuiteFiles(Arrays.asList("src/test/resources/testing.xml"));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
     }
}
