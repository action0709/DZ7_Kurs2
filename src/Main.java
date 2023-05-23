import java.util.*;

public class Main {
    public static void main(String[] args) {

        //задание 1
      List<Integer> nums =new ArrayList<>(List.of(1, 10, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if(num % 2 ==1){
                System.out.println(num);
            }

        }
       // задание 2
        System.out.println();
        Set<Integer> set=new TreeSet<>(nums);
        for (Integer num : set) {
            if(num%2==0){
                System.out.println(num);
            }

        }

    }
}