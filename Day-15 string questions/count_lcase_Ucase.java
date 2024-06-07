public class count_lcase_Ucase {
    
    public static void main(String[] args) {//main method
        String str = "Manvik Sagar 023";
        countLetters(str);
    }   
    
    public static void countLetters(String str) {//counter method
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        System.out.println("Uppercase letters count: " + uppercaseCount);
        System.out.println("Lowercase letters count: " + lowercaseCount);
    }

}
