/**
 * Created by Dariya on 18.10.2015.
 * есть массив byte[4] (или 4 числа по байту), необходимо получить int
 */
public class Main {
    public static void main(String[] args) {
        byte b[] = new byte[4];
        b[3] = 0;
        b[2] = 0;
        b[1] = 1;
        b[0] = 44;
        int number=((b[3]<<24)+(b[2]<<16)+(b[1]<<8)+b[0]);
        System.out.println("The number is "+number);
    }
}
