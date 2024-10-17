import org.wholikes.WhoLikesIt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WhoLikesItTest {
    @Test
    public void nameTests(){

        assertEquals("no one likes this", WhoLikesIt.listlikes());
        assertEquals("Peter likes this", WhoLikesIt.listlikes("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.listlikes("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.listlikes("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.listlikes("Alex", "Jacob", "Mark", "Max"));

    }

}
