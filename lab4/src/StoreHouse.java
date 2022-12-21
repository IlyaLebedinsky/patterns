import java.util.HashMap;

public class StoreHouse {
    HashMap<String, Integer> catalog;

    public StoreHouse() {
        catalog = new HashMap<>();
        catalog.put("Молоко", 5);
        catalog.put("Хлеб", 10);
        catalog.put("Яйца", 20);
    }

    void writeOffProduct(String str) throws InterruptedException {
        catalog.put(str, catalog.get(str) - 1);
        Thread.sleep(1000);
    };

    void transferToDelivery() throws InterruptedException {
        System.out.println("Склад передает товар в доставку");
        Thread.sleep(1000);
    };
}