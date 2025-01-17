import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input a string
        String str = sc.next();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if(ch >= 65 && ch <= 90){
                char temp = (char) (str.charAt(i) + 32);
                ans.append(temp);
            }
            else{
                ans.append((char)(str.charAt(i) - 32));
            }
        }
        System.out.println(ans);
    }
}
