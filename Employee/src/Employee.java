public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear)
    {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax()
    {
        if(this.salary<1000)
        {
            return 0;
        }
        else
        {
            return ((this.salary)*0.03);
        }
    }

    double bonus()
    {
        if(this.workHours>40)
        {
            return (this.workHours-40)*30;
        }
        else {
            return 0;
        }
    }

    double raiseSalary()
    {
        int recentYear=2021;
        if(recentYear-this.hireYear<10)
        {
            return (this.salary*0.5);
        }
        if(recentYear-this.hireYear>9&&recentYear-this.hireYear<20)
        {
            return(this.salary*0.10);
        }
        if(recentYear-this.hireYear>19)
        {
            return(this.salary*0.15);
        }
        return 0;
    }

   void tooString()
   {
       System.out.println("Adı: "+this.name);
       System.out.println("Salary: "+this.salary);
       System.out.println("Çalışma Saati: "+this.workHours);
       System.out.println("Başlangıç Yılı: "+this.hireYear);
       System.out.println("Vergi: "+this.tax());
       System.out.println("Bonus: "+this.bonus());
       System.out.println("Maaş Artışı: "+this.raiseSalary());
       System.out.println("Vergiler ve Bonuslarla birlikte maaş: "+(this.salary+this.tax()+this.bonus()));
       System.out.println("Toplam Maaş: "+(this.salary+this.tax()+this.bonus()+this.raiseSalary()));

   }
}
