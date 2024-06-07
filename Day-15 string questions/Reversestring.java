public class Reversestring {
    public static void main(String[] args) {
        String str = "Manvik sagar";
        String reversedStr = reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }    

    public static String reverse(String str){
        char[] arr = str.toCharArray();

        int n = arr.length;

        for(int i = 0; i< n/2 ; i++){
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        return new String(arr);
    }

}
