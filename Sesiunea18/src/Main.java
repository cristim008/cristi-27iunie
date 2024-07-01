import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Consumer<List<Integer>> integerList=(L) ->{
            for(Integer i: L){
                System.out.println(i);
            }
        };
        integerList.accept(myList);

        Random random=new Random();
        Supplier<Integer> randomInteger=() -> random.nextInt(100);
        System.out.println("Random number :" +randomInteger.get());


        Predicate<String> predicate = (s) -> s != null && !s.isEmpty();

        System.out.println(predicate.test("Hello world!"));
        System.out.println(predicate.test(null));


    }

}