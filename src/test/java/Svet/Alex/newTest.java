package Svet.Alex;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class newTest {

    @Test
    void homeWorkTest(){

        // Открыть целевую страницу
        open("https://github.com/selenide/selenide");

        // переход на wiki проекта
        $(byText("Wiki")).click();

        // клик по Soft assertions
        $(byText("Soft assertions")).click();

        // поиск примера кода для JUnit 5
        $(".markdown-body")
                .shouldHave(text("@ExtendWith"));
    }
}
