package methodTest;

import java.util.Scanner;


public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        arr = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "번째 수를 입력하십시오.");
            int num = Integer.parseInt(sc.next());

            if (num > 0) {
                System.out.println("입력하신 수는 : " + num + "입니다.");
                arr[i] = num;
            } else {
                System.out.println("잘못된 수를 입력하셨습니다.");

            }

        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);



    }
}
