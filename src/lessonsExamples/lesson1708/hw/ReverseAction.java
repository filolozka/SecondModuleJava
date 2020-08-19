package lessonsExamples.lesson1708.hw;

public class ReverseAction implements Action {
    @Override
    public String doAction(String string, int length) {
        if (string != null) {
            StringBuffer temp = new StringBuffer(string);
            return (temp.reverse()).toString();
        } else {
            return null;
        }
    }
}
