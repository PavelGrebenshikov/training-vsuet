package Interfaces;

import Classes.FileArchive;

import java.util.ArrayList;

public interface FileArchiveInterface {

    public String getNameFile();
    public String getDateOfCreation();

    public ArrayList<String> getFiles();

}
