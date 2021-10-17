import com.company.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test

    public void descriereBook() {
        Book book = new Book(1, 2, "Bazele informaticii", "1998.01.12", "matematica", true, false);

        String desc = "\nId: 1\nPersonId: 2\nBook name: Bazele informaticii\nCreated At:1998.01.12\nCategorie: matematica\nStatus:true\nCumparata: false";
        assertEquals(desc, book.descriere());
    }

    @Test

    public void toStringBook() {
        Book book = new Book(1, 2, "Bazele informaticii", "1998.01.12", "matematica", true, false);

    }

    @Test

    public void toEqualsBook() {
        Book b1 = new Book(1, 2, "Bazele matematicii", "1998.01.12", "matematica", true, false);


        Book b2 = new Book(1, 2, "", "", "", false, true);

        assertEquals(true,b1.equals(b2));

    }
}