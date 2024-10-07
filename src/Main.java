import java.util.Scanner;
class SeasonExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please,type the month's name");
        String month = sc.next();
        if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("It is Summer season");
        }
        else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            System.out.println("It is Autumn season");
        }
        else if (month.equals("January") || month.equals("February") || month.equals("December")) {
            System.out.println("It is Winer");
        }
        else {
            System.out.println("It is Spring");
        }
        sc.close();
    }
}