import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestWikiSoftAssertions {
    @Test

    void wikiPages(){
        browserSize = "1920x1080";
        open("https://github.com/selenide/selenide");

        $("#repository-container-header nav").$$("li").get(5).click();
        //$("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();//Реализация через поиск
        $(".js-wiki-sidebar-toggle-display ul").$$("li").last().$("button").click();
        //$$(".js-wiki-sidebar-toggle-display ul").$("li").$("a").click();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
        holdBrowserOpen = true;

    }
}
