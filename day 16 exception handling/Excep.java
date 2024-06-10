public class Excep {
    public static void main(String[] args) {
        System.out.println( 1 );
        System.out.println( 2 );
        //System.out.println( 10/0 );
        try {
            System.out.println( 10/0 );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(15);
        }
        System.out.println( 12 );
        System.out.println( 100 );
         
    }
}
