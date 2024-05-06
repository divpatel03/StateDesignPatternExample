public class Main {
    public static void main(String[] args) {
        //Creating a context class instance
        Context context = new Context();
 
        // Setthe initial state to StateA
        context.setState(new StateA());

        // Make requests
        context.request(); // Output: Handling request in State A

        // Change the state to StateB
        context.setState(new StateB());

        // Make requests
        context.request(); // Output: Handling request in State B
    }
}