# cs121-project-8

```
import java util

public class Guesser {
    public static void main(string[] args) {
        bool keepGoing = true
        create input scanner
        while keepGoing is true {
            print the options and prompt input:
                0) quit
                1) human guesser
                2) computer guesser
            try {
                selection = recieve input and parse for Int
                if selection = 0:
                    set keepGoing to false
                if selection = 1:
                    run humanGuesser()
                if selection = 2:
                    run computerGuesser()
                else:
                    prompt user for valid input
            } catch exceptions if user input is not an int
        }
    }
    

    public static void humanGuesser() {
        double randNum = Math.random()
        double d = randNum * 100
        int correct = convert d to int + 1
        start turn counter at 1

        boolean guessCorrect = false
        create input scanner
        while guessCorrect = false {
            prompt use for number guess from 1-100
            try {
                get user input and parse for int
                if guess is correct:
                    congratulate user
                    set guessCorrect to true
                else if guess is higher than correct:
                    tell user lower
                    increment turn counter
                else if guess is lower than correct:
                    tell user higher
                    increment turn counter
            } catch exceptions if user input is not an int
        }
    }


    public static void computerGuesser() {
        start turn counter at 1
        int guess = 50
        int interval = 25
        boolean keepGoing = true
        string answer
        create input scanner

        while keepGoing is true {
            print computer's guess
            prompt user to say if the guess is too high (H), too low (L), or correct (C)
            take input to answer var

            if answer is "H":
                decrease guess by interval
                increment turn counter
                divide increment by 2 with floorDiv (round down)
            else if answer is "L":
                increase guess by interval
                increment turn counter
                divide increment by 2 with floorDiv (round down)
            else if answer is "C":
                computer celebrates
                set keepGoing to false
            else:
                prompt user for valid response

            if interval is less than 1:
                set interval to 1
        }
    }
}
```
