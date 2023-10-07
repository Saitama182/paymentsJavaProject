package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();

        StudentOrder so = new StudentOrder();
        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        ;

        System.out.println("saveStudentOrder:");
        return answer;
    }

    public static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGiveName("Jonny");
        husband.setSurName("Depp");
        husband.setPassportSeria("182182");
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);
        return so;
    }
}
