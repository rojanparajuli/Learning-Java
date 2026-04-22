import java.io.File;

class DeleteFile {
    public static void main(String[] args) {
        try {
            File file = new File("rojan.txt");
            if (file.delete()) {
                System.out.println("File deleted sucessfully");
            } else {
                System.out.println("Failed to delete.");

            }
        } catch (Exception e) {
            System.out.println("Unknown error");
            e.printStackTrace();
        }
    }
}
