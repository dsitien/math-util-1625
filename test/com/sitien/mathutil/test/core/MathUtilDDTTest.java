package com.sitien.mathutil.test.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import com.sitien.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author CNM
 */

//câu lệnh này chỉ chơi JUnit báo hiệu cần loop qua tập data
//lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //ta trả về mảng 2 chiều gồm Expected|Input
    @Parameterized.Parameters //JUnit sẽ ngầm chạy loop qua từng dòng của mảng về 
                                // lấy ra cặp data input/expected
    //tên hàm ko quan trong, quan trong là @
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {6, 720},};

    }

    //giả sử loop qua tưg dòng của mảng, ta vẫn cần gán từng value của cột
    //vào biến tương ưg input
    
    @Parameterized.Parameter(value = 0)
    public  int n; // biến map viws value cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public long expected; // kiểu long vì giá trị trả về hàm getF()
                            // là long

    @Test
     public void testGetFactorialGivenRightArgumentReturnsWell(){
          Assert.assertEquals(expected,MathUtil.getFactorial(n));
     }
}
