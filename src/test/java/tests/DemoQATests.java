package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DemoQATests {

    @BeforeAll
    static void beforeAll(){
          Configuration.baseUrl = "https://demoqa.com/";
          Configuration.pageLoadStrategy ="eager";
    }

    @AfterEach
    void closeWebDriver(){
        Selenide.closeWebDriver();
    }

    @Test
    void fillFormTest() {
        open("automation-practice-form");
        $("#firstName").setValue("Artur");
        $("#lastName").setValue("King");
        $("#userEmail").setValue("king@yandex.ru");
        $("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label").click();
        $("#userNumber").setValue("9611111111");
        $("#dateOfBirthInput").click();
        $("#dateOfBirthInput").setValue("04 Nov 1992");
        $("#subjectsInput").setValue("Comp").pressEnter();
        $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label").click();
        $("#uploadPicture").uploadFromClasspath("Example.jpg");
        $("#currentAddress").setValue("Castle Camelot").pressEnter();
        $("#react-select-3-input").setValue("ncr").pressEnter();
        $("#react-select-4-input").setValue("del").pressEnter();
        $("#submit").click();
    }
}
