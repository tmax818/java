package Chapter7;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myList = {115, 1207, 1, 32, 14, 10, 1024, 256};
        for(int i = 0; i < myList.length; i++){
            System.out.println(myList[i]);
        }
    }

    public static void sort(int[] list){
        for(int i = 0; i < list.length; i++){
            int currMin = list[i];
            int currMinIndex = i;

            for(int j = i + 1; j < list.length; j++){
                if(currMin > list[j]){
                    currMinIndex = j;
                }
            }

            if(currMinIndex != i) {
                list[currMinIndex] = list[i];
                list[i] = currMin;
            }
        }
    }
}
