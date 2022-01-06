import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int size;
      int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của ma trận: ");
        size = scanner.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Nhập phần tử cho ma trận: ");
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("arr[" + i + "]["+ j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // các phần tử nằm trên đường chéo chính là các phần tử có chỉ số dòng và chỉ số cột bằng nhau
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử trên đường chéo chính = " + sum);


//        System.out.println("Ma trận: ");
//        for (int[] row : arr) {
//            for (int element : row) {
//                System.out.println( element);
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++){
//            sum += arr[i][i];
//        }
//        System.out.println("Tổng trên đường chéo chính của ma trận:" + sum);
    }
}
