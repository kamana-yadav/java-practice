import java.util.Scanner;
public class Seach_Element {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size");
      int n=sc.nextInt();
      int arr[]= new int[n];
      System.out.println("enter the elements");
      for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
      }
      System.out.println("Enter the search element");
      int x= sc.nextInt();
      for(int i=0;i<=arr.length;i++){
         if(arr[i] == x){
            System.out.println("x found at index:"  + i);
         }
      }
   }
}
