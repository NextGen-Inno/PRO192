
public class MyString implements IString {

    @Override
    public int f1(String string) {
        String[] words = string.split("\\s+");
        int count = 0;
        for (String word : words) {
            boolean hasTwoOddDigits = false;
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    int digit = Character.getNumericValue(c);
                    if (digit % 2 == 1) {
                        if (hasTwoOddDigits) {
                            count++;
                            break;
                        } else {
                            hasTwoOddDigits = true;
                        }
                    }
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        return null;
    }

}
