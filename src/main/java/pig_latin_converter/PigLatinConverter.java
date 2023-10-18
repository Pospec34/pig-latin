package pig_latin_converter;

public class PigLatinConverter {

    public String convertToPigLatin(String text){
        String[] words = text.split(" ");
        String pigSentence = "";

        for (String word : words){
            if (startsWithVowel(word)){
                pigSentence += word + "ay";
            } else {
                pigSentence += swapConsonants(word);
            }
        }
        pigSentence = capitalizeFirstLetter(pigSentence);
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

    public String capitalizeFirstLetter(String text){
        text = text.substring(0, 1).toUpperCase() + text.substring(1);
        return text;
    }
}
