package practice_with_Mj;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        boolean b = 10 == 10 &&  false;
        System.out.println(b);

        String drink = "tea";
        boolean hot = true;
        boolean free = true;

        boolean bool=drink.equals("coffee") && hot && free;
        System.out.println(bool);

        bool = drink.equals("coffee") || hot || free;

        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);

        bool = 4>10 || 4 < 5;
        System.out.println(bool);

        bool = drink.equals("te") || drink.equals("coffee") || 4 < 10;
        System.out.println(bool);

        String model = "bmw";
        bool = model.equals("bmw") || model.equals("audi");
        System.out.println(bool);

        System.out.println(!true);

        bool = !true;
        System.out.println(!bool);

        bool = !bool;
        System.out.println(bool);

        //^ exclusive or;

        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(true ^ true);

        //precedence of logical operators
        /* ! is evaluated first
        && is evaluated second
        || is evaluated third
         */

        System.out.println(!(true) && true || true);

        bool = !(1 < 8 && (5 > 2 || 3< 5));
        System.out.println(bool);



    }
}
