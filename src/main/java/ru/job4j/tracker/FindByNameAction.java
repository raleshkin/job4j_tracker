package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Показать заявки по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
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
        return true;
    }
}
