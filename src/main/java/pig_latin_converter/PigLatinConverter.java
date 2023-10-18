package pig_latin_converter;

public class PigLatinConverter {

    public String convertToPigLatin(String text){
        String[] words = text.split(" ");
        String pigSentence = "asf";

        return pigSentence;
    }

    public boolean startsWithVowel(String text){
        boolean result = false;
        if (text.matches("^[aeiouAEIOU].*")){
            result = true;
        }
        return result;
    }
}
