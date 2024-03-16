package Employees;

public class EmployeеMain {
    public static void main(String[] args) {
        Waiter waiterEmily = new Waiter("Emily Carter", "Waiter", 1100);
        Waiter waiterMichael = new Waiter("Michael Smith", "Waiter", 1400);
        Waiter waiterDimitur = new Waiter("Димитър Георгиев", "Waiter", 1400);
        Bartender bartenderJames = new Bartender("James Williams", "Bartender", 1600);
        Bartender bartenderVictoriya = new Bartender("Виктория Симеонова", "Bartender", 1600);
        Cook cookOlivia = new Cook("Olivia Brown", "Cook", 1800);
        Cook cookEthan = new Cook("Ethan Davis", "Cook", 1800);
        Cleaner cleanerCharlotte = new Cleaner("Charlotte Wilson", "Cleaner", 1000);
        Cleaner cleanerIsabella = new Cleaner("Isabella Thompson", "Cleaner", 1000);
        System.out.println(waiterDimitur);

    }
}
