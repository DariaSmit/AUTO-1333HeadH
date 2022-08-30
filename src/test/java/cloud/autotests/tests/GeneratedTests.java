package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    @Test
    @Description("Проверка страницы вакансии на HH.ru")
    @DisplayName("Проверка заголовков")
    void generatedTest() {
        step("открыть hh.ru", () -> {
            Selenide.open("/vacancy/69115572?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20automation%20engineer");
        });
        step("Проверить заголовки верхний меню", () -> {
            $(".supernova-navi").shouldHave(text("Соискателям"));
            $(".supernova-navi").shouldHave(text("Работодателям"));
        });
        step("проверить название вакансии", () -> {
            $(".vacancy-title").shouldHave(text("QA automation engineer"));
        });
    }

    @Test
    @Description("Проверка страницы вакансии на HH.ru")
    @DisplayName("Проверка консоли на ошибку SERVE")
    void genTestCon() {
        step("открыть страницу вакансии", () -> {
            Selenide.open("/vacancy/69115572?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20automation%20engineer");
        });
        step("Посмотреть в консоли на наличие SERVE", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";
            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Description("Проверка страницы вакансии на HH.ru")
    @DisplayName("Проверка ключевых слов в описании")
    void genTestText() {
        step("открыть страницу вакансии", () -> {
            Selenide.open("/vacancy/69115572?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20automation%20engineer");
        });
        step("проверить название навыков 'CI/CD'", () -> {
            $(".vacancy-branded-user-content").shouldHave(text("CI/CD"));
        });
    }

    @Test
    @Description("Проверка страницы вакансии на HH.ru")
    @DisplayName("Проверка интерактивности элемента")
    void genTestInter() {
        step("открыть страницу вакансии", () -> {
            Selenide.open("/vacancy/69115572?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20automation%20engineer");
        });
        step("проверить интерактивность элемента 'Компания готова предоставить'", () -> {
            executeJavaScript("window.scrollTo(0,211)");
            $(".tmpl-hh__swiper-slide-active > .tmpl-hh__item").click();
            $(".tmpl-hh__swiper-slide-active > .tmpl-hh__item").click();
            $(".tmpl-hh__swiper-slide-active > .tmpl-hh__item").click();
            $(".tmpl-hh__company-slider").click();
        });
    }

}