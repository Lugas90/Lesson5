public class Main {
    public static void main(String[] args) {
        // Задание 1
        int [] array1 = new int[] {1,2,3};
        double [] array2 = {1.57, 7.654, 9.986};
        char [] array3 = {'q', 'w', 'e', 'r', 't', 'y'};
        // Задание 2
        System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
        System.out.println(array3[0] + ", " + array3[1] + ", " + array3[2] + ", " + array3[3] + ", " + array3[4] + ", " + array3[5]);

        // Задание 3
        System.out.println(array1[2] + ", " + array1[1] + ", " + array1[0]);
        System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);
        System.out.println(array3[5] + ", " + array3[4] + ", " + array3[3] + ", " + array3[2] + ", " + array3[1] + ", " + array3[0]);

        // Задание 4
        for (int i = 0; i < array1.length; i++){
            if (array1[i] % 2 != 0) {
                array1[i]++;
            }
        }
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
    }
}