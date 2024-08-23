import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static String capitalizeFirstLetter(String string){
        String[] words = string.split(" ");
        StringBuilder capitalizedString = new StringBuilder();
        for (String word : words){
            String firstLetter = word.substring(0, 1).toUpperCase();
            String restOfWord = word.substring(1).toLowerCase();
            capitalizedString.append(firstLetter).append(restOfWord).append(" ");
        }
        return capitalizedString.toString().trim();
    }
        public static boolean validarInput(String input, String regex) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            return !matcher.matches();
    }
}
