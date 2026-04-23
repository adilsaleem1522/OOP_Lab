public class Demo {
    public static void main(String[] args) {
        FileItem.showSystemType();
        Folder f1 = new Folder("Assignments","/docs/assignments");
        Folder f2 = new Folder("Exams","/docs/exams");
        TextFile file1 = new TextFile(101, "OOP_Notes.txt", f1, 120);
        SecureTextFile secure1 = new SecureTextFile(202, "Midterm_Paper.txt", f2, 250, "High");

        FileItem[] items = FileItem[5];
        items[0] = file1;
        items[1] = file2;

        System.out.println("---- File Details ----");
        

        FileItem ref = new FileItem(303, "Project_Solutions.txt" , 180, "Medium");

    }
}