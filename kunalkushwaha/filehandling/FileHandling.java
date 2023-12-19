package kunalkushwaha.filehandling;

import java.io.*;


public class FileHandling {
    public static void main(String[] args) {
//        try(BufferedReader br = new BufferedReader( new InputStreamReader(System.in))) {
//            System.out.println(br.readLine());
//            } catch (FileNotFoundException ex) {
//            throw new RuntimeException(ex);
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }

//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("kunalkushwaha/filehandling/hi.txt"))){
//            bw.write("Allah is the only God");
//
//        }catch(IOException e){
//            System.out.print(e.getMessage());
//        }

        try{
            File file = new File("kunalkushwaha/filehandling/hii.txt");
            file.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //write in the file
//        try{
//            BufferedReader fr = new BufferedReader(new FileReader("kunalkushwaha/filehandling/hii.txt"));
//            while(fr.ready())
//                System.out.println(fr.readLine());
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }

        try{
            File fo = new File("kunalkushwaha/filehandling/random.txt");
            fo.createNewFile();
//            if(fo.delete()){
                System.out.println(fo.getAbsoluteFile());
//            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
