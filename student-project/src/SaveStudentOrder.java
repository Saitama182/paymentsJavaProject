public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName ="Алексей";
        so.hLastName ="Петров";
        so.wFirstName ="Яна";
        so.wLastName ="Петрова";

        StudentOrder so1 = new StudentOrder();
        so1.hFirstName ="Алексей";
        so1.hLastName ="Иванов";
        so1.wFirstName ="Яна";
        so1.wLastName ="Иванова";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer;
        answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.hLastName);
        return answer;
    }

}
