import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MovieManagerTest {

    @Test
    public void ShouldFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] actual = manager.findAll();
        String[] expected = {"First", "Second", "Third"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastByLimit() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");


        String[] actual = manager.findLast();
        String[] expected = {
                "f7",
                "f6",
                "f5",
                "f4",
                "f3",

        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");


        String[] actual = manager.findLast();
        String[] expected = {

                "f4",
                "f3",
                "f2",
                "f1",
        };

        assertArrayEquals(expected, actual);
    }
}