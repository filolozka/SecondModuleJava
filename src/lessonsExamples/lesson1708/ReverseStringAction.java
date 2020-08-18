package lessonsExamples.lesson1708;

public class ReverseStringAction implements Action {

    @Override
    public String doAction(String stringToReverse) {
        if (stringToReverse == null) {
            return null;
        } else {
            char[] chars = stringToReverse.toCharArray();
            String reversedString = "";
            for (int i = chars.length - 1; i >= 0; i--) {
                reversedString += chars[i];
            }
            return reversedString;

            /*
            еще один вариант:
            char[] res = new char[stringToReverse.length];
            for (int i = 0, j = res.length -1; i < stringToReverse.length(); i++, j--){
            res[i] = chars[j];
            }
            return new String (res);
             */
        }
    }
}
