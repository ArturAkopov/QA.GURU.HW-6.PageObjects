package pages;

import static com.codeborne.selenide.Selenide.executeJavaScript;

interface DropBanner {
    static void dropBanner(){
        executeJavaScript("$('#fixedban').remove();");
        executeJavaScript("$('footer').remove();");
    }
}
