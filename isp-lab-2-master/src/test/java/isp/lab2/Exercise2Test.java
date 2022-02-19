package isp.lab2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class of Exercise2.
 *
 * @author Radu Miron
 */
public class Exercise2Test {

    @Test
    public void testValidateEnumeration() {
        //TEST 1: valid input
        String input1 = "apple,cat,computer,tea";
        String enumeration1 = Exercise2.validateEnumeration(input1);
        Assert.assertNotNull(input1 + " is a valid input", enumeration1);


        // TEST 2: invalid input
        String input2 = "apple, cat, computer, tea";
        String enumeration2 = Exercise2.validateEnumeration(input2);
        Assert.assertNull(input2 + " is an invalid input", enumeration2);


        // TEST 3: invalid input
        String input3 = "apple,cat,123,tea";
        String enumeration3 = Exercise2.validateEnumeration(input3);
        Assert.assertNull(input3 + " is an invalid input", enumeration3);
    }

    @Test
    public void testValidateStartingLetter() {
        // TEST 1: valid input
        Character letter1 = Exercise2.validateStartingLetter('a');
        Assert.assertNotNull("'a' is a valid input", letter1);
        Assert.assertEquals(letter1, Character.valueOf('a'));

        // TEST 2: invalid input
        Character letter2 = Exercise2.validateStartingLetter('1');
        Assert.assertNull("'1' is an invalid input", letter2);
    }

    @Test
    public void testSplitEnumerationIntoWords() {
        // TEST 1
        String enumeration1 = "car,test,pear";
        String[] words1 = Exercise2.splitEnumerationIntoWords(enumeration1);
        Assert.assertEquals(enumeration1 + " has 3 words", 3, words1.length);

        // TEST 2
        String enumeration2 = "car";
        String[] words2 = Exercise2.splitEnumerationIntoWords(enumeration2);
        Assert.assertEquals(enumeration2 + " has 1 word", 1, words2.length);
    }

    @Test
    public void testFindWordsStartingWith() {
        String[] words = {"phone", "computer", "apple", "car", "apricot", "compound"};

        // TEST 1:
        String[] results1 = Exercise2.findWordsStartingWith(words, 'a');
        Assert.assertEquals(2, results1.length);

        // TEST 2:
        String[] results2 = Exercise2.findWordsStartingWith(words, 'c');
        Assert.assertEquals(3, results2.length);

        // TEST 3:
        String[] results3 = Exercise2.findWordsStartingWith(words, 'z');
        Assert.assertEquals(0, results3.length);
    }
}
