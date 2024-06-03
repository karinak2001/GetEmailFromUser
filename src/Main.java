import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




    String email = getEmailAndValidate();
    String title = getTitleAndValidate();
    String body = getBodyAndValidate();
        System.out.println("your email message is: \n" + email + "\n" + title + "\n" + body + "\nSending the email message! " );
        sendEmail(email, title, body);



    }


    public static String getEmailAndValidate(){
        Scanner scanner = new Scanner(System.in);

        String email;
        boolean validEmail = false;

        do {
            System.out.println("Enter a valid email address: ");
            email = scanner.nextLine();
            if (email.length() == 0) {
                System.out.println("You must enter an email!");
            } else if (!email.contains("@")) {
                System.out.println("The email you entered is invalid!");
            } else {
                validEmail = true;
            }
        } while (!validEmail);
            return email;
        }




        public static String getTitleAndValidate(){
        Scanner scanner = new Scanner(System.in);
        String title;
        boolean validTitle = false;

        do {
            System.out.println("Enter a title for the email: ");
            title = scanner.nextLine();
            if (title.length() > 20){
                System.out.println("The maximum number of characters is 20! ");
            } else {
                validTitle = true;
            }

        } while (!validTitle);
        return title;
        }






        public static String getBodyAndValidate() {
            Scanner scanner = new Scanner(System.in);
            String body;

            do {
                System.out.println("Enter the email's body: ");
                body = scanner.nextLine();

                if (body.length() == 0) {
                    System.out.println("The email's body can't be empty! ");
                }

            } while (body.length() == 0);
            return body;
        }






        public static void sendEmail(String email, String title, String body){
            System.out.println("The email message has been sent. ");
        }


    }
