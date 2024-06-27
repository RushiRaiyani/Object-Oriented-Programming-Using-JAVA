/* Declare a class called student having following data 
members:id_no, no_of_subjects_registered, subject_code, 
subject_credits, grade_obtained and spi. Define constructor and 
calculate_spi methods.Define main to instantiate an array for 
objects of class student to process data of n students to be given 
 */

package inheritence;

import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    int[] grade_points_obtained;
    int[] credit;
    double spi;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id_nof student:");
        id_no = sc.nextInt();
        System.out.println("Enter no of subjects_registered:");
        no_of_subjects_registered = sc.nextInt();
        subject_code = new int[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_points_obtained = new int[no_of_subjects_registered];
        credit = new int[no_of_subjects_registered];

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println("Enter subject code[" + (i + 1) + "]:");
            subject_code[i] = sc.nextInt();
            System.out.println("Enter subject credits[" + (i + 1) + "]");
            subject_credits[i] = sc.nextInt();
            System.out.println("Enter grade obtained[" + (i + 1) + "]");
            grade_points_obtained[i] = sc.nextInt();
        }
    }

    double spi() {
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < subject_code.length; i++) {
            sum = sum + grade_points_obtained[i];
        }
        for (int i = 0; i < subject_code.length; i++) {
            sum2 = sum2 + subject_credits[i];
        }
        for (int i = 0; i < subject_code.length; i++) {
            credit[i] = grade_points_obtained[i] * subject_credits[i];
            sum3 = sum3 + credit[i];
        }
        this.spi = (sum3) / sum2;
        return spi;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Students:");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("SGPA is:" + (s[i].spi()));
        }
    }
}