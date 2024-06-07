public class Lowercase_counter {
     public static String removeLowercase(String str) {
        // Use a regular expression pattern to match lowercase letters and replace them with an empty string
        String result_str = str.replaceAll("[a-z]", "");
        return result_str;
    }

    public static void main(String[] args) {
        String str = "Manvik agar 023";
        String result_str = removeLowercase(str);
        System.out.println("Original string: " + str);
        System.out.println("String without lowercase letters: " + result_str);
    }
}
