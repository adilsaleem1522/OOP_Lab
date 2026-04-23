public abstract class FileItem {
    private int field;
    private String fileName;
    private Folder folder;

    public FileItem(int field, String fileName, Folder folder) {
        System.out.println("FileItem constructor called");
        this.field = field;
        this.fileName = filename;
        this.folder = folder;
    }

    public String getFileName() {
        return fileName;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setField(int field) {
        this.field = field;
    }

    public int getField() {
        return field;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public void showSystemType() {

    }

}