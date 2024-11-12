import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        
    String task1 = identifier.replaceAll("\\s", "_");

    Matcher matcher = Pattern.compile("-(\\w)").matcher(task1);
    StringBuffer sBuffer = new StringBuffer();
    while (matcher.find()){
        matcher.appendReplacement(sBuffer, matcher.group(1).toUpperCase());
    }
    matcher.appendTail(sBuffer);
        
    String task2 = sBuffer.toString();

    String task3 = task2.replace("3","e")
                        .replace("0", "o")
                        .replace("4", "a")
                        .replace("7", "t")
                        .replace("1", "l")
                        .replace("3", "e");
        
    String task4 = task3.replaceAll("[^a-zA-Z_]", "");
        
    return task4; 
    }
}