package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {

    public static final Target INPUT_NAME = Target.the("Where do we write the name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the Last Name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("where do we write the month").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("where do we write the day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("whe do we write the year").located(By.id("birthYear"));
    public static final Target ENTER_BUTTON = Target.the("button to next").located(By.xpath("//*[@id=/'regs_container/']/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
