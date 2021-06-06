package com.amazon.tests;

import com.amazon.pages.AmazonRegisterPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonRegisterTest {
    Actions actions = new Actions(Driver.getDriver());
    AmazonRegisterPage arp = new AmazonRegisterPage();

   @Test

   public void register() throws InterruptedException {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       Thread.sleep(1000);

       actions.moveToElement(arp.registerNav);
       Thread.sleep(1000);

       actions.moveToElement(arp.startHere).perform();
       Thread.sleep(1000);

       arp.startHere.click();
       Thread.sleep(1000);

       arp.nameBox.sendKeys("Ahmet Karaca");
       Thread.sleep(1000);

       arp.emailBox.sendKeys("akaraca1525458@uzp.com");
       Thread.sleep(1000);

       arp.passwordBox.sendKeys("Ap12345.");

       arp.passwordCheck.sendKeys("Ap12345.");
       Thread.sleep(1000);

       arp.submitButton.click();
       Thread.sleep(2000);

       String title = Driver.getDriver().getTitle();
       System.out.println(title);
       Assert.assertEquals(title,"Bitte bestätigen Sie Ihre Identität");


   }


}
