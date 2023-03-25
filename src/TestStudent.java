import java.util.Scanner;
//Made by MysticHqra
class Student {
    int id;
    String name;

    Student() {
    }

    Student(Course course) {
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
        course.course_id = new String[n];
        course.course_name = new String[n];
        course.course_credits = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner sc2 = new Scanner(System.in);
            int ind = 0;
            System.out.print("Input course id: ");
            boolean flag = false;
            do {
                String course_id = sc2.nextLine();
                for (int j = 0; j < Course.courses.length; j++) {
                    if (course_id.equalsIgnoreCase(Course.courses[j])) {
                        flag = true;
                        ind = j;
                        course.course_id[i] = Course.courses[j];
                        course.course_name[i] = Course.courses_names[j];
                        course.course_credits[i] = Course.credits[j];
                        System.out.println("Course name: " + Course.courses_names[j]+", Credits: "+Course.credits[j]);
                        System.out.println("COURSE SUCCESSFULLY REGISTERED!");
                    }
                }
                if (!flag) System.out.println("Course not found, enter again!");
            }
            while (!flag);

            course.course_id[i] = Course.courses[ind];
            course.course_name[i] = Course.courses_names[ind];

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
        /*Sophomore o2 = new Sophomore(course);
        Junior o3 = new Junior(course);
        Senior o4 = new Senior(course);
        Master o5 = new Master(course);
        Doctoral o6 = new Doctoral(course);*/

        System.out.println("Student Id:\t\tStudent Name:\t\tCourse Id:\t\tCourse Name:\t\tCourse Credits: ");
        for(int i=0; i<course.course_id.length; i++) {
            System.out.println(o1.id+"\t\t\t\t"+o1.name+"\t\t\t\t"+course.course_id[i]+"\t\t\t\t"+course.course_name[i]+"\t\t\t\t\t"+course.course_credits[i]);
        }
    }

}

class Course {
    String[] course_id;
    String[] course_name;
    int[] course_credits;
    static int[] credits = {4, 3, 4, 4, 4, 4, 4, 4, 4, 3};
    static String[] courses = {"MAT1001", "ENG1001", "PHY1008", "CHEM1002",
            "CSE1012", "ECE1001", "CSE2005", "ECE2001", "MAT1002", "ENG2001"};
    static String[] courses_names = {"Calculus", "English Effective", "Physics", "Chemistry",
            "Python", "FEEE", "OOPS Java", "DLD", "Diff Eqns", "Eng for Professional Comm"};


}