import java.io.FileWriter;
import java.io.IOException;
class write_file {

    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("rojan.txt");
            fw.write("Hi my name is Rojan parajuli and i am learning java");
            fw.close();
            System.out.println("Written sucessfully");

        }catch(IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
}
