import java.util.Scanner;
//**
// 최적화 문제중 최댓값 구하기 **//


public class ArayTest2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("시험에 응시한 학생 수를 입력하시오.");
        String stNum = sc.next();
        int studentNum = Integer.parseInt(stNum);

        int[] arrScore = null;
        arrScore = new int[studentNum];

        String[] arrName = null;
        arrName = new String[studentNum];

        System.out.println("1등 학생의 이름과 점수를 출력하겠습니다.");

        for(int i=0;i< arrName.length;i++){
            System.out.println("학생의 이름을 입력하십시오.");
            String name = sc.next();
            arrName[i] = name;

            System.out.println("학생의 점수를 입력하십시오.");
            String score = sc.next();
            arrScore[i] = Integer.parseInt(score);
        }

        int max = 0;

        for(int i=0;i< arrName.length;i++){
            if (arrScore[i]>max){
                arrScore[i] = max;
            }
        }

        for (int i=0;i< arrName.length;i++){
            if(arrScore[i]=max){
                System.out.println(arrName[i]);
            }
        }




//        System.out.println(arrName[max 이걸어떻게?]+" 학생의 점수는 " +max+ "이다");





//        for(int i = 0; i < 2; i++){
//            System.out.println("자연수를 입력하세요.");
//            System.out.println(sc.next());
//        }

    }
}
