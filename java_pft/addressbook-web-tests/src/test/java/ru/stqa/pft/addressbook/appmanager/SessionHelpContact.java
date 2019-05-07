package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by akademik2011 on 07.05.2019.
 */
public class SessionHelpContact extends HelperBaseContact {




    public SessionHelpContact(WebDriver wd) {
        super(wd);

    }
    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//input[@value='Login']"));
    }
}
