package beokJoon;

import java.util.Scanner;

public class NanJaengs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] heights = new int[9];
        int heightsSum = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            heightsSum += heights[i];
        }

        int fakeNan1 = 0;
        int fakeNan2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int a = i + 1; a < 9; a++) {
                if (heightsSum - heights[i] - heights[a] == 100) {
                    fakeNan1 = i;
                    fakeNan2 = a;
                }
            }
        }

        System.out.println("화이팅!!");

        for (int i = 0; i<9; i++){
            for (int a = 1; a < 100; a++) {
                if (heights[i]==a) {
                    if (heights[i]!=fakeNan1){
                        if(heights[i]!=fakeNan2){
                            System.out.println(heights[i]);
                        } else {

                        }
                    } else {

                    }
                }
            }
        }


    }
}
