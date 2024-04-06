import java.util.Random;

public class RondNumber {

    Random random;
    int number;

    RondNumber() {
        random = new Random();
        play();
    }

    void play() {
        number = random.nextInt(10);
        System.out.println(number);
    }
    
    
}
