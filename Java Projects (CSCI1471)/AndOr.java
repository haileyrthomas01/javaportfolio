public class AndOr {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c, d, e;
        System.out.println("#1:" + a);
        System.out.println("#2:" + b);
        System.out.println("#3:" + (a && b) );
        System.out.println("#4:" + (b || a) );
        System.out.printf("#5: %b \n", a && (b || a || b));
        System.out.println("#6: " + (a == b) );
        System.out.println("#7: " + ((5 == 5 ) && b) );
        System.out.printf("...end main....");
    }//****end main
 } //****end class 