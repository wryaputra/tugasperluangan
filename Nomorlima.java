public class Nomorlima {
public static void main(String[] args)  {
    int n1 =0, n2=1, n3;
    int count = 16;
    int i = 2;
    System.out.println(n1+ "" + n2);

    while (i < count) {
        n3 = n1+n2;
        System.out.println( ""+n3);
        n1 = n2;
        n2 = n3;
        i++;
        }
    }
}
