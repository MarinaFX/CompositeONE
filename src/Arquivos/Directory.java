package Arquivos;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile{
    private String name;
    private List<Object> dirContent;

    public Directory(String name) {
        this.name = name;
        dirContent = new ArrayList<>();
    }

    public void add(Object object){
        dirContent.add(object);
    }

    @Override
    public void ll() {
        AbstractFile object = null;
        System.out.printf("dir -> %s\n" , name);
        for (Object f : dirContent){
            object = (AbstractFile) f;
            object.ll();
        }
    }
}
