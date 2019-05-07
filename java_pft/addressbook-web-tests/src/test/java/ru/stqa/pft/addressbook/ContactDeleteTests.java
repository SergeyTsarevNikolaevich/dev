package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBaseContact;

public class ContactDeleteTests extends TestBaseContact {





    @Test
    public void testContactDelete() throws Exception {

        wd.findElement(By.id("6")).click();

        wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select all'])[1]/following::input[2]")).click();

    }

    }



//чисто пробный экземпляр