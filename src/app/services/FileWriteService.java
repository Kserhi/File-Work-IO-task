package app.services;

import java.io.FileOutputStream;
import java.io.IOException;
import app.utils.Constant;
public class FileWriteService {
    public static String writeFile(String fileName, String fileText){
        try( FileOutputStream fout=
                     new FileOutputStream(Constant.BASE_PATH_IN+fileName+".txt")) {
            byte [] bytes=fileText.getBytes();
            fout.write(bytes);
            return "Writing file successful";
        }catch (IOException e){
           return "Exceptino " + e.getMessage();
        }
    }
}
