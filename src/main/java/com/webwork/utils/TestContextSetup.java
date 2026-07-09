package com.webwork.utils;

public class TestContextSetup {
    private TestBase testBase;

    public TestContextSetup(TestBase testBase) {
        this.testBase = testBase;
    }

    public TestBase getTestBase() {
        return testBase;
    }

}
