//this question is used to display
//  *
//  **
//  ***
//  ****
//  *****
import java.util.*;
public class Pattern1{
    public static void main(String[] args) {
       pattern1(5);
    }
    static void pattern1(int n){
        for(int i = 1 ; i<=n ; i++){  //this display row
            for(int j = 1; j <=i ; j++){ //this display column
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}