package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.action.*;
import ru.job4j.tracker.action.UserAction;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.Mock;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.Stub;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    void whenCreateItem() {
        Output output = new Stub();
        Input input = new Mock(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Create(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    void whenReplaceItem() {
        Output output = new Stub();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replace name"));
        String replaceName = "New replace name";
        Input input = new Mock(
                new String[] {"0", String.valueOf(item.getId()), replaceName, "1"}
        );
        UserAction[] actions = {
                new Replace(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replaceName);
    }

    @Test
    void whenDeleteItem() {
        Output output = new Stub();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Delete name"));
        Input input = new Mock(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new Delete(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
        }

    @Test
    void whenExit() {
        Output output = new Stub();
        Input input = new Mock(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString()).isEqualTo("Меню:" + System.lineSeparator()
                                                + "0. Завершить программу" + System.lineSeparator()
                                                + "=== Завершение программы ===" + System.lineSeparator()
        );
    }

    @Test
    void whenReplaceItemTestOutputIsSuccessfully() {
        Output output = new Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input input = new Mock(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[] {
                new Replace(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Изменение заявки ===" + ln
                        + "Заявка заменена успешно" + ln
                        + "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindAllItemTestOutputIsSuccessfully() {
        Output output = new Stub();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        Item three = tracker.add(new Item("test3"));
        Input input = new Mock(
                new String[] {"0", "1"}
        );
        UserAction[] actions = new UserAction[] {
                new FindAll(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                + "0. Показать все заявки" + ln
                + "1. Завершить программу" + ln
                + "=== Вывод всех заявок ===" + ln
                + one + ln
                + two + ln
                + three + ln
                + "Меню:" + ln
                + "0. Показать все заявки" + ln
                + "1. Завершить программу" + ln
                + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindItemByNameTestOutputIsSuccessfully() {
        Output output = new Stub();
        Tracker tracker = new Tracker();
        tracker.add(new Item("test1"));
        Item test = tracker.add(new Item("test2"));
        tracker.add(new Item("test3"));
        String searchName = "test2";
        Input input = new Mock(
                new String[] {"0", searchName, "1"}
        );
        UserAction[] actions = new UserAction[] {
                new FindByName(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать заявки по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Поиск заявки по имени ===" + ln
                        + test + ln
                        + "Меню:" + ln
                        + "0. Показать заявки по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindItemByIdTestOutputIsSuccessfully() {
        Output output = new Stub();
        Tracker tracker = new Tracker();
        tracker.add(new Item("test1"));
        Item test = tracker.add(new Item("test2"));
        tracker.add(new Item("test3"));
        String searchName = "2";
        Input input = new Mock(
                new String[] {"0", searchName, "1"}
        );
        UserAction[] actions = new UserAction[] {
                new FindById(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Поиск заявки по id ===" + ln
                        + test + ln
                        + "Меню:" + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }
}