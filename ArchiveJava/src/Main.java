import Classes.FileArchiveManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileArchiveManager manager = new FileArchiveManager();
        Scanner scanner = new Scanner(System.in);

        manager.writeToZipFile("LOW.zip", "test.txt", "");

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать архив");
            System.out.println("2. Удалить архив");
            System.out.println("3. Просмотреть содержимое архива");
            System.out.println("4. Добавить файл в архив");
            System.out.println("5. Удалить файл из архива");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после ввода числа

            switch (choice) {
                case 1:
                    System.out.println("Введите наименование архива:");
                    String name = scanner.nextLine();
                    System.out.println("Введите дату создания архива:");
                    String dateCreated = scanner.nextLine();
                    manager.createArchive(name, dateCreated);
                    break;
                case 2:
                    System.out.println("Введите наименование архива для удаления:");
                    String deleteName = scanner.nextLine();
                    manager.deleteArchive(deleteName);
                    break;
                case 3:
                    System.out.println("Введите наименование архива для просмотра содержимого:");
                    String viewName = scanner.nextLine();
                    manager.viewArchiveContents(viewName);
                    break;
                case 4:
                    System.out.println("Введите наименование архива, в который нужно добавить файл:");
                    String addArchiveName = scanner.nextLine();
                    System.out.println("Введите имя файла для добавления:");
                    String addFileName = scanner.nextLine();
                    manager.addFileToArchive(addArchiveName, addFileName);
                    break;
                case 5:
                    System.out.println("Введите наименование архива, из которого нужно удалить файл:");
                    String removeArchiveName = scanner.nextLine();
                    System.out.println("Введите имя файла для удаления:");
                    String removeFileName = scanner.nextLine();
                    manager.removeFileFromArchive(removeArchiveName, removeFileName);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

    };
}