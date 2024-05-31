public class Teacher {
    String name;
    String mgno;
    String branch;

    Teacher(String name,String mgno,String branch)
    {
        this.name=name;
        this.mgno=mgno;
        this.branch=branch;
    }

    void print()
    {
        System.out.println("Adı: "+this.name);
        System.out.println("Telefon numarası: "+this.mgno);
        System.out.println("Branşı: "+this.branch);
    }
}
