import java.util.List;
import java.util.Arrays;


class Test {

    public static void main(String[] args) {
        Test tq = new Test();
        tq.testSpecificElement();
    }

    public void testSpecificElement() {
        List<Integer> list = Arrays.asList(1, 4, 5, 7, 8, 9, 13, 11);
        PrimeNumber pn = new PrimeNumber();
        EvenNumber en = new EvenNumber();
        Algorithm a = new Algorithm();
        System.out.println("Count of prime numbers: " + a.count(list, pn));
        System.out.println("Count of even numbers: " + a.count(list, en));
    }
}


