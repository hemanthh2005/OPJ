import java.util.*;

public class Bs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter" + n + "integers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bs(arr);
        System.out.println("sorted array");
        for(int s:arr){
            System.out.print(s+" ");
        }
        sc.close();
    }

    public static void bs(int arr[]){
        int s=arr.length;
        for(int i=0;i<s-1;i++){
            for(int j=0;j<s-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    }

