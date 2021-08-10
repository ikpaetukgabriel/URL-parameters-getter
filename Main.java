import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        boolean hasPassword = false;
        String password = "";

        String[] keysAndValues = url.split("\\?")[1].split("&");

        for (String keysAndValue : keysAndValues) {
            String[] tempArray = keysAndValue.split("=");
            if (tempArray[0].equals("pass") && tempArray.length > 1) {
                hasPassword = true;
                password = "password : " + tempArray[1];
            }

            if (tempArray.length < 2) {
                System.out.println(tempArray[0] + " : " + "not found");
            } else {
                System.out.println(tempArray[0] + " : " + tempArray[1]);
            }
        }
        if (hasPassword) {
            System.out.println(password);
        }
    }

}
