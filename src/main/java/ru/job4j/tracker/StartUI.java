package ru.job4j.tracker;
public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Выбрать: ");
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 5) {
                findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    private static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по имени ===");
        System.out.print("Введине имя заявки: ");
        String name = input.askStr("Введине имя заявки: ");
        Item[] items = tracker.findByName(name);
        System.out.println(items.length);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем \"" + name + "\" не найдены");
        }
    }

    private static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по id ===");
        int id = Integer.parseInt(String.valueOf(input.askInt("Введите id заявки для поиска: ")));
        Item item = tracker.findById(id);
        System.out.println(item != null ? item : "Заявки с id = " + id + " не существует");
    }

    private static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = Integer.parseInt(String.valueOf(input.askInt("Укажите id для удаления: ")));
        Item item = tracker.findById(id);
        tracker.delete(id);
        System.out.println(item != null ? "Заявка удалена успешно" : "Ошибка удаления заявки");
    }

    private static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Изменение заявки ===");
        int id = Integer.parseInt(String.valueOf(input.askInt("Введите id: ")));
        String name = input.askStr("Введите имя новой заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка заменена успешно");
        } else {
            System.out.println("Ошибка замены");
        }
    }

    private static void findAllItems(Tracker tracker) {
        System.out.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    private void showMenu() {
        String[] menu = {"Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени",
                "Завершить программу"};
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
