package not.hub.processing;

import processing.core.PApplet;
import processing.core.PImage;
import processing.event.KeyEvent;

public class Applet extends PApplet {

    private PImage image;
    private float r = 0;
    private float g = 0;
    private float b = 0;

    public static void main(String[] args) {
        PApplet.main(Applet.class);
    }

    @Override
    public void settings() {
        size(300, 300);
        smooth();
    }

    @Override
    public void setup() {
        surface.setTitle("Processing Java Applet");
        surface.setResizable(false);
        //textFont(createFont("Hasklig-Regular.otf", 28), 20);
        image = loadImage("figure.png");
        frameRate(30);
    }

    @Override
    public void draw() {
        background(r = (r + 1) % 127, g = (g + 2) % 127, b = (b + 1) % 255);
        final var message = "Hello World!";
        text(message, 50, 50);
        image(image, 50, 100);
    }

    @Override
    public void keyPressed(KeyEvent event) {
        System.out.println(event.getKey());
        System.out.println(event.getKeyCode());
        System.out.println(event.isAutoRepeat());
    }

}
