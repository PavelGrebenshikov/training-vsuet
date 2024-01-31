package Classes;

import Interfaces.FileArchiveInterface;

import java.util.ArrayList;

public class FileArchive implements FileArchiveInterface {

    private String nameFile;
    private String dateOfCreation;
    private ArrayList<String> filesList;

    public FileArchive(String nameFile, String dateOfCreation) {
        this.nameFile = nameFile;
        this.dateOfCreation = dateOfCreation;
        this.filesList = new ArrayList<>();
    }

    public void addFile(String fileName) {
        filesList.add(fileName);
    }

    public void removeFile(String fileName) {
        filesList.remove(fileName);
    }

    @Override
    public String getNameFile() {
        return nameFile;
    }

    @Override
    public String getDateOfCreation() {
        return dateOfCreation;
    }

    @Override
    public ArrayList<String> getFiles() {
        return filesList;
    }

}
