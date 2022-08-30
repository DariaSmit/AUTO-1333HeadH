package cloud.autotests.tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ButtonTest extends TestBase {

    @Description("Проверка страницы вакансии на HH.ru")
    @Story("проверка кнопки 'Откликнуться' с некорректным эмеил")
    @Test
    void genTestButton() {
        step("открыть страницу вакансии", () -> {
            Selenide.open("/vacancy/69115572?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20automation%20engineer");
        });
        step("Нажать на кнопку 'Откликнуться'", () -> {
            $(".bloko-button_kind-success").click();
        });
        step("ввести некорректный эмеил ", () -> {
            $(byName("login")).click();
            $(byName("login")).setValue("AaaYandex.re");
            $(".signup-submit span").click();
            $x("//*[@class=\"bloko-form-error bloko-form-error_entering\"]").shouldHave(text("Пожалуйста, укажите email или телефон"));
        });
    }

        @Description("Проверка страницы вакансии на HH.ru")
        @Story("проверка кнопки 'Откликнуться' c корректным эмеил")
        @Test
        void genTestButtonTr() {
        step("открыть страницу вакансии", () -> {
                Selenide.open("/vacancy/69115572?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20automation%20engineer");
            });
        step("ввести корректный эмеил ", () -> {
            $(byName("login")).click();
            $(byName("login")).setValue("Aaa@Yandex.ru");
            $(".signup-submit span").click();
            $(".bloko-column_container > p").shouldHave(text("Мы отправили письмо с кодом на почту"));
        });
    }
}
