package practice_with_Mj;


public class Main {

static int count;

public Main(){
    count++;
}
public Main(int i){
    count +=i;
}
public Main(String s) {
    count+= s.length();
}
}
class Test{
    public static void main(String[] args) {
        new Main();
        Main a = new Main();
        Main a2 = new Main("word");
        Main a3 = new Main(5);
        System.out.println(Main.count);
    }
}