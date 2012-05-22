package air;

public class ScaleTest {
    public static void main(String[] args) {
        Sketch s = new Sketch();
        s.width = 1000;

        s.mouseX = 0;
        s.log("1..100: %.2f", s.scaleLinearlyWithMouseX(1, 100));
        s.mouseX = s.width / 2;
        s.log("1..100: %.2f", s.scaleLinearlyWithMouseX(1, 100));
        s.mouseX = s.width;
        s.log("1..100: %.2f", s.scaleLinearlyWithMouseX(1, 100));

        s.mouseX = 0;
        s.log("100..200: %.2f", s.scaleLinearlyWithMouseX(100, 200));
        s.mouseX = s.width / 2;
        s.log("100..200: %.2f", s.scaleLinearlyWithMouseX(100, 200));
        s.mouseX = s.width;
        s.log("100..200: %.2f", s.scaleLinearlyWithMouseX(100, 200));

        s.mouseX = 0;
        s.log("-50..50: %.2f", s.scaleLinearlyWithMouseX(-50, 50));
        s.mouseX = s.width / 2;
        s.log("-50..50: %.2f", s.scaleLinearlyWithMouseX(-50, 50));
        s.mouseX = s.width;
        s.log("-50..50: %.2f", s.scaleLinearlyWithMouseX(-50, 50));
    }
}
