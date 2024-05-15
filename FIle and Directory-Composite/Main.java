public class Main {
    public static void main(String[] args) {
        // Here files being created
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        File file3 = new File("file3.txt", 150);

        // folders being created
        Folder folder1 = new Folder("Folder 1");
        folder1.addComponent(file1);
        folder1.addComponent(file2); // adding a file into the folder

        Folder folder2 = new Folder("Folder 2");
        folder2.addComponent(file3);
        folder2.addComponent(folder1); // adding a folder inside another folder

        // Getting size of folder
        System.out.println("Size of folder2: " + folder2.getSize() + " bytes");
    }
}
