
package material.calculator;
import java.util.Scanner;
public class WeaponAscentionMaterialCalculator {

    public static void main(String[] args) {
        int start,target,gold,purple,blue,green,jumlah,max,min;
        boolean re;
        max = 0;
        min = 0;
        re = true;
        
        Scanner input0 = new Scanner(System.in);  
        System.out.println("starting star");
        start = input0.nextInt();
        Scanner input = new Scanner(System.in);  
        System.out.println("target star");
        target = input.nextInt();
        switch (target) {
            case 6 -> max=335;
            case 5 -> max=173;
            case 4 -> max=81;
            case 3 -> max=47;
            case 2 -> max=20;
            case 1 -> max=5;        
            case 0 -> max=0;     
        }
        switch (start) {
            case 6 -> min=335;
            case 5 -> min=173;
            case 4 -> min=81;
            case 3 -> min=47;
            case 2 -> min=20;
            case 1 -> min=5;        
            case 0 -> min=0;     
        }
        while (re){        
            Scanner input2 = new Scanner(System.in);  
            System.out.println("gold amount");
            gold = input2.nextInt();
            Scanner input3 = new Scanner(System.in);  
            System.out.println("purple amount");
            purple = input3.nextInt();
            Scanner input4 = new Scanner(System.in);  
            System.out.println("blue amount");
            blue = input4.nextInt();
            Scanner input5 = new Scanner(System.in);  
            System.out.println("green amount");
            green = input5.nextInt();
        
            gold=gold*3*3*3;
            purple=purple*3*3;
            blue=blue*3;
            jumlah=green+blue+purple+gold;
            jumlah= max-min-jumlah;
            System.out.println(jumlah);
            max = jumlah;
            min = 0;
            Scanner input6 = new Scanner(System.in);  
            System.out.println("more? true/false");
            re = input6.nextBoolean();
        }
    }
    
}
