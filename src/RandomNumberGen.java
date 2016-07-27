import java.util.Random;


public class RandomNumberGen {

    Random randomNum = new Random();

    public int randInt(int min, int max){
        return randomNum.nextInt((max-min)+1)+ min;
    }

    public String randString(int min, int max){
        return Integer.toString(randomNum.nextInt((max-min)+1)+ min);
    }

}
