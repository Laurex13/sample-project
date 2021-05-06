package se.lexicon.laurita;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double number1 = 6, number2 = 5, result = 0;
        char Operator = '/';

        switch (Operator) {
            case '+':
                result = number1 + number2;
                System.out.println(result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;

            case '*':
                result = number1 * number2;
                break;

            case '/':
                result = number1 / number2;
                break;

            default:

                System.out.println(Operator + "is not supported");

        }
        System.out.println(result);

    }
}

