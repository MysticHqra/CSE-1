import java.util.Scanner;
/*
* Made with <3 by MysticHqra
* Course registration project v1.1
 */
class Student {
    int id;
    String name;
    String[] course_id;
    String[] course_name;
    int[] course_credits;

    Student() {
    }

    Student(Course course) {
        System.out.println("[!] Inputting for "+getClass()+" [!]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        int counter = 0;
        int n;
        System.out.print("Input number of courses you want to register: ");
        do {
            if (counter > 0) System.out.println("Minimum 2 courses required, input again!");
            counter++;
            n = sc.nextInt();
        }
        while (n < 2);
        course_id = new String[n];
        course_name = new String[n];
        course_credits = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Input course id: ");
            boolean flag = false;
            do {
                String course_id = sc2.nextLine();
                for (int j = 0; j < Course.courses.length; j++) {
                    if (course_id.equalsIgnoreCase(Course.courses[j])) {
                        flag = true;
                        this.course_id[i] = Course.courses[j];
                        course_name[i] = Course.courses_names[j];
                        course_credits[i] = Course.credits[j];
                        System.out.println("Course name: " + Course.courses_names[j] + ", Credits: " + Course.credits[j]);
                        System.out.println("COURSE SUCCESSFULLY REGISTERED!");
                        break;
                    }
                }
                if (!flag) System.out.println("Course not found, enter again!");
            }
            while (!flag);

        }
    }

    void Display() {
        for (int i = 0; i < course_id.length; i++) {
            System.out.println(id + "\t\t\t\t" + name + "\t\t\t\t" + course_id[i] + "\t\t\t\t" + course_name[i] + "\t\t\t\t\t" + course_credits[i]);
        }
    }
}

class Undergraduate extends Student {

    public Undergraduate(Course course) {
        super(course);
    }
}

class Fresher extends Undergraduate {

    Fresher(Course course) {
        super(course);
    }
}

class Sophomore extends Undergraduate {
    Sophomore(Course course) {
        super(course);
    }

}

class Junior extends Undergraduate {
    Junior(Course course) {
        super(course);
    }

}

class Senior extends Undergraduate {
    Senior(Course course) {
        super(course);
    }

}

class Graduate extends Student {
    Graduate() {

    }

    public Graduate(Course course) {
        super(course);
    }
}

class Master extends Graduate {

    public Master(Course course) {
        super(course);
    }
}

class Doctoral extends Graduate {

    Doctoral(Course course) {
        super(course);
    }

}

public class TestStudent {
    public static void main(String[] args) {
        Course course = new Course();

        Fresher o1 = new Fresher(course);
        Sophomore o2 = new Sophomore(course);
        Junior o3 = new Junior(course);
        Senior o4 = new Senior(course);
        Master o5 = new Master(course);
        Doctoral o6 = new Doctoral(course);
        System.out.println("Student Id:\t\tStudent Name:\t\tCourse Id:\t\tCourse Name:\t\tCourse Credits: ");
        o1.Display();
        o2.Display();
        o3.Display();
        o4.Display();
        o5.Display();
        o6.Display();

    }

}

class Course {
    static int[] credits = {4, 3, 4, 4, 4, 4, 4, 4, 4, 3};
    static String[] courses = {"MAT1001", "ENG1001", "PHY1008", "CHEM1002",
            "CSE1012", "ECE1001", "CSE2005", "ECE2001", "MAT1002", "ENG2001"};
    static String[] courses_names = {"Calculus", "English Effective", "Physics", "Chemistry",
            "Python", "FEEE", "OOPS Java", "DLD", "Diff Eqns", "Eng for Professional Comm"};


}