package tempconverter;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mode = null;
        int answer = 0;
        int tempToConvert;
        int tempConverted;

        System.out.println("-----------------------------------Welcome------------------------------------------");
        System.out.println("----------------Celsius-Fahrenheit/Fahrenheit-Celsius converter---------------------");

        do{
            System.out.println("choose the conversion mode:");
            System.out.println("1- Celsius-Fahrenheit");
            System.out.println("2- Fahrenheit-Celsius");
            mode = sc.nextLine();
            while (!(mode.equals("1"))  && !(mode.equals("2"))){
                System.out.println("invalid mode, please enter 1 or 2");
                System.out.println("1- Celsius-Fahrenheit");
                System.out.println("2- Fahrenheit-Celsius");
                mode = sc.nextLine();
//                if (mode == "1" || mode == "2"){
//                    break;
//                }
            }
            if (mode.equals("1")){
                System.out.println("Enter the temperature to convert:");
                tempToConvert = sc.nextInt();
                tempConverted = (tempToConvert * 9/5) + 32;
                System.out.println(tempToConvert+" C ------------------> "+tempConverted+" F");
            }else{
                System.out.println("Enter the temperature to convert:");
                tempToConvert = sc.nextInt();
                tempConverted = (tempToConvert - 32) * 5/9;
                System.out.println(tempToConvert+" F ------------------> "+tempConverted+" C");
            }

            System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");
            answer = sc.nextInt();
            while (answer != 1 && answer !=2){
                System.out.println("invalid mode, please enter 1 (Yes) or 2 (No)");
                answer = sc.nextInt();
//                if (answer == 1 || answer == 2){
//                    break;
//                }
            }
        }while (answer == 1);

        System.out.println("-------------------------------Good bye, see you soon---------------------------");

    }
}
