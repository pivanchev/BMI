
package bmi;
import java.util.Scanner;


public class BMI {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter your weight in kilograms!");
        double weight=input.nextDouble();
        
        System.out.println("Enter your height in centemeters!");
        double height=input.nextDouble();
        
        
        double bmi=weight/(height*height);
        
        System.out.println("BMI is " + bmi);
        
        
        if(bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi<25.5){
            System.out.println("Normal");
        }else if(bmi<30){
            System.out.println("Overweight");   
        }else{
            System.out.println("Obese");
        }
    }
    
}
