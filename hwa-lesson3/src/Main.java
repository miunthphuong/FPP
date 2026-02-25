import P1ClassObjects.P1Main;
import P2TimeZones.P2Main;
import P3ImmutableRecord.P3Main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    this.p1ClassProjects();
    this.p2TimeZones();
    this.P3ImmutableRecord();
    this.P4PizzaOrderManagement();
}

// Solve the problem 1
void p1ClassProjects (){
    System.out.println("=======PROBLEM 1:=======");
    P1Main p1 = new P1Main();
    p1.display();
}

// Solve the problem 2
void p2TimeZones(){
    System.out.println("=======PROBLEM 2:=======");
    P2Main p2Main = new P2Main();
    P2Main.display();
}

// Solve the problem 3
void P3ImmutableRecord(){
    System.out.println("=======PROBLEM 3:=======");
    P3Main p3Main = new P3Main();
    p3Main.display();
}

// Solve the problem 4
void P4PizzaOrderManagement(){
    System.out.println("=======PROBLEM 4:=======");

}