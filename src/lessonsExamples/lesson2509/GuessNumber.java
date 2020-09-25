package lessonsExamples.lesson2509;

public class GuessNumber {
    static int secretNumber = 2;
    static int attempts = 3;

    private NumberInput numberInput;

    public GuessNumber(NumberInput numberInput){ //передали ответственность за ввод передали за пределы программы
        //inversion of control
        this.numberInput = numberInput;
    }

    public void game() {

        System.out.println("Try to guess a secret number");
        int number = numberInput.getNextNumber();
        System.out.println("you entered " + number);
        boolean correctGuess = false;

        while (attempts > 1 && !correctGuess) {
            if (secretNumber == number) {
                correctGuess = true;
            } else {
                System.out.println("Wrong number, try again!"); //всего лишь один из потоков - могут быть варианты (мультиязычие, можно выводить в другой канал и тп)
                number = numberInput.getNextNumber();
            }
            attempts--;
        }

        if (correctGuess) {
            System.out.println("You won!");
        } else {
            System.out.println("You failed!");
        }
    }

    public static void main(String[] args) {
        /*NumberInput input = new KeyboardInput();
        GuessNumber number = new GuessNumber(input);
        number.game(); */
        NumberInput mockedInput = new InputMock();
        GuessNumber testGame = new GuessNumber(mockedInput);
        testGame.game();
    }
}
