

import java.util.Scanner;

public class A {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxIndex = 0;
        int minIndex = 0;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++ )
        {
            arr[i] = in.nextInt();
            if(arr[i] > arr[maxIndex])
            {
                maxIndex = i;
            }
            if(arr[i] <= arr[minIndex])
            {
                minIndex = i;
            }
        }
        if(maxIndex > minIndex)
        {
            System.out.println(maxIndex + n - minIndex - 2);
        }
        else
        {
            System.out.println(maxIndex + n - minIndex - 1);
        }
    }
}