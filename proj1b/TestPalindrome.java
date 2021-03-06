import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    // Test isPalindrome
    // Boolean b = palindrome.isPalindrome("noon");

    @Test
    public void testisPalindrome() {
        assertTrue(palindrome.isPalindrome("c"));
    }

    @Test
    public void testisPalindromeCC(){
        OffByOne aa = new OffByOne();
        assertTrue(palindrome.isPalindrome("flake",aa));
    }

}