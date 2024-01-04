package pig_latin_converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in, "UTF-8");
        PigLatinConverter converter = new PigLatinConverter();

        while (true){
            System.out.println("Zadejte anglický text k převedení do Pig Latin. Číslo '0' program ukončí: ");
            String text = scanner.nextLine();
            if (text.equals("0")){
                System.out.println("Na shledanou!");
                break;
            }
            System.out.println(converter.convertToPigLatin(text));
        }
    }
}