class TextFile extends FileItem {
    private int fileSize;

    public TextFile(int fileSize) {
        System.out.println("TextFile constructor called");
        this.fileSize = fileSize;
    }
    public void openFile() {
        System.out.println("TextFile is opening normally.");

    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void displayInfo() {
        
    }
}