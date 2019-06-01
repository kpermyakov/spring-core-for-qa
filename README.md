# Тренинг «Введение в Spring для QA» (db)
15 часов.<br/>
_Рассмотрим основные концепции и ограничения Spring в разработке приложений и автотестов. Это актуально и разработчикам автотестов, т.к. Spring поможет снизить трудоемкость их разработки, так и ручным тестировщикам, т.к. им необходимо конфигурировать Spring-приложения перед прогоном тестового набора._

# Для кого
- ручные QA Spring-приложений
- разработчики (любых) автотестов Spring-приложений

# На выходе
- участники поймут структуру Spring-приложений и Spring-based тестов
- смогут ускорить разработку автотестов за счет возможностей Spring и компонентов в его составе

# Программа
## Введение в git (1/0.5)
- Git local workflow
- Git remote workflow

### Практика
- Fork and clone main repo for further development
```
git clone --depth 1 -b <YYYY-MM-project> https://github.com/eugene-krivosheyev/spring-core-for-qa
```
### Pull Requests Demo

## Современный гибкий и тестопригодный дизайн (3/1.5)
### Внутренняя модель качества
- Внутренние атрибуты качества

### OOAD как ответ на запрос бизнеса
- Пример процедурного legacy-кода и вопросы сопровождаемости
- Инкапсуляция
- Полиморфизм и абстракции
- Повторное использование и наследование/делегирование

### Spring-ready архитектура
- Зависимости компонентов: порождающие шаблоны
- Слои

### Практика
- Рефакторинг процедурного legacy-кода
- Layered Design
- DI

## Тестирование Spring-ready системы (2/1)
### Тест-дизайн на примере JUnit-тестов
- Структура теста
- Именования
- Проверки
- Тест-дублеры
- Покрытие

### Практика
- Допокрытие системы до ≥80%

## Обзор фреймворка Spring (3 часа всего / из них 1 час практики)
- [Понятие фреймворка](https://www.programcreek.com/2011/09/what-is-the-difference-between-a-java-library-and-a-framework/) и [контейнеров](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- Spring Core как [DI](https://en.wikipedia.org/wiki/Dependency_injection) Framework
- Концепция AOP и реализация ключевых задач фреймворка с помощью proxies
- Обзор [модулей Spring](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/overview.html)
- Понятие [конфигурации](https://www.tutorialspoint.com/spring/spring_java_based_configuration.htm) и [контекста](https://spring.io/understanding/application-context)

### Live coding demo
- Обзор [зависимостей](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/overview.html#dependency-management) и структуры типового Spring Application
- [Компоненты/бины](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics), неявный аспект их именования
- Сборка и запуск приложения

### Practice Iteration 0
- Сборка и запуск приложения
- Локализация и решение проблем

## Конфигурация приложения для test и production (3/1)
### Конфигурация
- Способы конфигурирования: [java](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-annotation-config), [xml, groovy](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- [Структура конфигурации](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- [Декларация компонентов](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-definition)
- [Инициализация компонентов](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-factory-class)
- [Внедрение зависимостей](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-dependencies)
- [Жизненный цикл компонентов и Scopes](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-factory-scopes)
- [SpEL](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#expressions)
- [Валидация данных модели](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#validation-beanvalidation-overview)
- [Профили](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-definition-profiles)

### Тестовая конфигурация и профили
- [Обзор модульных и интеграционных тестов в Spring](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#testing-introduction)
- [Нужный junit4 runner](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#testcontext-support-classes)
- Тесты как компоненты Spring: [аннотации для тестов](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#integration-testing-annotations-spring), [для junit4](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#integration-testing-annotations-junit4) и [стандартные аннотации](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#integration-testing-annotations-standard)
- [Вспомогательный фреймворк TestContext](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#testcontext-framework)
- [Кеширование контекста](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#testcontext-ctx-management-caching)
- Тест-дублеры: графы стабов
- Тестовые и production профили
- [Утилиты работы с JDBC](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#integration-testing-support-jdbc)
- [Управление транзакциями](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#testcontext-tx-annotation-demo)

### Live coding demo
- Обзор тестовой кодовой базы
- Сборка приложения и тестов и запуск тестов

### Practice Iteration 1
- Покрытие модульными и интеграционными тестами
- Тестовые конфигурации
- Сборка и запуск тестовых наборов

## Жизненный цикл компонентов Spring и их вызовы (3/1.5)
- [Обзор AOP](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#aop)
- Lazy-инициализация компонентов
- События жизненного цикла компонента и их обработчики @PostConstruct и @PreDestroy
- Управление безопасностью
- Управление транзакциями
- Управление повторами операций
- Управление асинхронностью
- Управление кешированием
- Ресурсы как частный случай компонентов

### Corner Cases for Bean declaration and initialization
#### Type Switching anti-pattern(?)
- @Primary
- @Qualifier("id")

#### Declaration
- Два бина с одинаковым id в одной секции beans – ошибка инициалиазации контекста
- Два бина с одинаковым id в разных секциях beans (два xml или профили в одном xml): последний заданный overrides первый
- Бин, заданный в xml без id, ищется только по типу
- Бин, заданный в xml без id, не инъектируется @Autowired. Надо ref в xml
- Бин, заданный как @Component, автоматом получает id. @Component("newId") _переопределяет_ дефолтный id
- Бин с дублирующимся id, определенный в xml, overrides бин, заданный как @Component
- Бин с дублирующимся id, определенный в @Configuration, overrides бин, заданный как @Component
- Бин с дублирующимся id, определенный в @Configuration и xml – берется из xml, skipping определение из @Configuration
- Бин с дублирующимся id, определенный в @Configuration, xml и как @Component – берется из xml, skipping определение из @Configuration

#### Initialization
- Eager service1 depending on eager service2
```
23:25:10.331 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
23:25:10.346 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
......context loaded and prepared......
Getting service1
Got service1
Result of service1's operation call: 84
```
- Lazy service1 depending on eager service2
```
23:26:00.941 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
......context loaded and prepared......
Getting service1
23:26:00.966 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
Got service1
Result of service1's operation call: 84
```
- Eager service1 depending on lazy service2
```
23:26:51.508 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
23:26:51.524 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
......context loaded and prepared......
Getting service1
Got service1
Result of service1's operation call: 84
```
- Lazy service1 depending on lazy service2
```
......context loaded and prepared......
Getting service1
23:27:41.133 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
23:27:41.146 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
Got service1
Result of service1's operation call: 84
```

#### Scopes
- Singleton service1 depending on singleton service2
```
23:45:54.740 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service1'
S1 object constructor
23:45:54.773 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
S2 object constructor
......context loaded and prepared......
Getting service1
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
Getting service1
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
```
- Singleton service1 depending on prototype service2
```
S1 object constructor
S2 object constructor
......context loaded and prepared......
Getting service1
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
Getting service1
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
```
- Prototype service1 depending on singleton service2
```
23:47:43.826 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'service2'
S2 object constructor
......context loaded and prepared......
Getting service1
S1 object constructor
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
Getting service1
S1 object constructor
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
```
- Prototype service1 depending on Prototype service2
```
......context loaded and prepared......
Getting service1
S1 object constructor
S2 object constructor
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
Getting service1
S1 object constructor
S2 object constructor
Got service1
Result of service1's operation call: 84
Result of service1's operation call: 84
```

### Practice Iteration 2
- Допокрытие модульными и интеграционными тестами бизнес-логики
- Собственная логика жизненного цикла
- Конфигурация безопасности, транзакций и retrying
- Сборка и запуск тестовых наборов

## Доступ к данным (3/1)
- [Простейший способ тестировать JPA на Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html#boot-features-testing-spring-boot-applications-testing-autoconfigured-jpa-test)
- Тестовые и production конфигурации РСУБД источников данных
- Понятие Connection Pool
- Spring Data ORM
- Обзор JPA Entities и Persistence Contexts
- Провиженинг схемы БД при изменениях структур данных

### Live coding demo
- CRUD App with JPA Repositories

### Practice Iteration 3
- Реализация CRUD-логики
- Покрытие модульными и интеграционными тестами CRUD-логики
- Сборка и запуск тестовых наборов

## Введение в Spring Boot (1/0)
- Задачи Spring Boot

### Live coding demo
- Рефакторинг Spring CRUD web-приложения на Boot
- Сборка и запуск тестов

---

# Further Reading
- [Spring Books](https://www.baeldung.com/spring-tutorial)
- [Minimal Valuable Reading List](http://tinyurl.com/skilltrekreadinglist)
