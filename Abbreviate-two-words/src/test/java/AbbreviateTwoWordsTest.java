import org.example.AbbreviateTwoWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbbreviateTwoWordsTest {

    @Test
    public void testAbbreviate(){
        assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("O.W", AbbreviateTwoWords.abbrevName("Obi Wan"));
        assertEquals( "L.C", AbbreviateTwoWords.abbrevName("Lara Croft"));
    }

}
