public class Countcharacter {
    public static int counter(String str, char c) {
        int length = str.length();
        int newLength = str.replace(String.valueOf(c), "").length(); 
        return length - newLength;
    }

    public static void main(String[] args) {
        String str = "Manvik sagar";
        char c = 'a';

        int acc = counter(str, c);
        System.out.println("The character '" + c + "' occurs " + acc + " times in the string.");
    }
}
