import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestWikiSoftAssertions {
    @Test

    void wikiPages(){
        open("https://github.com/selenide/selenide");

        $("#repository-container-header nav").$$("li").get(5).click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $(".")
        sleep(10000);
    }
}
