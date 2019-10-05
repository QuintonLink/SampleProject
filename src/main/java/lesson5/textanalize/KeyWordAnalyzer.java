package lesson5.textanalize;

public class KeyWordAnalyzer {

    protected String[] keyWords;

    public boolean analyse(String text){

        for (int i = 0; i < keyWords.length ; i++) {

            if(text.contains(keyWords[i]) == true){
                return false;
            }
        }
        return true;
    }
}
