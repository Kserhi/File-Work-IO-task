package app;

import app.services.FileReadService;
import app.services.FileWriteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        choiceMenu();
    }
    public static void choiceMenu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select the file write or read option(W/R)");
        switch (scanner.nextLine()){
            case "W":
                System.out.println("Write the name of the file");
                String fileName=scanner.nextLine();
                System.out.println("Write the contents of the file");
                String fileContent=scanner.nextLine();
                getOutput(FileWriteService.writeFile(fileName, fileContent));
                break;
            case "R":
                System.out.println("Specify a file name");
                getOutput(FileReadService.readFile(scanner.nextLine()));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    public static void getOutput(String outputText){
        System.out.println(outputText);
    }
}
