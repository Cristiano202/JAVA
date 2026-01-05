package academy.devdojo.maratonajava.javacore.ZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
     List<String>string=List.of("Cris","Mano cris","zoro");
        forEach(string,s -> System.out.println(s));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T t: list){
            consumer.accept(t);
        }

    }
}
