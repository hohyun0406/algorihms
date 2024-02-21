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
        
        sc = new Scanner(System.in);
        System.out.println("ID를 입력하세요");
        String id = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String pw = sc.next();
        System.out.println("비밀번호를 확인하세요");
        String pw_check = sc.next();
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("주민번호를 입력하세요");
        String jm_number = sc.next();
        System.out.println("전화번호를 입력하세요");
        String call_number = sc.next();
        System.out.println("주소를 입력하세요");
        String address = sc.next();
        System.out.println("직업을 입력하세요");
        String job = sc.next();
        System.out.println("ID : " +id);
        System.out.println("비번 : " +pw);
        System.out.println("비번확인 : " +pw_check);
        System.out.println("이름 : " +name); 
        System.out.println("주민번호 : " +jm_number);
        System.out.println("전화번호 : " +call_number);
        System.out.println("주소 : " +address);
        System.out.println("직업 : " +job);

    }
}