/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sitien.mathutil.test.core;

import com.sitien.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author CNM
 */
public class TestMath {
    
    // đây là class sử dụng hàm thư viên/framework JUnit
    //để kiểm thử/ktra code chính - hàm tisnhGiaiThuwf() bên kia
    
    // có nhiều quy tắc đặt tên hàm
    // nhưng thường nói lên mục đích case
    // tình huống thành công hay thất bại
    
    //hàm dưới là chạy thành công
    //ta xài hàm well đưa đúng 5! 6! ko chơi -4! 30!
    
    //@Test JUnit phối hợp JVM để chạy hàm này
    //@Test phía huậ trường chính là public static void main()
    // nhiều @Testđể kiểm thử hàm tính giai thừa
    
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
    
        int n = 1; //test tình huống tử tế, chạy đúng
        long expected = 1; // hy vọng 0! 1
        
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs actual dùng xanh xanh đỏ đỏ
        
        Assert.assertEquals(expected, actual);
          
        //hàm giúp 2 giá trị giống hay k
        //giống --> màu xanh, ok ít nhất cho case đg test
        //ko giống --> đỏ expected khác actual
        
    
        // gộp thêm vài case nữa
        
        Assert.assertEquals(1, MathUtil.getFactorial(1));//1!=1
        Assert.assertEquals(2, MathUtil.getFactorial(2));//2!=2
        Assert.assertEquals(6, MathUtil.getFactorial(3));//3!=6
        Assert.assertEquals(24, MathUtil.getFactorial(4));//4!=24
        Assert.assertEquals(120, MathUtil.getFactorial(5));//5!=120
    }
    
    
    //Xử lí 2 tình huống
    //1. đưa data tử tế tính đúng- done
    //2. đưa data vào cà chớn, âm, >20; thiết kế ném ra ngọa lệ
    // mong kì vọng xuất hiên n<0 hoặc n>20
    //Hàm ném ra ngoại lệ --> hàm chạy đúng
    
    
    //nếu hàm  n<0 hoặc n>20 và k ném ngoại lệ thì chạy sai thiết kế, màu đỏ
    
    //Test case:
    //input: -5
    //expect: IllegalArgumentException
    //tình huống ngoại lệ k đo lường kiểu value
    //assertEquals() k dùng ngoại lệ đc
    //               chỉ bằng nhau value
    
    
//màu đỏ, đúng ném ngoại lệ mà k giống ngoại lệ kì vọng
    @Test(expected = NumberFormatException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
    
        MathUtil.getFactorial(-5); // hàm @Test chạy ném về ngoại lệ
    
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException1(){
    
        MathUtil.getFactorial(-5); // hàm @Test chạy ném về ngoại lệ
    
    }
    
    
    //cách viết tự nhiên hơn
    //Test case: hàm sẽ ném về ngoại lệ nê nhận vào 21
    //cần thấy màu xanh khi chơi 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_Lambda(){
    
//        Assert.assertThrows(tham số 1: loại ngoại lệ thứ nhất,
//                             tham số 2: đoạn code chạy văng ra ngoại lệ);
        
        Assert.assertThrows(IllegalArgumentException.class, 
                ()-> MathUtil.getFactorial(-5));
       // MathUtil.getFactorial(-5); // hàm @Test chạy ném về ngoại lệ
    
    }
     @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
    
         try {
              MathUtil.getFactorial(-5); // hàm @Test chạy ném về ngoại lệ
         } catch (Exception e) {
             //bắt try catch là ra xanh nhưng k chắc ngoại lệ cần xuất hiện k
             //có đoạn cde đúng ngoại lệ IllegalArgumentException
          Assert.assertEquals("Invalid argument. N must be between 0 ..20",
                  e.getMessage());
         }
       
    
    }
    
}
