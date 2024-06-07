public class Palandrome {
    public static void main(String[] args) {
        String str = "Mom";

        String palandromStr = palandrome_method(str);
        
        if(str.equalsIgnoreCase(palandromStr.replaceAll("\\s", ""))){
            System.out.println("Given string is palandrome");
        }

        else{
            System.out.println("Givin Sting id not a palandrome");
        }
    }    

    public static String palandrome_method(String str){
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
