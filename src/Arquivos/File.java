package Arquivos;

public class File implements AbstractFile{
    private String name;
    private int KB = 0;

    public File(String name, int KB) {
        this.name = name;
        this.KB = KB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getKB() {
        return KB;
    }

    @Override
    public void ll() {
        System.out.printf("name -> %s \t size -> %d\n", name, KB);
    }
}
