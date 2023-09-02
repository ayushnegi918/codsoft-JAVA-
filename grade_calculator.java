import java.util.*;

class grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter marks obtained by Student(OUT OF 100) ");
        System.out.print("Subject1 : ");
        int m1 = sc.nextInt();
        System.out.print("Subject2 : ");
        int m2 = sc.nextInt();
        System.out.print("Subject3 : ");
        int m3 = sc.nextInt();
        System.out.print("Subject4 : ");
        int m4 = sc.nextInt();
        System.out.print("Subject5 : ");
        int m5 = sc.nextInt();
        if (m1 > 100 || m2 > 100 || m3 > 100 || m4 > 100 || m5 > 100) {
            System.out.println("\n\nError");
        } else {
            int sum = m1 + m2 + m3 + m4 + m5;
            System.out.println("\nTOTAL MARKS : " + sum);
            float p = sum / 5;
            System.out.println("AVERAGE PERCENTAGE : " + p);
            if (p >= 90) {
                System.out.println("GRADE : A+\n\n");
            } else if (p >= 80) {
                System.out.println("GRADE : A\n\n");
            } else if (p >= 70) {
                System.out.println("GRADE : B\n\n");
            } else if (p >= 60) {
                System.out.println("GRADE : C\n\n");
            } else if (p >= 50) {
                System.out.println("GRADE : D\n\n");
            } else if (p >= 33) {
                System.out.println("GRADE : E\n\n");
            } else {
                System.out.println("GRADE : F\n\n");
            }
        }
        sc.close();
    }
}