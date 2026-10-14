package File;
import java.io.*;

public class Newtxt {
    public static void main(String[] args) throws IOException {


        File file = new File("1st.txt");

        if( file.createNewFile() ){
            System.out.println("new file created");

        } else {
            System.out.println(" file already existed");
        }
        System.out.println("----------------------------------------------");


//HOW TO READ FROM FILE USING INPUT STREAM

        FileInputStream input = new FileInputStream("1st.txt");

         int data;

         while ( (data = input.read() ) != -1){
             System.out.print((char) data);
         }
        System.out.println(" ");

        System.out.println("----------------------------------------------");
//write
        FileOutputStream output =new FileOutputStream("1st.txt");

        String ta =" kire beda ki khobor??";

        output.write(ta.getBytes());

        output.close();

        System.out.println("written succesfully");

//readrer


        FileReader reader =new FileReader("1st.txt");

        int d ;

        while( (d =reader.read()) !=-1){
            System.out.print((char) d);

        }
reader.close();


 //writer


        FileWriter f =new FileWriter("1st.txt");

        f.write(" likhlam ..........");

        f.close();

    }
}
