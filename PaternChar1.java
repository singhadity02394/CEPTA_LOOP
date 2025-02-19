package cetpa.patern;

public class PaternChar1 {
  public static void main(String[] args){


    int n = 70;
    for(int i=65;i<=n;i++){
    for(int j=65;j<=i;j++){
     System.out.print("  "+(char)j);
    }
System.out.println();
}
}
}