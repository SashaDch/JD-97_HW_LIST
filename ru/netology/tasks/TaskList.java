package ru.netology.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskList {
    List<String> tasks = new ArrayList<>();

    public void add(String elem) {
        tasks.add(elem);
        System.out.println("Добавлено!");
    }

    public String toString() {
        if (tasks.isEmpty()) {
            return "Ваш список дел пуст.\n";
        }
        StringBuilder str = new StringBuilder("Ваш список дел:\n");
        for (int i = 0; i < tasks.size(); i++) {
            str.append(i + 1);
            str.append(". ");
            str.append(tasks.get(i));
            str.append("\n");
        }
        return str.toString();
    }

    public void remove(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Удалено!");
        } else {
            System.out.println("Нет дела с таким номером!");
        }
    }

    public void remove(String elem) {
        if (tasks.remove(elem)) {
            System.out.println("Удалено!");
        } else {
            System.out.println("Нет такого дела!");
        }
    }

    public void removeByKeyword(String substring) {
        boolean res = false;
        for (Iterator<String> i = tasks.iterator(); i.hasNext(); ) {
            if (i.next().toLowerCase().contains(substring)) {
                i.remove();
                res = true;
            }
        }
        if (res) {
            System.out.println("Дела удалены!");
        } else {
            System.out.println("Нет таких дел!");
        }
    }
}
