package _06_ke_thua.bai_tap.lop_point_va_movablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint m = new MovablePoint(7.2f, 5.2f, 3.4f, 5);
        System.out.println(m.toString());
        Point t; // chỗ này chỉ cần dùng kiểu Point hoặc MovablePoint là đủ, không cần new vì sẽ bị dư thừa,
        // do xuống dưới mình gán địa chỉ trả về kiểu MovablePoint vào biến t.
        t = m.move();
        System.out.println(m.toString());
        System.out.println(t.toString());
    }
}
