package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ParamTest extends TestBase {

    @CsvSource({
            "AaaYandex.re, Пожалуйста, укажите email или телефон",
            "Aaa@Yandex.ru,"
            })


    @Description("Проверка страницы вакансии на HH.ru")
    @DisplayName("проверка кнопки 'Откликнуться' и проверка появления ошибки на некорректный адрес")
    @ParameterizedTest(name = "проверка эмеил {0} и ответа системы {1} ")
    void genTestButton(String testData, String resultS) {
        step("открыть страницу вакансии", () -> {
            Selenide.open("/vacancy/69115572?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20automation%20engineer");
        });
        step("Нажать на кнопку 'Откликнуться'", () -> {
            $(".bloko-button_kind-success").click();
        });
        step("ввести эмеил ",()->{
            $(byName("login")).click();
            $(byName("login")).setValue(testData);
            $(".signup-submit span").click();
            //(".bloko-form-group p").shouldHave(Condition.attribute(resultS));
            $x("//*[@class=\"bloko-form-error bloko-form-error_entering\"]").shouldHave(text(resultS));
        });
        }
    }
