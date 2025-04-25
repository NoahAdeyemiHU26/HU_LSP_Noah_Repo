import java.beans.Transient;
import java.util.HashMap;
import java.util.Map;
class Main{
    /**
    * Represents a simple shopping cart that allows adding items,
    * applying discount codes, and calculating the total cost.
    */
    public class ShoppingCart {
        private Map<String, Double> items = new HashMap<>();
        private double discountPercentage = 0.0;

        /**
        * Adds an item to the shopping cart.
        * 
        * @param itemName  the name of the item
        * @param price     the price of the item (must be non-negative)
        * @throws IllegalArgumentException if price is negative
        */
        public void addItem(String itemName, double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            items.put(itemName, price);
        }

        /**
        * Calculates and returns the total cost of the cart,
        * applying any discounts currently in effect.
        * 
        * @return total cost after applying discount
        */
        public double getTotalCost() {
            double total = 0.0;
            for (double price : items.values()) {
                total += price;
            }
            double discountAmount = total * (discountPercentage / 100.0);
            return total - discountAmount;
        }

    /**
     * Applies a valid discount code to the shopping cart.
     * Supported codes:
     * - "SAVE10": 10% discount
     * - "SAVE20": 20% discount
     * 
     * @param code  the discount code
     * @throws IllegalArgumentException if the code is invalid
     */
        public void applyDiscountCode(String code) {
            switch (code) {
                case "SAVE10":
                    discountPercentage = 10.0;
                    break;
                case "SAVE20":
                    discountPercentage = 20.0;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid discount code.");
            }
        }

    /**
     * Returns the current discount percentage applied to the cart.
     * Useful for testing.
     * 
     * @return the discount percentage (0.0 if no discount applied)
     */
        public double getDiscountPercentage() {
            return discountPercentage;
        }
        public class ShoppingCartTest{
            @Test 
            public void testAddItems(){
                ShoppingCart cart = new ShoppingCart();

            // Test adding valid items
                cart.addItem("Apple", 1.5);
                cart.addItem("Banana", 0.75);
                assertEquals(2.25, cart.getTotalCost(), 0.001);

                //Test for adding free items ($0)
                Exception exceptionZeroPrice = assertThrows(IllegalArgumentException.class, () -> {
                cart.addItem("Orange", 0.0); 
                });
                assertEquals("Price cannot be negative.", exceptionZeroPrice.getMessage());
                // Test adding an item with a negative price
                Exception exceptionNegativePrice = assertThrows(IllegalArgumentException.class, () -> {
                cart.addItem("Grapes", -1.0);
            });
            assertEquals("Price cannot be negative.", exceptionNegativePrice.getMessage());
        }

    @Test
        public void testRemoveItem() {
            ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
            cart.addItem("Apple", 1.5);
            cart.addItem("Banana", 0.75);

        // Test removing an existing item
            cart.items.remove("Apple");
            assertEquals(0.75, cart.getTotalCost(), 0.001);

        // Test removing a non-existent item
            cart.items.remove("Orange"); // Should not throw an error
            assertEquals(0.75, cart.getTotalCost(), 0.001);
        }

    @Test
        public void testTotalCost() {
            ShoppingCart cart = new ShoppingCart();

        // Test total cost with no items
            assertEquals(0.0, cart.getTotalCost(), 0.001);

        // Test total cost with items and no discount
            cart.addItem("Apple", 1.5);
            cart.addItem("Banana", 0.75);
            assertEquals(2.25, cart.getTotalCost(), 0.001);

        // Test total cost with a discount
            cart.applyDiscountCode("SAVE10");
            assertEquals(2.025, cart.getTotalCost(), 0.001); // 10% discount applied
        }

        @Test
        public void testApplyDiscountCode() {
            ShoppingCart cart = new ShoppingCart();

        // Test applying valid discount codes
            cart.applyDiscountCode("SAVE10");
            assertEquals(10.0, cart.getDiscountPercentage(), 0.001);

            cart.applyDiscountCode("SAVE20");
            assertEquals(20.0, cart.getDiscountPercentage(), 0.001);

        // Test applying invalid discount codes
            Exception exceptionInvalidCode = assertThrows(IllegalArgumentException.class, () -> {
                cart.applyDiscountCode("SAVE50");
            });
            assertEquals("Invalid discount code.", exceptionInvalidCode.getMessage());

            Exception exceptionEmptyCode = assertThrows(IllegalArgumentException.class, () -> {
                cart.applyDiscountCode("");
            });
            assertEquals("Invalid discount code.", exceptionEmptyCode.getMessage());
        }

        @Test
        public void testCartSizeUpdates() {
            ShoppingCart cart = new ShoppingCart();

        // Test cart size after adding items
            cart.addItem("Apple", 1.5);
            cart.addItem("Banana", 0.75);
            assertEquals(2, cart.items.size());

        // Test cart size after removing an item
            cart.items.remove("Apple");
            assertEquals(1, cart.items.size());

        // Test cart size after removing a non-existent item
            cart.items.remove("Orange"); // Should not affect the size
            assertEquals(1, cart.items.size());
        }



        }
    }

};
