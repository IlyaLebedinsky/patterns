public class Main {
    public static void main(String[] args) throws InterruptedException {

        VideoLoader RuTube = new ProxyRuTubeVideoLoader();
        // Загрузка файла которого еще нет в кэше
        RuTube.load("rutube1");
        System.out.println("========================");
         // Загрузка файла который есть в кэше
        RuTube.load("rutube1");
    }
}