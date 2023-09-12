public class DrawFigures {
    public static void main(String[] args) {
        drawDiamond();
        drawX();
        drawRocket();
    }

    private static void drawCone() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    private static void drawV() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    public static void drawRocket() {
        drawCone();
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        drawCone();
    }

    public static void drawDiamond() {
        drawCone();
        System.out.println();
    }

    public static void drawX() {
        drawV();
        drawCone();
        System.out.println();
    }
}