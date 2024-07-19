package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxBase = 0.0;
    int bonus = 0 ;
    double raise = 0.0;
    double total = 0.0;


    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Çalıştırma Butonu
    void run (){
        tax();
        bobus();
        raiseSalary();
        total = this.salary - this.taxBase + this.bonus + this.raise;
        printNot();
    }
// Zam Hesaplama.
     double tax(){
         if (this.salary >= 10000){
             this.taxBase = (this.salary * 0.03) ;
        }
      return this.taxBase;
    }

// Mesai Ücretini Hesaplar.
    int bobus(){
        if(this.workHours - 40 > 0){
            this.bonus = (this.workHours - 40) * 30;
        }
        return this.bonus ;
    }
    // Zam Miktarını Hesaplar, Çalıştığı yıl sayısına göre.
   double raiseSalary(){
        if (this.hireYear < 10){
            this.raise = salary * 0.05;
        } else if ((this.hireYear > 9) && (this.hireYear < 20)) {
            this.raise = salary * 0.10;

        } else if (this.hireYear > 19){
            this.raise = salary * 0.15;
        }
       return 0.0;
    }


    public void printNot () {
        System.out.println(";=======================");
        System.out.println("Adı: " + this.name);
        System.out.println("Bürüt: "+ this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Vergi: " + this.taxBase);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Zam Miktarı: " + this.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary + this.bonus - this.taxBase));
        System.out.println("Toplam maaş: "+ this.total);

    }




}
