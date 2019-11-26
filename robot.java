import java.util.Scanner;
public class robot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inputStack1 = input.nextLine();
        String inputStack2 = input.nextLine();
        String inputStack3 = input.nextLine();
        String output = "";
        for(int i = inputStack1.length(); i > 0; i--){
            inputStack3 = inputStack3 + inputStack1.charAt(i - 1);
            inputStack1 = inputStack1.substring(0,inputStack1.length()-1);
            output = output + "1,3;";
        }
        for(int i = inputStack2.length(); i > 0; i--){
            inputStack3 = inputStack3 + inputStack2.charAt(i - 1);
            inputStack2 = inputStack2.substring(0,inputStack2.length()-1);
            output = output + "2,3;";
        }
        for(int i = inputStack3.length(); i > 0; i--){
            if(inputStack3.charAt(i - 1) == 'S'){
                inputStack1 = inputStack1 + inputStack3.charAt(i - 1);
                inputStack3 = inputStack3.substring(0,inputStack3.length()-1);
                output = output + "3,1;";
            }
            else{
                inputStack2 = inputStack2 + inputStack3.charAt(i - 1);
                inputStack3 = inputStack3.substring(0,inputStack3.length()-1);
                output = output + "3,2;";
            }
        }
        for(int i = inputStack2.length(); i > 0; i--){
            if(inputStack2.charAt(i - 1) == 'L'){
                inputStack3 = inputStack3 + inputStack2.charAt(i - 1);
                inputStack2 = inputStack2.substring(0,inputStack2.length()-1);
                output = output + "2,3;";
            }
            else {
                inputStack1 = inputStack1 + inputStack2.charAt(i - 1);
                inputStack2 = inputStack2.substring(0, inputStack2.length()-1);
                output = output + "2,1;";
            }
        }
        int check = 0;
        while(check != 1){
            int i = inputStack1.length();
            if(inputStack1.charAt(i - 1) == 'M'){
                inputStack2 = inputStack2 + inputStack1.charAt(i - 1);
                inputStack1 = inputStack1.substring(0, inputStack1.length()-1);
                output = output + "1,2;";
            }
            else{
                check++;
            }
            i--;
        }
        System.out.println(output);
    }
}