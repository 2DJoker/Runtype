import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;


public class Main {
    //1
    public static int Max(int a, int b){
        if (a == b) {
            throw new IllegalArgumentException("Error");
        }
        return Math.max(a, b);
    }

    //2
    public static int Div ( int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Делитель не может быть равен нулю");
        }
        return a / b;
    }

    //3
    public void StrtoInt (String a) throws NumberFormatException {
        int a2 = Integer.parseInt(a.trim());
        System.out.println(a2);
    }

    //4
    public static void AgeCheck ( int age){
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("nonono");
        }
    }

    //5
    public static double Sqrt ( double a){
        if (a < 0)
            throw new IllegalArgumentException("less then 0");
        return Sqrt(a);
    }

    //6
    public static int Fact ( int a){
        if (a < 0)
            throw new IllegalArgumentException("less then 0");
        int res = 1;
        for (int i = 1; i < a; i++) {
            res *= a;
        }
        return res;
    }

    //7
    public static void Zer ( int[] a){
        for (int num : a) {
            if (num == 0)
                throw new RuntimeException();
        }
    }

    //8
    public static double Pow ( int a, int b){
        if (b < 0)
            throw new RuntimeException();
        return Math.pow(a, b);
    }

    //9
    public static String Cut (String a,int b){
        if (b > a.length())
            throw new RuntimeException();
        return a.substring(b);
    }

    //10
    public static void Find ( int[] a, int b){
        for (int num : a) {
            if (num == b) {
                System.out.println("Element is found!");
                break;
            }
        }
        throw new RuntimeException();
    }

    //11
    public static String toBin ( int a){
        if (a < 0)
            throw new RuntimeException();
        return Integer.toBinaryString(a);
    }

    //12
    public static int Div2 ( int a, int b){
        if (b == 0)
            throw new ArithmeticException("error");
        return a / b;
    }

    //13
    public static String ReturnElem (List < String > a,int b){
        if (b > a.size())
            throw new IndexOutOfBoundsException();
        return a.get(b);
    }

    //14
    public static void PasCheck (String password){
        if (password.length() < 8)
            throw new WeakPasswordException();
    }

    public static class WeakPasswordException extends RuntimeException {
    }

    //15
    public static void DateCheck (String a){
        DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(a);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //16
    public static String Concat (String a, String b){
        if (a == null || b == null)
            throw new NullPointerException();
        return a.concat(b);
    }

    //17
    public static int Left ( int a, int b){
        if (b == 0)
            throw new RuntimeException();
        return a % b;
    }

    //18
    public static double Sqrt2 ( double a){
        if (a < 0)
            throw new RuntimeException();
        return Math.sqrt(a);
    }

    //19
    public static int Fareng ( int a){
        if (a < 273)
            throw new RuntimeException();
        return a * 9 / 5 + 32;
    }

    //20
    public static void NullCheck (String a){
        if (a == null || a.isEmpty())
            throw new RuntimeException();
    }
}