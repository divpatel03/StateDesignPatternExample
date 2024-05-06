public class StateA implements State {
    //Handles incoming handleRequest invoke from context.java
    public void handleRequest() {
        System.out.println("Handling request in State A");
    }
}