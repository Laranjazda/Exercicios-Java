package arrays;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
    public static void main(String[] args) throws IOException {
//        var sourceFile = "src/main/java/arrays/sid.jpg";
//        var destinyFile = "src/main/java/arrays/sid2.jpg";
        var sourceFile = "src/main/java/arrays/texto.txt";
        var destinyFile = "src/main/java/arrays/texto2.txt";

        try(var fis = new FileInputStream (sourceFile);
            var fos = new FileOutputStream (destinyFile)){
            byte[] buffer = new byte[1024];
            int numOfBytes = 0;
            //Lê os bytes do sourceFile a copa par ao destinyFile
            while ((numOfBytes = fis.read(buffer)) != -1){
                fos.write(buffer, 0, numOfBytes);
            }
        }
    }
}
