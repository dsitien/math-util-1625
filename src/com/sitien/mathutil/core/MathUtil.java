/*/
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sitien.mathutil.core;

/**
 *
 * @author CNM
 */
public class MathUtil {
    //trong class cung cap cho ai do nhieu hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung ko lưu lại trnagj thái/giá trị chọn thiết kế hàm static
    
    //hàm giai thừa !!!
    // n! = 1.2.3.4....n
    // ko giai thừa âm
    // 0! = 1! = 1 quy ước
    // giai thừa đồ thị hàm số tăng nhanh về giá trị
    // 20 giai thừ là 18 số 0, vừa kịp kiểu long
    // 21 tràn
    // quy ước tính n! trong 0 đến 20
    
//    public static long getFactorial(int n){
//        if (n<0 || n > 20) 
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 ..20");
//        if (n==0 || n==1)
//            return 1; //kkết thúc sớm nếu nhận giá trị đặc biệt
//        long product = 1; // tích nhân dồn
//        for (int i = 2; i <= n; i++) 
//            product *= i; //product =  product * i
//        return product;
//    }
    
    //học đệ quy trong 30s -RECURSION
    //hiện tượng gọi lại chính mình ở quy mô khác
    //VD: con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn, nhỏ hơn nữa,... đến điểm đừng
    
    //tính 6!
    //n! = 1.2.3.... .n
    //6! = 6.5!
    //5! = 5.4!
    //....
    //2! = 2*1! //diểm dừng
    //1! =1
    
    //chốt hạ n! = n * (n-1)!
    public static long getFactorial(int n){
       if (n<0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. N must be between 0 ..20");
        if (n==0 || n==1)
            return 1; //kkết thúc sớm nếu nhận giá trị đặc biệt
       
        return n * getFactorial(n-1);
    }
}   
