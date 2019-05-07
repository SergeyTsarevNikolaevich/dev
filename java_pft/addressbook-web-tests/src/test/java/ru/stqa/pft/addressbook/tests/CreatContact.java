package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class CreatContact extends TestBaseContact {


  @Test
  public void testCreatContact() throws Exception {
    app.getContactHelper().initContactPage();
    app.getContactHelper().fillContactForm(new ContactData("123324", "123423", "sdfsdf", "dsfs", "asdfsde", "sdffrfv"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returntoContactPage();
  }

}
