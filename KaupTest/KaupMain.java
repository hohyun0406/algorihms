package KaupTest;

public class KaupMain {
    //카우프지수 구하는 프로그램을 작성해 주세요
    public static void main(String[] args) {
        System.out.println("체질량 지수를 계산하겠습니다");

        double height = (Math.random()*50+150);
        System.out.printf("당신의 키는 %f입니다.", height);
        double heightM = height/100;
        double heightM2 = heightM * heightM;

        double weight = (Math.random()*69+30);
        System.out.printf("당신의 체중은 %f입니다.", weight);

        double bmi = weight / heightM2;
        System.out.printf("BMI 지수는 %f입니다.", bmi);
    }
}
