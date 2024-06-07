public class Freqstring {
    public static void main(String[] args) {
        String str = "an an an an an an an an an";
        int totalcount = str.length();

        int totalcount_afterremove = str.replace("a"," ").length();
        int count = totalcount - totalcount_afterremove;

        System.out.println(count);
    }
}
