package secondkt_spring.secondkt_spring;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

public class SecondKT implements SecondKTInterface  {

    public String readFile(String path){
        String text = "";
        Path file_path = Paths.get(path);
        try {
            byte[] file_content_in_bytes = Files.readAllBytes(file_path);
            String file_content_str = new String(file_content_in_bytes, StandardCharsets.UTF_8);
            text = file_content_str;
        } catch (IOException my_error) {
            my_error.printStackTrace();
        }
        return text;
    }
    public String[] splitWords(String text){
        String[] wordArray = text.split("\\s");
        return wordArray;
    }

    public LinkedList<String> lowerCaseLetters(String[] wordArray) {
        LinkedList<String> linkList = new LinkedList<String>();
        for (String word : wordArray) {
            linkList.add(word.toLowerCase());
        }
        return linkList;
    }
    

    public LinkedList<String> returnDoubleI(LinkedList<String> linkWordArray) {
		LinkedList<String> linkList = new LinkedList<String>();
        for (String word : linkWordArray) {
			int counter = 0;
			for (int i = 0; i < word.length(); i++) {
				if(word.charAt(i) == 'i'){
					counter++;
				}
			}
            if (counter > 2) {
                linkList.add(word);
            }
        }
        return linkList;
    }
}