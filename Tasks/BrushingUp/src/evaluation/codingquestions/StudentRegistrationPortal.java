package evaluation.codingquestions;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class RegistrationPortal {
    private static RegistrationPortal instance = null;
    private List<Student> registeredStudents;

    private RegistrationPortal() {
        registeredStudents = new ArrayList<>();
    }

    public static synchronized RegistrationPortal getRegistrationPortal() {
        if (instance == null) {
            instance = new RegistrationPortal();
        }
        return instance;
    }

    public synchronized void register(Student student) {
        registeredStudents.add(student);
    }

    public synchronized List<Student> getRegisteredStudents() {
        return new ArrayList<>(registeredStudents);
    }
}

public class StudentRegistrationPortal {
    public static void main(String[] args) {
        RegistrationPortal portal = RegistrationPortal.getRegistrationPortal();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 104; j++) {
                    Student student = new Student("Student " + Thread.currentThread().getId() + "-" + j);
                    portal.register(student);
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Student> registeredStudents = portal.getRegisteredStudents();
        for (Student student : registeredStudents) {
            System.out.println("Registered Student: " + student.getName());
        }
    }
}
