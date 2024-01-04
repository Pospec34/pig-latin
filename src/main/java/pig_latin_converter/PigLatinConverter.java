package pig_latin_converter;

public class PigLatinConverter {

    public String convertToPigLatin(String text){
        if (isEmpty(text)){
            return "";
        }

        text = text.toLowerCase();
        String[] words = text.split(" ");
        String pigSentence = "";

        for (String word : words){
            String punctuation = getPunctuation(word);
            word = word.replaceAll("[^a-zA-Z-9]+", "");
            if (startsWithVowel(word)){
                pigSentence += word + "ay" + punctuation + " ";
            } else if (isANumber(word)) {
                pigSentence += word + punctuation + " ";
            } else {
                pigSentence += swapConsonants(word) + punctuation + " ";
            }
        }
        pigSentence = capitalizeFirstLetter(pigSentence);
        return pigSentence.trim();
    }

    /**
     *
     * @param text
     * @return returns true if text starts with vowel
     */
    public boolean startsWithVowel(String text){
        return text.matches("^[aeiouAEIOU].*");
    }

    private boolean isEmpty(String text){
        return text.equals("");
    }

    private boolean isANumber(String text){
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }


    public String swapConsonants(String text){
        String beginning = text.replaceAll(".*?([aeiouAEIOU].*)", "$1");
        String end = text.replaceAll("([^aeiouAEIOU]*).*", "$1");
        return beginning + end + "ay";
    }


    public String capitalizeFirstLetter(String text){
        boolean newSentence = true;
        String result = "";
        String words[] = text.split(" ");

        for (String word : words){
            if (newSentence){
                result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            } else {
                result += word + " ";
            }
            newSentence = isNewSentence(word);
        }
        return result.trim();
    }

    private boolean isNewSentence(String word){
        return word.matches(".*[.!?]+$");
    }

    public String getPunctuation(String text){
        if (text.matches(".*[.,!?]+$")){
            return text.replaceAll(".*([.,!?]+$)", "$1");
        } else {
            return "";
        }
    }
}
