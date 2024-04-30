package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по id ===");
        int id = input.askInt("Введите id заявки для поиска: ");
        Item item = tracker.findById(id);
        System.out.println(item != null ? item : "Заявки с id = " + id + " не существует");
        return true;
    }
}
