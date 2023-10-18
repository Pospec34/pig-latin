package pig_latin_converter;

public class PigLatinConverter {

    public String convertToPigLatin(String text){
        String[] words = text.split(" ");
        String pigSentence = "asf";

        return pigSentence;
    }

    /**
     *
     * @param text
     * @return returns true if text starts with vowel
     */
    public boolean startsWithVowel(String text){
        boolean result = false;
        if (text.matches("^[aeiouAEIOU].*")){
            result = true;
        }
        return result;
    }


    public String swapConsonants(String text){
        String beginning = text.replaceAll(".*?([aeiouAEIOU].*)", "$1");
        String end = text.replaceAll("([^aeiouAEIOU]*).*", "$1");
        return beginning + end + "ay";
    }
}
