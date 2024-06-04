import java.util.HashMap;
import java.util.Map;

public class Student {
    private String fullName;
    private Map<Subject, Integer> grades;

    public Student(String fullName) {
        this.fullName = fullName;
        this.grades = new HashMap<>();
    }

    public String getFullName() {
        return this.fullName;
    }

    public void addGrade(Subject subject, int grade) {
        this.grades.put(subject, grade);
    }

    public Map<Subject, Integer> getGrades() {
        return this.grades;
    }
    
    public double getAverageGrade() {
        if (this.grades.isEmpty()) {
            return 0.0;
        }
        
        double total = 0;
        for(var grade : this.grades.values()) {
            total += grade;
        }
        
        return total / this.grades.size();
    }
}