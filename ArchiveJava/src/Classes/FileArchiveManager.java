package Classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.io.*;
import java.util.zip.*;

public class FileArchiveManager {

    private ArrayList<String> archives;
    private Integer LAST_NUMBER_ARCHIVE_NAME = 0;
    private String ROOT_DIR = System.getProperty("user.dir");

    public FileArchiveManager() {
        this.archives = new ArrayList<>();
    }

    public void createArchive(String name, String dateOfCreation) {
        FileArchive archive = new FileArchive(name, dateOfCreation);
        if (!archives.contains(archive.getNameFile()) || archives.contains(archive.getNameFile() + "_0")) {
            archives.add(archive.getNameFile());
            System.out.println("Архив создан: " + name);
        } else {
            LAST_NUMBER_ARCHIVE_NAME += getLastSymbol(archive.getNameFile());
            String fullName = archive.getNameFile() + "_" + LAST_NUMBER_ARCHIVE_NAME.toString();
            archives.add(fullName);
            System.out.println("Архив с названием -> " + archive.getNameFile() + " <- уже существует. Поэтому создан архив -> " + fullName);
        }
    }
    public void viewArchiveContents(String name) {
        for (String archive : archives) {
            if (archive == name) {
                System.out.println("Содержимое архива " + name + ":");
                System.out.println(archive);
                return;
            }
        }
        System.out.println("Архив не найден: " + name);
    }

    public void addFileToArchive(String archiveName, String fileName) {
        FileArchive files = new FileArchive(null, null);
        for (String archive : archives) {
            if (archive == archiveName) {
                files.addFile(fileName);
                System.out.println("Файл добавлен в архив " + archiveName + ": " + fileName);
                return;
            }
        }
        System.out.println("Архив не найден: " + archiveName);
    }

    public void deleteArchive(String name) {
        for (String archive : archives) {
            if (archive == name) {
                archives.remove(archive);
                System.out.println("Архив удален: " + name);
                return;
            }
        }
        System.out.println("Архив не найден: " + name);
    }

    public void removeFileFromArchive(String archiveName, String fileName) {
        FileArchive files = new FileArchive(null, null);
        for (String archive : archives) {
            if (archive == fileName) {
                files.removeFile(fileName);
                System.out.println("Файл удален из архива " + archiveName + ": " + fileName);
                return;
            }
        }
        System.out.println("Архив не найден: " + archiveName);
    }

    public void writeToZipFile(String archiveName, String fileNames,  String pathWhereSaveArchive) {
        if (pathWhereSaveArchive == null || pathWhereSaveArchive.isEmpty()) {
            pathWhereSaveArchive = ROOT_DIR;
        }
        try {
            System.out.println(pathWhereSaveArchive);
            ZipOutputStream zipOutFile = new ZipOutputStream(new FileOutputStream(pathWhereSaveArchive + "/" + archiveName));
            ZipEntry entry = new ZipEntry(fileNames);
            zipOutFile.putNextEntry(entry);
            FileInputStream files = new FileInputStream(pathWhereSaveArchive + "\\" + fileNames);
            byte[] buffer = new byte[files.available()];
            files.read(buffer);
            zipOutFile.write(buffer);
            zipOutFile.close();
            System.out.println("Архив создан: " + pathWhereSaveArchive + "\\" + archiveName);
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int getLastSymbol(String name) {
        String lastSymbol = name.substring(name.length() - 1);
        if (isNumeric(lastSymbol)) {
            return Integer.parseInt(lastSymbol);
        }
        return 1;
    }

    private boolean isNumeric(String symbol) {
        if (symbol == null || symbol.equals("")) {
            return false;
        }
        try {
            int number = Integer.parseInt(symbol);
        } catch (NumberFormatException error) {
            return false;
        }
        return true;
    }


}
