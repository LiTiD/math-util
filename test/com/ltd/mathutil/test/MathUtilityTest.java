/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltd.mathutil.test;

import com.ltd.mathutil.MathUtility;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.sql.SQLException;

/**
 *
 * @author LTD
 */
public class MathUtilityTest {

    // Đặt tên hàm theo chuẩn dân TEST phần mềm, QA/QC
    @Test   // Biến hàm này thành main()
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);

        assertEquals(expected, actual);

        // Cách gán thẳng, không cần khai báo.
        assertEquals(720, MathUtility.getFactorial(6)); // Test 6! có đúng = 720 không?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));

        /*  Màu đỏ đến theo 2 nghĩa :
            Hàm tính đúng, kì vọng sai.
            Hàm tính sai, kì vọng đúng.
        
            Mỗi lời gọi hàm ở trên được gọi là mỗi TEST CASE
            với 1 đầu vào và nhận đầu ra.
         */
    }

    /*
        Test ngoại lệ thì test như thế nào?
        Vì khi ngoại lệ xảy ra -> app dừng liền -> MÀU ĐỎ -> app không ổn đã diễn ra.
        Ngoại lệ không phải là VALUE để so sánh, không biết nó là số mấy, chuỗi gì?
        Ngoại lệ chỉ có thể là ước lượng nó, chạm nó khi nó xảy ra.
        Test ngoại lệ nên được đọc/diễn giải như sau:
            Tui đưa vào các tình huống dữ liệu cà chớn, ví dụ -5 , 22 , 40.
            Tui muốn nhìn xem ngoại lệ có xảy ra trong tình huống này hay không?
            nếu có xảy ra, thì mừng lắm luôn, vì app/hàm chạy đúng như thiết kế.
            tức nếu getFactorial(-5) mà ném ra ngoại lệ IllegalArgumentException
            có nghĩa là hàm đúng
            CÓ NGHĨA LÀ HÀM XANH (Đừng bối rối khi có EXCEPTION mà lại XANH)
            XANH vì thiết kế nói rằng tình huống -5 phải có ngoại lệ và nếu ngoại lệ xuất hiện, thì hàm đúng.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);   // Chạy hàm hoy, chưa có test.
        MathUtility.getFactorial(21);   // Biết thừa hàm ném ra Exception
        MathUtility.getFactorial(-1);   // ta phải bắt lại Exception
        MathUtility.getFactorial(4);   // nếu có thật, hàm đúng -> XANH
    }

}

/*  Việc test dùng màu sắc, dùng thư viện Unit Test có quy ước nếu tất cả các cặp expected và actual khớp nhau (equals)
    thì coi như hàm chạy đúng mọi tình huống ta đã test -> XANH

    Nếu trong tất cả các cặp mà ta test có ít nhất 1 cặp không khớp nhau - ít nhất 1 màu ĐỎ, coi như hàm không ổn -> ĐỎ CHUNG.
    Điều này để đảm bảo rằng, phàm hàm đã test các tình huống thì phải đúng hết các tình huống đã test.
    Nói cách khác, những gì ta chủ động liệt kê, thì ta phải thấy đúng.
*/
