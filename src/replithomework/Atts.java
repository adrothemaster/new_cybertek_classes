package replithomework;

 class Atts {
    /**
     * You have two classes Main and Atts. Do not touch the Main class. Finish the Atts class to have attributes:
     * Strings: name, color
     * int: amount
     * Method: asString() (returns String in format shown below)
     * All attributes should be public
     * Example:
     *    Atts a = new Atts();
     *    a.name = "table";
     *    a.color = "brown";
     *    a.amount = 1;
     *    System.out.println(a.asString());
     * Output
     * name: table color: brown amount: 1
     */
        String name;
        String color;
        int amount;

       public String asString(){
           return "name: " + name + " color: " + color + " amount: " + amount;
       }


//   public Atts(String name, String color, int amount){
//
//            this.name = name;
//            this.color = color;
//            this.amount = amount;
//        }

//    public String asString(){
//        Atts atts = new Atts(name,color,amount);
//            this.name = name;
//            this.color = color;
//            this.amount = amount;


 //     }




//    @Override
//    public String toString() {
//        return "Atts{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", amount=" + amount +
//                '}';
    }


    //public static void main(String[] args) {
    //            Scanner in = new Scanner(System.in);
    //            Atts a = new Atts();
    //            a.name = in.next();
    //            a.color = in.next();
    //            a.amount = in.nextInt();
    //
    //            System.out.println(a.asString());



