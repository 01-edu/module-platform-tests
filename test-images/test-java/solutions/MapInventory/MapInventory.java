import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        // Check if the inventory map contains the product ID.
        if (inventory.containsKey(productId)) {
            // Return the corresponding price.
            return inventory.get(productId);
        } else {
            // Return -1 if the product ID does not exist.
            return -1;
        }
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        // Create a list to store the product IDs.
        List<String> productIds = new ArrayList<>();

        // Iterate through the entries of the inventory map.
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            // If the price of the current product matches the given price, add its ID to the list.
            if (entry.getValue().equals(price)) {
                productIds.add(entry.getKey());
            }
        }

        // Return the list of product IDs.
        return productIds;
    }
}
