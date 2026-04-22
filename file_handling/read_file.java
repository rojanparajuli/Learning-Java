import java.io.File;
import java.util.Scanner;

class ReadFIle {
    public static void main(String[] args) {
        try {
            File file = new File("rojan.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
