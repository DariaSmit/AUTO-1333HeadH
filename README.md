# Проект по автоматизации тестирования страницы вакансии на HH.ru H1

[Вакансия QA automation engineer](https://khimki.hh.ru/vacancy/69115572?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20automation%20engineer)
-------
## Содержание 
* Инструменты 
* Реализованные проверки 
* Jenkins сборка
* Allure репорт
* Запуск с терминала
* Отчет в telegram
* Видео прохождения тестов
-------
## Инструменты 
<img src="https://user-images.githubusercontent.com/110921807/187623033-dce99ef4-26a4-47cd-aa9d-ec01d9bc9d56.svg" width="5%"> <img src="https://user-images.githubusercontent.com/110921807/187623016-1959e45a-cd38-4084-a1f4-d4ea912c2c5a.svg" width=5%> 
<img src="https://user-images.githubusercontent.com/110921807/187625426-975b6eb1-7fde-4475-bb16-59a51b6a0d07.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625436-a436ed9b-c5f8-4e87-b454-56c4e31d8564.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625449-0537214e-69f9-467d-9ec3-e6f78a2f307e.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625466-15575481-05fd-4285-b0e5-8915e90ed0f0.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625496-a1154ac3-2ce5-4049-a181-9d5551affd1a.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625377-57d552a4-69c6-402d-a727-a7656d88e2a3.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625412-958b9fcc-1758-4c0a-92f4-0beaaf9a2985.svg" width="5%">
<img src="(https://user-images.githubusercontent.com/110921807/187625393-371c23e5-3f77-4cd4-ab6e-3ec2c7a687ef.svg" width="5%">
-------
## Реализованные проверки
- Проверка заголовков
- Проверка консоли на ошибку SERVE
- Проверка ключевых слов в описании вакансии
- Проверка интерактивности элемента
- Проверка кнопки 'Откликнуться' с некорректным эмеил
- Проверка кнопки 'Откликнуться' c корректным эмеил

# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
