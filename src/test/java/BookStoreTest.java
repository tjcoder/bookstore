import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BookStoreTest {

    private BookStore bookStore;

    @Before
    public void run() {
        bookStore = new BookStore();
    }

    @Test
    public void checkBooksCount() throws Exception {
        Double initialPrice = 50D;
        Double discount = 4D;
        Double floorPrice = 25D;
        Double budget = 300D;

        bookStore.setBudget(budget);
        bookStore.buyBooks(initialPrice, discount, floorPrice);
        int booksCount = bookStore.getBooksCount();

        Assert.assertEquals(8, booksCount);
    }

    @Test
    public void checkRemainingMoney() throws Exception {
        Double initialPrice = 50D;
        Double discount = 4D;
        Double floorPrice = 25D;
        Double budget = 300D;

        bookStore.setBudget(budget);
        bookStore.buyBooks(initialPrice, discount, floorPrice);
        double remainingBudget = bookStore.getBudget();

        Assert.assertEquals(9.0, remainingBudget, 0.0);
    }

}