package secondkt_spring.secondkt_spring;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class TestSecondKT {
   //readFile
    @Test
    public void testIfReadFileExcisting(){
        String testFileName = "/Users/gertinpakkonen/Desktop/KooliAsjad/pohikursus_2k/secondkt/testFile.txt";
        SecondKT KTfile = new SecondKT();
        String result = KTfile.readFile(testFileName);
        assertTrue(result != null);
    }

    @Test
    public void testIfReadFileIsWorking(){
        String testFileName = "/Users/gertinpakkonen/Desktop/KooliAsjad/pohikursus_2k/secondkt/testFile.txt";
        String expected = "my test";
        SecondKT KTfile = new SecondKT();
        String result = KTfile.readFile(testFileName);
        assertEquals(expected, result);
    }
    
    //splitWords
    @Test
    public void testIfSplitWordsHasArrayToSplit(){
        String text = "test on see";
        SecondKT KTfile = new SecondKT();
        String[] result = KTfile.splitWords(text);
        assertTrue(result != null);
    }

    @Test
    public void testIfSplitWordsCountsRight(){
        String text = "test on see";
        String[] textArray = text.split("\\s");
        SecondKT KTfile = new SecondKT();
        String[] result = KTfile.splitWords(text);
        assertArrayEquals(textArray, result);
    }

    //lowerCase
    @Test
    public void testIfLowerCaseWorks(){
        String[] text = {"Uued", "sÕnad"};
        SecondKT KTfile = new SecondKT();
        LinkedList<String> result = KTfile.lowerCaseLetters(text);
        assertTrue(result != null);
    }    

    @Test
    public void testIfLowerCaseWorksCorrectly(){
        String[] text = {"Uued", "sÕnad"};
        SecondKT KTfile = new SecondKT();
        LinkedList<String> result = KTfile.lowerCaseLetters(text);
        assertEquals(result.getFirst(), "uued");
    }   

    //returnDoubleI
    @Test
    public void testIfReturnDoubleIGetsInfo(){
        LinkedList<String> linkList = new LinkedList<String>();
        linkList.add("tereii");
        linkList.add("mis");
        SecondKT KTfile = new SecondKT();
        LinkedList<String> result = KTfile.returnDoubleI(linkList);
        assertTrue(result != null);
    }

    @Test
    public void testIfReturnDoubleIGetsIsCorrect(){
        LinkedList<String> linkList = new LinkedList<String>();
        linkList.add("tereiii");
        linkList.add("mis");
        SecondKT KTfile = new SecondKT();
        LinkedList<String> result = KTfile.returnDoubleI(linkList);
        assertEquals(linkList.getFirst(), result.getFirst());
    }

}