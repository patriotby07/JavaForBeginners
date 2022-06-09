package HW_Sergei.HW_11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_2 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) { //можно поменять на Integer
            numbers.add(i);
        }
        System.out.println(numbers);


        List<Integer> numbers2 = new ArrayList<>();
        for (Integer num : numbers) {  //можно поменять на int
            if (num % 2 != 0) {
                numbers2.add(num);
            }
        }
        System.out.println(numbers2);


        for (int i = numbers.size(); i-- > 0;) { //если здесь ставить Integer, то удаление идет не по индексу, а по значению (используется не int, а Object)
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);


        for (Integer i = numbers.size(); i-- > 0;) { //если здесь ставить Integer, то удаление идет не по индексу, а по значению (используется не int, а Object)
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i.intValue());
            }
        }
        System.out.println(numbers);


        List<Integer> list = IntStream.range(100, 1000).boxed().collect(Collectors.toList());
        System.out.println(list);

        List<Integer> oddEven = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(oddEven);
    }
}
