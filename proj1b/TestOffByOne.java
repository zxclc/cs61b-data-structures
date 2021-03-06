import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

/** Implementation of Project 1b of cs61b
 * @author Cong Chen
 */
public class TestOffByOne {
    /*
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.**/
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    //  Uncomment this class once you've created your CharacterComparator interface and OffByOne class.

    @Test
    public void testequalChars(){
        assertTrue(offByOne.equalChars('a', 'b'));
        assertTrue(offByOne.equalChars('r', 'q'));

        assertFalse(offByOne.equalChars('a', 'e'));
        assertFalse(offByOne.equalChars('z', 'a'));
        assertFalse(offByOne.equalChars('a', 'a'));
    }
}
