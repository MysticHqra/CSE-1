class Employee {
    private int eid;
    private String first_name;
    private String last_name;
    private double salary;

    String get(int i) {
        String result = "";
        switch (i) {
            case 0:
                result = Integer.toString(eid);
                break;
            case 1:
                result = first_name;
                break;
            case 2:
                result = last_name;
                break;
            case 3:
                result = Double.toString(salary);
                break;
        }
        return result;
    }

    void set(int eid, String first_name, String last_name, double salary) {
        this.eid = eid;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    static Employee compare(Employee o1, Employee o2) {
        if (o1.salary > o2.salary) return o1;
        else return o2;
    }

    public static void dupe(Employee[] arr) {
        int c = 0;
        String[] first_names = new String[arr.length];
        String[] last_names = new String[arr.length];
        for (Employee i : arr) {
            first_names[c] = i.first_name;
            last_names[c] = i.last_name;
            c++;
        }
        for (int i = 0; i < first_names.length; i++) {
            int copy = 0;
            for (int j = 0; j < first_names.length; j++) {
                if (first_names[j].equals(first_names[i])) copy++;
            }
            if (copy >= 2) System.out.println("Duplicate first name: " + first_names[i]);
        }
        for (int i = 0; i < last_names.length; i++) {
            int copy = 0;
            for (int j = 0; j < last_names.length; j++) {
                if (last_names[j].equals(last_names[i])) copy++;
            }
            if (copy >= 2) System.out.println("Duplicate last name: " + last_names[i]);
        }
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee o1 = new Employee();
        o1.set(101, "Hara", "K", 0.0);
        Employee o2 = new Employee();
        o2.set(102, "Srija", "K", 1.0);
        if (Employee.compare(o1, o2) == o1) System.out.println(o1.get(1) + " " + o2.get(2)
                + " has higher salary");
        else System.out.println(o2.get(1) + " " + o2.get(2)
                + " has higher salary");
        Employee[] arr = {o1, o2};
        Employee.dupe(arr);
    }
}
