
public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 30; i++) {
            System.out.println(d6());
        }

    }

    public static int d6 () {
        return (int)(Math.random()*6) + 1;
    }
}
