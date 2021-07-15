import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public void regexChecker(String input){
        String regex = "^[A-Z][A-Za-z0-9\\s]*[.]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("Sentence begin with Capital Letter and ends with Period.");
        }
        else{
            System.out.println("Sentence does not begin with Capital Letter or end with Period.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence: ");
        String inputString = sc.nextLine();
        sc.close();
        Assignment9 obj = new Assignment9();
        obj.regexChecker(inputString);
    }
}