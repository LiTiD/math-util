/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltd.mathutil.main;

import com.ltd.mathutil.MathUtility;

/**
 *
 * @author LTD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        
        System.out.println("5!\nexpected : " + expected + ";\nactual : " + actual);
        
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        
        System.out.println("5!\nexpected : " + expected + ";\nactual : " + actual);
    }
    
}

/*  Trong quy trình làm phần mềm, dân DEV phải có trách nhiệm test từng hàm 
    từng class mà mình viết ra trước khi đóng gói gửi cho bên QA/QC test độc lập
    Từng hàm, từng class phải được test cẩn thận trước khi chúng được dùng để phối
    hợp với các class khác. Test ngay mục hàm, mục class vừa hoàn thiện, chưa thăm
    quan về UI, thi mục đó test sớm này gọi là UNIT TEST LEVEL - Test từng đơn thể, đơn vị code.
*/

/*
    Vậy làm sao để test từng hàm, từng class?
    Có nhiều cách để test từng hàm, từng class:
    1. Cách 1: Dùng sout để in ra giá trị xử lý của hàm ( Dùng trong môn OOP )

    2. Cách 2: Dùng trong JoptionPane của môn Java DeskTop để pop-up một cửa sổ
    in ra kết quả xỷ lý của hàm để kiểm tra coi hàm chạy đúng hay sai.

    3. Cách 3: Dùng LOG FILE, trang Web in ra kết quả xử lý của hàm (Môn Java Web).

    Dù là cách nào thì ta cũng cần phải in ra giá trị hàm đã xywr lý gọi là ACTUAL VALUE
    Rồi ta đi so sánh cái giá trị trả về của hàm có giống như ta tính toán trước đó hay không
    Cái ta hi vọng hàm sẽ trả về gọi là EXPECTED VALUE

    Nếu ACTUAL VALUE = EXPECTED VALUE -> Hàm chạy ngon
                    Khác              -> Hàm sai

    Nguyên tắc của việc TEST : So sánh ACTUAL với EXPECTED

    3 cách này đều dùng 1 nguyên tắc:
    Gọi hàm để xem hàm xử lý ra kết quả mấy
    Sau đó dùng mắt thường để so sánh ACTUAL với EXPECTED rồi ta tự kết luận
    Cách này sẽ tiềm ẩn sai sót khi ta phải xem có quá nhiều cấp VALUE
    Ví dụ hàm GiaiThua() phải test trường hợp < 0 , = 0 , 1 , 18 , 19 , 20 (Biên) , ... > 20 , = 30 , 40 , có khi là 1 triệu.

    Mỗi n để test ta gọi là 1 tình huống test xài hàm, 1 tình huống test - TEST CASE

    4. Cách 4: Không thèm nhìn bằng mắt từng trường hợp EXPECTED và ACTUAL
    Nhờ máy nhìn luôn, vì máy đủ sức biết cách so sánh
    Máy quét qua tất cả các cấp EXPECTED và ACTUAL
    Nếu tất cả đều khớp báo màu XANH - ĐƯỜNG THÔNG CODE TỐT
    Nếu có xuất hiện ít nhất 1 thằng không khớp EXPECTED với ACTUAL
    Báo màu ĐỎ - ĐƯỜNG KẸT CODE GẶP TRỤC TRẶC
    Muốn làm được điều này ta cần thư viện hỗ trợ
    JAVA : JUnit, TestNG.
    C#   : NUnit, MSTest, xUnit.
    PHP  : PHPUnit.
    ... Mỗi ngôn ngữ đều có thư viện XANH ĐỎ giúp cảnh báo làm TỐT hay KHÔNG.
*/