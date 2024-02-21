package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);


        System.out.println("ID를 입력하세요");
        System.out.println("비밀번호를 입력하세요");
        System.out.println("비밀번호를 확인하세요");
        System.out.println("이름을 입력하세요");
        System.out.println("주민번호를 입력하세요");
        System.out.println("전화번호를 입력하세요");
        System.out.println("주소를 입력하세요");
        System.out.println("직업을 입력하세요");
        MemberMain user = new MemberMain(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());

        System.out.println(user.toString());
        
    }
}