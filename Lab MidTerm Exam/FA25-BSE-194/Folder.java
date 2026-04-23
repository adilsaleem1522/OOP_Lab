public class Folder {
    private String folderName;
    private String path;

    public Folder(String folderName, String path) {
        this.folderName = folderName;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFolderName() {
        return folderName;
    }

}