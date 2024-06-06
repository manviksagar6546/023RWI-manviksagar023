public class StringMethods_all {
    public static void main(String[] args) {
        String str = "Java";
        int l = str.length();//length method
        System.out.println(l);

        String s = str.toLowerCase();// toLowerCase method
        String sc = str.toUpperCase();// toUpperCase method
        System.out.println(s+" "+sc);

        String st = "         welcome       ";
        String st1 = st.trim();//trim method
        System.out.println(st1);

        String sub = str.substring(2,4);//sub String methods begin to end
        String sb = st.substring(5);//sub String methods begin
        System.out.println(sub); 
        System.out.println(sb);

        String r = str.replace("a","b"); 
        System.out.println(r);

        System.out.println(str.startsWith("J")); //String start with-method
        System.out.println(str.endsWith("v")); //String Ending with-method
        System.out.println(st.charAt(11));//find character index
        System.out.println(str.indexOf("a"));//find index method
        System.out.println(str.lastIndexOf("a"));//find last indexin the right hand side direction method
        

        String ss ="python"; 
        String str1 = "Java";
        System.out.println(str.equals(st));//two strings are equal or not
        System.out.println(str.equalsIgnoreCase(ss)+" "+str.equalsIgnoreCase(str1));//two strings are equal or not

        System.out.println(str.compareTo(st)+" "+str.compareTo(ss)+" "+str.compareTo(str1));

        System.out.println(str.valueOf(ss));
        
    }
}
