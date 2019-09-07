import java.util.Scanner;
public class password {

public static void main(String[] args) {
    int digit=0;
    int special=0;
    int upCount=0;
    int loCount=0;
    String password;
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter Your Password:");
        password = scan.nextLine();
    if(password.length()>=8){
        for(int i =0;i<password.length();i++){
            char c = password.charAt(i);
            if(Character.isUpperCase(c)){
                upCount++;
            }
            if(Character.isLowerCase(c)){
                loCount++;
            }
            if(Character.isDigit(c)){
                digit++;
            }
            if(c>=33&&c<=46||c==64){
                special++;
            }
        }
        if(special>=1&&loCount>=1&&upCount>=1&&digit>=1){
            System.out.println(" Password Accepted:");
        }

    }
    else{
        System.out.println(" Please enter a stronger Password");
    }
}
}
