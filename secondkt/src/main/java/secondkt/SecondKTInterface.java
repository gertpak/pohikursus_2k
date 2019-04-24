package secondkt;

import java.util.LinkedList;

interface SecondKTInterface {
    public String readFile(String path);
    public String[] splitWords(String text);
    public LinkedList<String> lowerCaseLetters(String[] wordArray);
    public LinkedList<String> returnDoubleI(LinkedList<String> linkWordArray);    
}