package methodTest;

import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학교에 총 몇 반이 있는지 입력하시오.");


        System.out.println("1반에서 시험에 응시한 학생 수는 몇명입니까?");
        int numberOfStudent1 = sc.nextInt();
        int[] scores1 = new int[numberOfStudent1];

        System.out.println("2반에서 시험에 응시한 학생 수는 몇명입니까?");
        int numberOfStudent2 = sc.nextInt();
        int[] scores2 = new int[numberOfStudent2];

        int avg1 = 0;
        int class1Sum = 0;
        int max1 = 0;

        int avg2 = 0;
        int class2Sum = 0;
        int max2 = 0;

        for (int i = 0; i < scores1.length; i++) {
//            System.out.println("1반 점수를 입력");
            scores1[i] = (int)(Math.random()*100);
            class1Sum += scores1[i];
            if (scores1[i] > max1) {
                max1 = scores1[i];
            }
        }

        for (int i = 0; i < scores2.length; i++) {
//            System.out.println("2반 점수를 입력");
            scores2[i] = (int)(Math.random()*100);
            class2Sum += scores2[i];
            if (scores2[i] > max2){
                max2 = scores2[i];
            }
        }

        avg1 = class1Sum / numberOfStudent1;
        avg2 = class2Sum / numberOfStudent2;

        System.out.println("1반의 평균 점수 :" + avg1 + ". 1등 점수는 " + max1 + "이다.");
        System.out.println("2반의 평균 점수 :" + avg2 + ". 1등 점수는 " + max2 + "이다.");
    }
}
