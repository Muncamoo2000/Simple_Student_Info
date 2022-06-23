import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    int StudentAge = 15;
    double StudentGPA = 3.45;
    char First = 'K', Last = 'H';
    boolean perfectAttendance = true;

    String studentFirstName = "Carl", studentLastName = "Smith";
    char studentFirstInitial = studentFirstName.charAt(0), studentLastInitial = 'H';


    System.out.println(StudentAge + "\n" + StudentGPA + "\n" + First + "\n" + Last + "\n" + perfectAttendance + "\n" +  studentFirstInitial + "\n" + studentLastInitial);
    System.out.println("What do you want to update your GPA to?");
    Scanner input = new Scanner(System.in);
    StudentGPA = input.nextDouble();

    System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + StudentGPA);
    }
}
