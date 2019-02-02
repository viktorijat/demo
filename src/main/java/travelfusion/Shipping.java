package travelfusion;

public class Shipping {

    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {

        int large = 0;
        int small = 0;

        while (items >= 5) {
            if (large == availableLargePackages) {
                break;
            }
            large += 1;
            items -= 5;
        }

        while (items >= 1) {
            if (small == availableSmallPackages) {
                break;
            }
            small += 1;
            items -= 1;
        }

        if (items == 0) {
            return (large + small);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(34, 2, 10));
    }
}
