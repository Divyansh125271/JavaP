import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        pattern2(6);
    }
   
    static void pattern2(int n){                          
        for(int row = 1; row<=n ; row++){                  
            for(int col = 1; col <= n-row+1; col++){
            System.out.print("*");
            }
        System.out.println();
    }
}
}
