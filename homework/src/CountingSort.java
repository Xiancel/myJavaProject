public class CountingSort {
    public static void main(String[] args) {
        Product[] prod = new Product[]{
                new Product("Product A", 12.99f, 5),
                new Product("Product B", 9.99f, 10),
                new Product("Product C", 12.99f, 8),
                new Product("Product D", 7.99f, 15),
                new Product("Product E", 9.99f, 5)
        };
        countSort(prod);
        outputResult(prod);
    }
    private static void countSort(Product[]price){
        int size = price.length;
        Product[] output = new Product[size];

        float max = price[0].getPrice();
        for (int i = 1; i < size; i++) {
            if(price[i].getPrice()>max){
                max = price[i].getPrice();
            }
        }

        int[] count = new int[(int) (max+1)];
        for (int i = 0; i < size; i++) {
            count[(int) price[i].getPrice()]++;
        }

        for (int i = 1; i <= max ; i++) {
            count[i] += count[i-1];
        }

        for (int i = size-1; i >= 0 ; i--) {
            output[count[(int) price[i].getPrice()]- 1 ] = price[i];
            count[(int) price[i].getPrice()]--;
        }
        for (int i = 0; i < size; i++) {
            price[i] = output[i];
        }
    }

    static void outputResult(Product[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i].getName()+" "+arr[i].getPrice()+" "+arr[i].getQuantity());
        }
    }
}
class Product{
    String name;
    float price;
    int quantity;

    public Product(String name,float price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
