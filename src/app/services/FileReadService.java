package app.services;

import app.utils.Constant;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public static String readFile(String fileName){
        try(FileInputStream fin=new FileInputStream(Constant.BASE_PATH_IN+fileName+".txt")){
            int i;
            StringBuilder stringBuilder=new StringBuilder();
            while ((i=fin.read())!=-1){
                stringBuilder.append((char) i);
            }
            return stringBuilder.toString();
        }catch (IOException e){
            return e.getMessage();
        }
    }
}
