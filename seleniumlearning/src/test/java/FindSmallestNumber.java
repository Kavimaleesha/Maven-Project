import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestNumber {


        Integer givenArray[] = {2,1,5,3,4};


        //1st approach
        public void findSmallestValue(){
            int smallest = Integer.MAX_VALUE;

            for(int i = 0; i < givenArray.length ; i++){
                if (givenArray[i]<smallest){
                    smallest = givenArray[i];

                }
            }
            System.out.println(smallest);
        }

    //2nd approach
        public void usingArrays(){
            Arrays.sort(givenArray);
            System.out.println(givenArray[0]);
    }

    //3rd approach
            public void usingCollections(){
                List<Integer> list = Arrays.asList(givenArray);
                Collections.sort(list);
                int smallest = list.get(0);
                System.out.println(smallest);
    }

        public static void main(String[] args) {
            FindSmallestNumber small = new FindSmallestNumber();
            //small.findSmallestValue();
            //small.usingArrays();
            small.usingCollections();
    }
}