class ManufacturingController {
    private static int productCount = 0;

    public static String requestProduct(String product) {
        // write your code here
        productCount++;
        return String.format("%d. Requested %s", productCount, product);
    }

    public static int getNumberOfProducts() {
        // write your code here
        return productCount;
    }
}