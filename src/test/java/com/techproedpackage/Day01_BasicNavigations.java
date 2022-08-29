package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        // Set driver and path
        System.setProperty("webdriver.chrome.driver","C:/Selenium Dependencies/Drivers/chromedriver.exe");

        // Create web-driver object
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Start your test case
        driver.get("https://www.youtube.com");// get("URL") -> go to a URL

        //Wait for 3 seconds at this point
        Thread.sleep(3000);

        // On the same class, Navigate to amazon home page https:/www.amazon.com
        driver.navigate().to("https:/www.amazon.com");

        // Navigate back to YouTube
        driver.navigate().back();

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

        // Close/Quit the browser
        //driver.close();
        // OR
        driver.quit();

        /*
         * 1. What is the difference between get and navigate?
         * Similarities: Both opens a page URl.
         * Differences:  1. get() accepts the string url, navigate can be used with to()
         *               2. get cannot be used to going back, forward and refresh; navigate can be used for going back and forward
         *               3. get() accepts only string; navigate accepts string OR URl as parameter
         *
         * 2. What is the difference between close and quit?
         *                1. close -> closes only ACTIVE WORKING WINDOW
         *                2. quite -> closes ALL working windows
         *
         */
    }
}
