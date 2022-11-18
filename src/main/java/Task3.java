public class Task3 {

    public static void main(String[] args) {
        int n = 20;
        int[] array = new int[n];                     // Задаем длину массива
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < n; i++)
            if (array[i] % 3 == 0)
                System.out.println(array[i]);
        System.out.println();

        int[] array1 = {13, 15, 33, 78, 131, 124, 300}; // вводим вручную значения массива
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 3 == 0)
                System.out.println(array1[i]);
        }
    }
}
