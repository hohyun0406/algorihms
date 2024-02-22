package matrixTest;


import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            int randomNum = (int) (Math.random() * 45 + 1);
            lotto[i] = randomNum;
            for (int j = 0; j < i; j++) {//방금 뽑은 번호를 뽑은 자리의 번호랑만 비교해줘
                if (lotto[i] == lotto[j]) {
                    i--;
                    break; //만약에 똑같으면 처음으로 돌아가서 같은 자리 다른 번호 뽑는거 해줘(i--)
                }
            }
        }

            int temp = 0; //임시값

            for(int i = 0; i < lotto.length - 1; i++) { //첫 자리 빼고 큰 값 5개(6-1) 뽑아줘
                for(int j= 1 ; j < lotto.length-i; j++) { //2개씩 비교하면서 앞 배열이 더 크면 뒤로 밀어줘
                    if(lotto[j]<lotto[j-1]) {
                        temp = lotto[j-1];
                        lotto[j-1] = lotto[j];
                        lotto[j] = temp;
                    }
                }
            }

        for (int a = 0; a < 6; a++) {
            System.out.println(lotto[a]);
        }
    }


}
