package practice;

public class LargestNumberInArray {
    public static void main(String[] args) {

        int[] arr={28,3,15,9,17,4,23,2};
        int max=0,min=0;

        for (int i =0; i<=arr.length-1;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
