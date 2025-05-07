package java_classobjectprograms_te;

public class Counter9 {

static int count=0;

void increment() {
    count = count + 1;
    System.out.println("Count after increment: " + count);
}


void displayCount() {
    System.out.println("Current count is: " + count);
}

public static void main(String[] args) {
    Counter9 c1 = new Counter9();
    Counter9 c2 = new Counter9();
    Counter9 c3 = new Counter9();

    c1.increment();  
    c2.increment();  
    c3.increment();  


    c1.displayCount();  
    c2.displayCount();
    c3.displayCount();

}
}
