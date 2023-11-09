public class TestRect {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(); // เรียกใช้งาน Class โดยการสร้าง Object ขึ้นมา
        rect.width = 100;
        rect.height = 50;
        rect.name = "Rect 1";

        Rectangle rect2 = new Rectangle(); // เรียกใช้งาน Class โดยการสร้าง Object ขึ้นมา
        rect2.width = 44;
        rect2.height = 22;
        rect2.name = "Rect 2";

        System.out.println("Name : " + rect.name);
        System.out.println("W = " + rect.width + " - H = " + rect.height);
        System.out.println("Area = "+rect.computerArea());
        System.out.println("-------------------------");
        System.out.println("Name 2 : " + rect2.name);
        System.out.println("W = " + rect2.width + " - H = " + rect2.height);
        System.out.println("Area = "+rect2.computerArea());
    }
}
