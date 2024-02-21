package kaupOOP;

import memberOOP.MemberMain;

import java.util.Scanner;

public class KaupView {

    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);

        MemberMain person = null;
        person = new MemberMain(person.getHeight(), person.getWeight());

        System.out.println("체질량 지수를 계산하겠습니다.");
//        System.out.println("이름을 입력하십시오.");
//        person.setName(sc.next());
//        person.setHeight();
//        person.setWeight();

        KaupService service = new KaupServiceImpl();
        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();


        System.out.printf("당신의 이름은 %s입니다.", person.getName());
        System.out.println();
        System.out.printf("당신의 키는 %.1f입니다.", person.getHeight());
        System.out.println();
        System.out.printf("당신의 체중은 %.1f입니다.", person.getWeight());
        System.out.println();
        System.out.printf("BMI 지수는 %.1f입니다.", bmi);
        System.out.println();
        System.out.printf("체질량 지수는 %s입니다.", bodyMass);


    }
}
