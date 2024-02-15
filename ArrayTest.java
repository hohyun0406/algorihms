import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("arr의 길이. "+arr.length);

        for(int i=1;i<arr.length;i=i+2){

        System.out.println(arr[i]);
        }




    }
}