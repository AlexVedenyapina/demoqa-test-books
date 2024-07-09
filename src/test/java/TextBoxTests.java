import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    /**
     * 
     */
    @Test
    void fileFromTest(){
        open("https://demoqa.com/text-box");
        $("[#userName]").setValue("Sonya Mironova");
        $("[#userEmail]").setValue("Sonya@Mironova.tu");
        $("[#currentAddress]").setValue("Stavropol, ul. Yujnaya 432");
        $("[#permanentAddress]").setValue("Stavropol, ul. Kirilova 43");
        $("#submit").click();

        $("#output").shouldHave(text("Sonya Mironova"), text("Sonya@Mironova.tu"), text("Stavropol, ul. Yujnaya 432"),
        text("Stavropol, ul. Kirilova 43"));

    }
    
}
