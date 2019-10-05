package lesson5.textanalize;

public class LenghtAnalyzer implements Analyse {

    private int maxLenght;

    public LenghtAnalyzer(int maxLenght) {
        this.maxLenght = maxLenght;
    }

    public boolean analyse(String text){

        if(text.length() <= maxLenght){
            return true;
        }
        return false;

    }




}
