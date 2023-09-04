import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HRRegex {
    public static void main(String[] args) {


        //kontrol etme
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0 && in.hasNextLine()){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException ex)
            {
                System.out.println("Invalid");
            }
        }




    }
}

//Username validator
/*class UsernameValidator {

     * Write regular expression here.

    //ilk karakter harf - sonrası harf rakam ve _ - 8-30 karakter olabilir
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}";
}
class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}*/











//IP kontrol
/*class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    String number = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])"; //0 ile 255 arası sayılar
    String pattern = number + "." + number + "." + number + "." + number;
}*/









//Aynı kelimeleri bulma
/*
class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";  //aynı kelime
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); //case insensitive yapma

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));  //ilk bulduğu kelime ile hepsini replace
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}*/












//html kodu bulma
/*
class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            Pattern pat = Pattern.compile("<(.+)>([^<]+)</\\1>");  //<> arasını bul - bir sonraki <'a kadar geç
            Matcher matcher = pat.matcher(line);                   //</> birinci ile aynı sadece / olanı bul
            boolean match = false;

            while(matcher.find()){
                match = true;
                System.out.println(matcher.group(2));
            }
            if (!match){
                System.out.println("None");
            }


            testCases--;
        }
    }
}

 */





