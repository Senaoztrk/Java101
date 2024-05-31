//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Teacher t1= new Teacher("Mahmut Hoca","+90500000000","TRH");
        Teacher t2=new Teacher("Graham Bell","+90539999999","FZK");
        Teacher t3 = new Teacher("Külyutmaz","+90500000145","BIO");

        //t1.print();

        Course tarih= new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyoloji=new Course("Biyoloji","101","BIO");
        biyoloji.addTeacher(t3);


        Student s1=new Student("İnek Şaban","123","4",tarih,fizik,biyoloji);
        s1.AddBulkExamNote(100,78,50,60,40,30);
        s1.isPass();




    }
}