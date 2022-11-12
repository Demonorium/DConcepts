package ru.demonorium.concepts.misc;

public interface IntColorProvider {
    int MAX_COLOR = 255;
    int ALPHA_OFFSET = 24;
    int RED_OFFSET = 16;
    int GREEN_OFFSET = 8;
    int BLUE_OFFSET = 0;

    default int a() {
        return rgba() >> ALPHA_OFFSET & MAX_COLOR;
    }

    default int r() {
        return rgba() >> RED_OFFSET & MAX_COLOR;
    }

    default int g() {
        return rgba() >> GREEN_OFFSET & MAX_COLOR;
    }

    default int b() {
        return rgba() & MAX_COLOR;
    }

    default int rgba() {
        return rgba(a(), g(), b(), a());
    }

    static int rgba(int r, int g, int b, int a) {
        return a << ALPHA_OFFSET | r << RED_OFFSET | g << GREEN_OFFSET | b;
    }

    static int rgb(int r, int g, int b) {
        return rgba(r, g, b, MAX_COLOR);
    }

    static int light(int amount, int a) {
        return rgba(amount, amount, amount, a);
    }

    static int light(int amount) {
        return rgb(amount, amount, amount);
    }

    static int extractLight(int r, int g, int b) {
        return r > g ? Math.max(r, b) : Math.max(g, b);
    }

    static int getR(int rgba) {
        return rgba >> RED_OFFSET & MAX_COLOR;
    }

    static int getG(int rgba) {
        return rgba >> GREEN_OFFSET & MAX_COLOR;
    }

    static int getB(int rgba) {
        return rgba >> BLUE_OFFSET & MAX_COLOR;
    }

    static int getA(int rgba) {
        return rgba >> ALPHA_OFFSET & MAX_COLOR;
    }
}
