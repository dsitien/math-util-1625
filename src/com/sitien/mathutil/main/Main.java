/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sitien.mathutil.main;

import com.sitien.mathutil.core.MathUtil;

/**
 *
 * @author CNM
 */
public class Main {
    public static void main(String[] args) {
        // thử nghiệm hàm tính coi chạy đúng thiết kế k
        // đưa tình huống thục tế
        // vd đưa -5,0,20,21 coi ra gì
        // TEST CASE: một tifh huống hàm/app/màn hfnh/tính năng đc đưa vào sử dụng 
        // giả lập hành vi xài của ai đó
        
        //TEST CASE: là tình huống sử dụng, xài app bao hàm data đầu vào cụ thể
        // INPUT CỤ THỂ NÀO ĐÓ
        //OUTPUT ĐẦU RA ỨNG XỬ LÍ HÀM/ CHỨC NĂNG
        //KÌ VỌNG MONG HÀM TRẢ VỀ VALUE INPUT Ở TRÊN
        // SO SÁNH KẾT QUẢ XEM NHƯ KÌ VỌNG HAY K
        
        long expected =123;// kì vọng hàm hói về 5!
        int n =5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("aaaaa");
        System.out.println("5!=120 (expected);actual: "+ actual);
    }
}
