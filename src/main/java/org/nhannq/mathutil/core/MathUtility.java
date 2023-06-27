/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.nhannq.mathutil.core;

/**
 *
 * @author talax
 */
//classs này clone giống class java.util.Math
//chứa các hàm static Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.1415;

    //hàm getF() là hàm tính n! = 1.2.3...n
    //thiết kế hàm như sau:
    //0! = 1! = 1
    //ko có giai thừa cho số âm. Nếu đưa -5! -> CHỬI; ném ra Exception
    //vì giai thừa tăng rất nhanh, 21! long ko chứa nổi (long 18 số 0)
    //20! vừa đủ cho long
    //21! 22! 23! > 20! -> CHỬI, ném ra Exception
//        public static long getFactorial(int n) {
//            if (n == 0 || n == 1) 
//                return 1;
//            if (n < 0 || n > 21)
//                throw new IllegalArgumentException("Invalid number n. n must be between 0..20, pls");
//            
//            
//            long product = 1;
//            for (int i = 2; i <= n; i++) 
//                product *= i;
//                
//            return product;
//        }
    public static long getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0 || n > 21) {
            throw new IllegalArgumentException("Invalid number n. n must be between 0..20, pls");
        }
        
        return n * getFactorial(n - 1);
    }
    }
