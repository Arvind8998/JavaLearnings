package imperative;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CreditCardInavlidToValid {

    public static int powerFunction(int num){
        int power = 1;
        int number = num/10;
        while(number !=0){
            number /= 10;
            power *= 10;
        }
        return power;
    }

    public static int numberValidator(int num){
         int digitsSum = 0;
        int powerValue = powerFunction(num);
        int firstDigit = num/powerValue;

        while(num !=0){
            num /= 10;
            int calcValue = (num %100)/10 *2;
            int replacedVal = calcValue >= 10 ? (calcValue/10 + calcValue/10)
                    : calcValue;

        }
        if(num%10 == 0) return num;
        else{


            int lastDigit = num %10;
            int closestValidNumber = firstDigit*10 + 10;

            int difference = (closestValidNumber - digitsSum);
            int newLastDigit = lastDigit+difference;
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input number");
        int num= scanner.nextInt();
        System.out.println(numberValidator(num));
    }
}
