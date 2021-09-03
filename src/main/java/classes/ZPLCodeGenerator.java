package classes;

public class ZPLCodeGenerator {
    public static String getTextLine(String text) {
        return text;
    }

    public static String getStartCode (){
        return "^XA";
    }

    public static String getEndCode() {
        return "^XZ";
    }

    public static String setPosition(int x, int y) {
        return "^FO " + Integer.toString(x) + "," +Integer.toString(y);
    }
}
