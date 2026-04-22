import java.io.File;
import java.io.IOException;

class CreateFile {

    public static void main(String[] args) {
        try {
            File file = new File("rojan.txt");
            if (file.createNewFile()) {
                System.out.println("New file created" + file.getName());
            } else {
                System.out.println("File already exist");
            }

        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }

}