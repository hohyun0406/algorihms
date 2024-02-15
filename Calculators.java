import java.util.Scanner;

public class Calculators {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 값을 입력하십시오.");
        String firstNum = sc.next();
        System.out.println("두번째 값을 입력하십시오");
        String secondNum = sc.next();
        System.out.println("+, -, *, / 을 입력하세요.");
        String opcode = sc.next();
        int result = 0;
        int intNum1 = Integer.parseInt(firstNum);
        int intNum2 = Integer.parseInt(secondNum);

        if (opcode.equals("+")) {
            result = intNum1 + intNum2;
        } else if (opcode.equals("-")) {
            result = intNum1 - intNum2;
        } else if (opcode.equals("*")) {
            result = intNum1 * intNum2;
        } else if (opcode.equals("/")) {
            result = intNum1 / intNum2;
        } else {
            System.out.println("잘못된 연산기호 입니다.");
        }

        System.out.println("첫번째 숫자" + intNum1);
        System.out.println("두번째 숫자" + intNum2);
        System.out.println("연산결과" + result);
    }


}
