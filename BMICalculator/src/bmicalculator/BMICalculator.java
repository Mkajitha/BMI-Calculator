package bmicalculator;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        float weight,height;
        float bmi;
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter your weight in Kilogram:");
        weight=scanner.nextFloat();
        System.out.println("Enter your height in Centimeter:");
        float cm=scanner.nextFloat();
        height=cm/100;
        bmi=weight/(height*height);
        
        System.out.println("Your BMI is:"+bmi);
        if(bmi<18.5){
            System.out.println("Under-Weight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25.0 && bmi<=29.9){
            System.out.println("Over Weight");
        }
        else if(bmi>=30.0 && bmi<=34.9){
            System.out.println("Obese");
        }
        else if(bmi>=35){
            System.out.println("Extremely Obese");
        }
    }
    
}
