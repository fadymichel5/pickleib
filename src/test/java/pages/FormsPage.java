package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pickleib.web.PickleibPageObject;

public class FormsPage extends PickleibPageObject {

    @FindBy(id = "title")
    WebElement title;
}
