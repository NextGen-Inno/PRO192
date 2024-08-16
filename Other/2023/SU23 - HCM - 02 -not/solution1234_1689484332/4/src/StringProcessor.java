
public class StringProcessor {

    public static boolean match_student_id(String s) {
        return s.matches("(?i)^(se|he|qe)\\d{4,6}$");
    }

    public static String format_camel(String s) {
        String[] wordsArray = s.toLowerCase().split("_");
        StringBuilder result = new StringBuilder(wordsArray[0]);

        for (int i = 1; i < wordsArray.length; i++) {
            String word = wordsArray[i];
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
        }

        return result.toString();
    }
}
