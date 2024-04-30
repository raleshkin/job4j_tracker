package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output output;

    public FindByIdAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Поиск заявки по id ===");
        int id = input.askInt("Введите id заявки для поиска: ");
        Item item = tracker.findById(id);
        output.println(item != null ? item : "Заявки с id = " + id + " не существует");
        return true;
    }
}
