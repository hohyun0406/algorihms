package mathTest;

import java.util.Scanner;

public class MethodTest {
    static String inputName(Scanner sc){

        System.out.println("학생 이름 : ");
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = inputName(sc);
        System.out.println("이름 " +name);
    }
}