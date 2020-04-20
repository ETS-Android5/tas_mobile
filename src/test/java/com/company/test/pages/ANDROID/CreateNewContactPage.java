package com.company.test.pages.ANDROID;

import com.company.framework.pageobject.MobileBasePO;
import com.company.framework.pageobject.NewMobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateNewContactPage extends MobileBasePO {

    MobileElement firstName;
    MobileElement lastName;
    MobileElement phoneNumber;
    String firstNameXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]";
    String lastNameXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]";

    public CreateNewContactPage(AppiumDriver driver) {
        super(driver);
    }

    public void enterNameAndLastName() {
        firstName = (MobileElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.xpath(firstNameXpath)));
        firstName.sendKeys("Nicolas");

        lastName = (MobileElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.xpath(lastNameXpath)));
        lastName.sendKeys("Silvestre");
    }

    public void enterPhoneNumber() {
    }

    public void save() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id("com.android.contacts:id/editor_menu_save_button"))).click();
    }
}