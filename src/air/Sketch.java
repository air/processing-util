package air;

import processing.core.PApplet;

public class Sketch extends PApplet {
    protected static final long serialVersionUID = -8026930101798671837L;

    protected int debugEveryNFrames = 100;

    protected void showDebugAtIntervals() {
        if (frameCount % debugEveryNFrames == 0) {
            showDebug();
        }
    }

    protected void showDebug() {
        log("%.1f", frameRate);
    }

    public float scaleLinearlyWithMouseX(float min, float max) {
        int steps = width;
        float valuePerStep = (max - min) / steps;
        return min + (valuePerStep * mouseX);
    }

    protected void log(String format, Object... args) {
        System.out.println(String.format(format, args));
    }

    protected void log(String msg) {
        System.out.println(msg);
    }
}
