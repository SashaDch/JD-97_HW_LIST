package ru.netology.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskList extends ArrayList<String> {
    @Override
    public boolean add(String elem) {
        System.out.println("Добавлено!");
        return super.add(elem);
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Ваш список дел пуст.\n";
        }
        StringBuilder str = new StringBuilder("Ваш список дел:\n");
        for (int i = 0; i < this.size(); i++) {
            str.append(i + 1);
            str.append(". ");
            str.append(this.get(i));
            str.append("\n");
        }
        return str.toString();
    }

    @Override
    public String remove(int index) {
        try {
            String res = super.remove(index);
            System.out.println("Удалено!");
            return res;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Нет дела с таким номером!");
        }
        return null;
    }

    @Override
    public boolean remove(Object elem) {
        boolean res = super.remove(elem);
        if (res) {
            System.out.println("Удалено!");
        } else {
            System.out.println("Нет такого дела!");
        }
        return res;
    }

    /*
    @Override
    public boolean removeIf(java.util.function.Predicate<? super String> filter) {
        boolean res = super.removeIf(filter);
        if (res) {
            System.out.println("Удалены!");
        } else {
            System.out.println("Нет таких дел!");
        }
        return res;
    }
    */

    public boolean removeByKeyword(String substring) {
        boolean res = false;
        for (Iterator<String> i = iterator(); i.hasNext(); ) {
            if (i.next().toLowerCase().contains(substring)) {
                i.remove();
                res = true;
            }
        }
        if (res) {
            System.out.println("Все подходящие дела удалены!");
        } else {
            System.out.println("Нет таких дел!");
        }
        return res;
    }
}
