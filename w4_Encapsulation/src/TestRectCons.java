public class TestRectCons {
  public static void main(String[] args) {
    RectangleCons rect1 = new RectangleCons(); // Default Constructor
    RectangleCons rect2 = new RectangleCons(10.0, 20.0); // Overloading Constructor
    RectangleCons rect3 = new RectangleCons(-20.0, 40.0, "Rect3"); // Overloading Constructor
    
    rect1.setWidth(100);
    rect1.setHeight(50);
    //rect1.setSize(100, 50);
    rect1.name = "Rect1";

    rect2.name = "Rect2";

    rect1.displayDetail();
    rect2.displayDetail();
    rect3.displayDetail();

  }
}