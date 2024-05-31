public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    double average;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3)
    {
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        double average=0.0;
        boolean isPass=false;
    }

    void AddBulkExamNote(int note1,int note2,int note3,int sNote1,int sNote2,int sNote3)
    {
        if (note1 >= 0 && note1 <= 100)
            this.c1.note = note1;

        if (note2 >= 0 && note2 <= 100)
            this.c2.note = note2;

        if (note3 >= 0 && note3 <= 100)
            this.c3.note = note3;

        if (sNote1 >= 0 && sNote1 <= 100)
            this.c1.sNote =sNote1;

        if (sNote2 >= 0 && sNote2 <= 100)
            this.c2.sNote = sNote2;

        if (sNote3 >= 0 && sNote3 <= 100)
            this.c3.sNote = sNote3;
    }

    void isPass()
    {
        double c1=(this.c1.note*0.80)+(this.c1.sNote*0.20);
        double c2=(this.c2.note*0.80)+(this.c2.sNote*0.20);
        double c3=(this.c3.note*0.80)+(this.c3.sNote*0.20);

        this.average=(c1+c2+c3)/3.0;
        if(this.average>55)
        {
            System.out.println("Sınıfı Geçtiniz.");
            this.isPass=true;
        }
        else {
            System.out.println("Sınıfta Kaldınız.");
            this.isPass=false;
        }
        printNote();
    }

    void printNote()
    {
        System.out.println(c1.name+" Sınav Notu: "+c1.note+" Sözlü Notu: "+c1.sNote);
        System.out.println(c2.name+" Sınav Notu: "+c2.note+" Sözlü Notu: "+c2.sNote);
        System.out.println(c3.name+" Sınav Notu: "+c3.note+" Sözlü Notu: "+c3.sNote);
        System.out.println("Ortalamanız: "+this.average);

    }

}

