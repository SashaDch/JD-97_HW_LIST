import ru.netology.tasks.TaskList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList tasks = new TaskList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Выберите операцию:\n" +
                    "0. Выход из программы\n" +
                    "1. Добавить дело\n" +
                    "2. Показать дела\n" +
                    "3. Удалить дело по номеру\n" +
                    "4. Удалить дело по названию\n" +
                    "5. Удалить дело по совпадению\n" +
                    "Ваш выбор: ");
            switch (scanner.nextLine().strip()) {
                case "0":
                    System.out.print("\nПрограмма завершена!");
                    return;
                case "1":
                    System.out.print("\nВведите название задачи: ");
                    tasks.add(scanner.nextLine());
                    break;
                case "2":
                    System.out.println();
                    break;
                case "3":
                    System.out.print("\nВведите номер для удаления: ");
                    try {
                        tasks.remove(Integer.parseInt(scanner.nextLine()) - 1);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат числа!");
                    }
                    break;
                case "4":
                    System.out.print("\nВведите название для удаления: ");
                    tasks.remove(scanner.nextLine());
                    break;
                case "5":
                    System.out.print("\nВведите последовательность для удаления: ");
                    tasks.removeByKeyword(scanner.nextLine().toLowerCase());
                    /*
                    String input = scanner.nextLine().toLowerCase();
                    tasks.removeIf(task -> task.toLowerCase().contains(input));
                    */
                    break;
                default:
                    System.out.println("Неверная опция!");
            }
            System.out.println(tasks);
        }
    }
}
