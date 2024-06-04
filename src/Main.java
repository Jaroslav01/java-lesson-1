import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var subjects = new ArrayList<Subject>();
        var students = new ArrayList<Student>();
        
        System.out.println("Введите количество предметов:");
        var subjectCount = scanner.nextInt();
        scanner.nextLine();
        
        for (var i = 0; i < subjectCount; i++) {
            System.out.println("Введите название предмета:");
            var subjectName = scanner.nextLine();
            subjects.add(new Subject(subjectName));
        }

        System.out.println("Введите количество студентов:");
        var studentCount = scanner.nextInt();
        scanner.nextLine();
        
        for (var i = 0; i < studentCount; i++) {
            System.out.println("Введите имя студента:");
            var studentName = scanner.nextLine();
            
            var student = new Student(studentName);
            
            for (var subject : subjects) {
                System.out.println("Введите оценку для " + subject.getName() + ":");
                var grade = scanner.nextInt();
                scanner.nextLine();
                student.addGrade(subject, grade);
            }
            students.add(student);            
        }
        
        for (var student : students) {
            System.out.println("Студент: " + student.getFullName() + " - " + student.getAverageGrade());
        }
    }
}