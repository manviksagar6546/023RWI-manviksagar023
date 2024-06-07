public class FindVowels {
     public static int countVowels(String str) {
        int count = 0;
        
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();
        
        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Manvik sagar";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
