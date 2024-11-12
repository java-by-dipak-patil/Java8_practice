import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo
{
    public static void main(String[] args) {
        Supplier<Date> s=()->new Date();
        System.out.println(s.get());

        Supplier<String> s1=()->{
            String [] arr={"Sunny","bunny","funny","minny"};
        int x= (int) Math.random() * 4;
            return arr[x];
        };

       // System.out.println(s1.get());


        // get random otp
        System.out.println("Supplier for otp");
        Supplier<String> s3=()->{
            String otp="";

            for (int i = 0; i < 6; i++) {
                otp=otp+(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s3.get());


        //Password condition 1.length should be 8 2. 2 4 6 8 places only digit ,3 -- 1 3 5 7 places add randam character
        System.out.println("Generate password::::");
        Supplier<String> supplier=()->
        {
            String pwd="";
            Supplier<Integer> dd=()->(int)( Math.random() * 10);

            String Symbol= "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$&";

            Supplier<Character> c=()->Symbol.charAt((int)( Math.random() * 29));

            for (int i = 0; i <9 ; i++) {

                if (i%2==0)
                {
                    pwd=pwd+dd.get();
                }
                else {
                    pwd=pwd+c.get();
                }

            }

            return pwd;
        };

        System.out.println(supplier.get());

    }
}
