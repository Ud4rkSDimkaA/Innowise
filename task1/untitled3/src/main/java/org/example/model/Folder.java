package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement {
    private String name;

    private List<FileSystemElement> elements;

    public Folder(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addElement(FileSystemElement element){
        elements.add(element);
    }

    public List<FileSystemElement> getElements(){
        return elements;
    }
}
