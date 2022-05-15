package sorting;

public class UseInsertionSorting {
    public static void main(String[] args) {

        int[] array  = {4,6,8,5,2,9,3};
        int temp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (array[j] < array[j-1]){
                   temp = array[j];
                   array[j] = array[j-1];
                   array[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
