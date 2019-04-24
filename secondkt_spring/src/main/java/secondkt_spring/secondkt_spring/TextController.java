package secondkt_spring.secondkt_spring;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @GetMapping("/text")
    public String sendText(@RequestParam(value="text", defaultValue="Pole midagi",required=false) String txt){
        SecondKT KTfile = new SecondKT();
        String[] wordArray = KTfile.splitWords(txt);
        LinkedList<String> linkWordArray = KTfile.lowerCaseLetters(wordArray);
        LinkedList<String> linkWords = KTfile.returnDoubleI(linkWordArray);
        int nr = linkWords.size();
        String template = "Sinu tekst: %s ja kokku oli sõnu üle %d.";
        return String.format(template, txt, nr);
    } 

}