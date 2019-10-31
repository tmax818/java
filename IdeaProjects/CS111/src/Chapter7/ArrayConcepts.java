package Chapter7;

import java.util.Scanner;

public class ArrayConcepts {

    public static void main(String[] args) {
        int[] myList = {115, 1207, 1, 32, 14, 10, 1024, 256};
        Scanner input = new Scanner(System.in);
        int key;

        System.out.println("Enter the key(search) value: ");
        key = input.nextInt();

        int index = linearSearch(myList, key);

        System.out.println(index);


    }

    public static int linearSearch(int[] array, int key){

        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
