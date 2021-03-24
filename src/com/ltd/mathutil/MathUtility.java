/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltd.mathutil;

/**
 *
 * @author LTD
 */
public class MathUtility {
    // Ta sẽ tạo các hàm trong class này fake y chang class Math của JDK
    // Các hàm sẽ xài chung ở nhiều nơi, làm tiện ích dùng chung
    // Phàm cái gì dùng chung thì ta suy nghĩ đến STATIC
    // Ta sẽ không chế n đầu vào của hàm từ 0..20
    
    public static final double PI = 3.1415;
    
    public static long getFactorial(int n){
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument, n must be between 0..20");
        }
        if (n == 0 || n == 1){
            return 1;
        }
        long result = 0;
        for (int i = 2; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}
