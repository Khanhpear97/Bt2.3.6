import java.util.Scanner;

public class SumCollum {
    public static void main(String[] args) {
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int size1 = scanner.nextInt();
        System.out.println("Nhap kich thuoc mang con: ");
        int size2 = scanner.nextInt();
        arr = new int[size1][size2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap gia tri phan tu thu " + (j + 1) + " trong mang con thu " + (i + 1));
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Cot can tinh tong: ");
        int col = scanner.nextInt();
        int sum = colSum(arr, col);
        System.out.println("Tong cac phan tu o cot " + col + " bang: " + sum);
    }
    public static int colSum(int[][] array, int col) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == col - 1) {
                    total += array[i][j];
                }
            }
        }
        return total;
    }
}
