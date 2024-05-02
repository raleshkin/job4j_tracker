package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

public class FindById implements UserAction {
    private final Output output;

    public FindById(Output output) {
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
