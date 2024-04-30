package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output output;

    public FindByNameAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявки по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Поиск заявки по имени ===");
        output.println("Введине имя заявки: ");
        String name = input.askStr("Введине имя заявки: ");
        Item[] items = tracker.findByName(name);
        output.println(items.length);
        if (items.length > 0) {
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Заявки с именем \"" + name + "\" не найдены");
        }
        return true;
    }
}
