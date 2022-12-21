import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> timerMap = new MapTimer(new HashMap<Integer, String>());

        timerMap.put(1,"qwerty");
        timerMap.put(2,"zxc");

        //Данные хранятся 3 секунды
        for (int i = 0; i < 5; i++){
            System.out.println(timerMap.get(1));
            System.out.println(timerMap.get(2));
            System.out.println();
            ((MapTimer) timerMap).timeTick();
        }
    }
}