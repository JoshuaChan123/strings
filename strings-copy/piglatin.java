public class piglatin {
    public static void main (String[] args) {
        sentence("Test12345asd");
    }

    public static void sentence(String str) {
        while (str.length() > 0) {
            System.out.print(change(str));
            System.out.println("");
            str = "";
            String word = str.substring(0,0);
            System.out.print(change(word) + " ");
        }
    }

    public static String change(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(1,str.length()) + str.substring(0,1) + "ay";
    }
}