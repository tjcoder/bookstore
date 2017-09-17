import java.util.Scanner;

public class BookStore {

    private int booksCount = 0;
    private Double budget;

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        bookStore.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        Double initialPrice = scanner.nextDouble();
        Double discount = scanner.nextDouble();
        Double floorPrice = scanner.nextDouble();
        budget = scanner.nextDouble();

        buyBooks(initialPrice, discount, floorPrice);

        System.out.println();
        System.out.println(booksCount + " books, $" + budget + " remaining");
    }

    public void buyBooks(Double initialPrice, Double discount, Double floorPrice) {
        while (budget >= initialPrice) {
            budget -= initialPrice;
            booksCount ++;
            initialPrice -= discount;
            if (initialPrice < floorPrice) {
                initialPrice = floorPrice;
            }
        }
    }

    public int getBooksCount() {
        return booksCount;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
