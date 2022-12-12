public class Main {
    public static void main(String[] args) {
        String string1 = "United Kingdom";
        String string2 = "Germany";

        String sub1 = string1.substring(0, string1.length() / 2 - 1);
        String sub2 = string1.substring(string1.length() / 2, string1.length());
        char[] charArray = (sub1.toUpperCase() + " " + string2.toUpperCase() + " " + sub2.toUpperCase()).toCharArray();
        System.out.println(charArray);
    }
}