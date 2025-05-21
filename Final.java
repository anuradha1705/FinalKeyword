final class vehicle {
    final int wheels = 4;

    final void displayType(){
        System.out.println("This is a vehicle with "+wheels+" wheels.");
    }
    
}
public class Final {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.displayType();
    }
}
