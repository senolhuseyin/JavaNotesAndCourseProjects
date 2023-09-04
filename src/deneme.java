import java.util.*;

public class deneme {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(7);
        nums.add(4);
        nums.add(1);
        nums.add(9);

        int output;

        int arrsize = nums.size();
        if (arrsize < 2){
            output = -1;
        }
        else {
            int currentMaxDiff = nums.get(1) - nums.get(0);
            int currentMin = nums.get(0);
            for (int i = 1; i < arrsize; i++){
                if (nums.get(i) - currentMin > currentMaxDiff){
                    currentMaxDiff = nums.get(i) - currentMin;
                }

                if (nums.get(i) < currentMin) {
                    currentMin = nums.get(i);
                }
            }

            if (currentMaxDiff < 0) {
                output = -1;
            }
            else {
                output = currentMaxDiff;
            }
        }
        System.out.println(output);

    }


}






