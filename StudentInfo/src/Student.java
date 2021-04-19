import sun.rmi.server.InactiveGroupException;

import java.util.Scanner;

public class Student {

    private String studentName;
    private String Birthday;
    private float gpa;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public boolean isBirthday(String birthday){
        String[] D = birthday.split("/");

        if(D.length == 3){
            int dd = Integer.parseInt(D[0]);
            int mm = Integer.parseInt(D[1]);
            int yyyy = Integer.parseInt(D[2]);





            
        }

    }















    public static void main(String[] args)
            throws IllegalBirthDayException, IllegalGPAexception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter your birthday: ");

    }




}
