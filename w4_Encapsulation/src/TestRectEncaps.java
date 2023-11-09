public class TestRectEncaps {
    
    public static void main(String[] args) {
        RectEncaps rect = new RectEncaps();
        rect.setWidth(100);
        rect.setHeight(50);
        rect.name = "Rects 1";

        System.out.println("Object name : "+rect.name);
        System.out.println("W = " + rect.getWidth() + " - H = " + rect.getHeight());
        System.out.println("Area = " +rect.computerArea());
    }
}
