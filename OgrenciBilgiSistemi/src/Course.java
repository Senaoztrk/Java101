public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sNote;

    Course(String name,String code,String prefix)
    {
        this.name=name;
        this.code=code;
        this.prefix=prefix;

        double note=0.0;
        double sNote=0.0;

    }

    void printTeacherInfo()
    {
        this.teacher.print();
    }

    void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }
        else {
            System.out.print("Ders-Öğretmen uyuşmuyor!");
        }


    }

}
