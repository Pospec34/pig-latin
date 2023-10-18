package pig_latin_converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in, "UTF-8");
        PigLatinConverter converter = new PigLatinConverter();

        System.out.println("Zadejte anglický text k převedení do Pig Latin: ");
        String text = scanner.nextLine();

        System.out.println(converter.convertToPigLatin(text));

    }
}