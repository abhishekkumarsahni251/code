 import java.util.Scanner;
 public class areaofcircle { 
    public static void main(String[] args) {
     // area of circle = pi*r*r
     Scanner sc = new Scanner(System.in); //intput lene ke liye
     System.out.print("Enter radius: ");
     int r = sc.nextInt();
     int a= (int)(3.141592 *r*r);
     System.out.print("Area is: ");
     System.out.println(a);    
    }
   
}
