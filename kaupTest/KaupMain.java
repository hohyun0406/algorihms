package kaupTest;

import java.util.Scanner;

public class KaupMain {
    static double returnHeight() {
        double height = (Math.random()*50+150);
        height = Math.floor(height*10)/10;
        return height;
    }
    static double returnWeight() {
        double weight = (Math.random()*70+30);
        weight = Math.floor(weight*10)/10;
        return weight;
    }
    //카우프지수 구하는 프로그램을 작성해 주세요
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("체질량 지수를 계산하겠습니다.");
        System.out.println("이름을 입력하십시오.");
        String name = sc.next();

        System.out.printf("당신의 이름은 %s입니다", name);
        System.out.printf("당신의 키는 %.1f입니다.", returnHeight());

        System.out.printf("당신의 체중은 %.1f입니다.", returnWeight());

        double bmi = returnWeight()/(returnHeight()/100*returnHeight()/100);
        System.out.printf("BMI 지수는 %.1f입니다.", bmi);

    }
}
