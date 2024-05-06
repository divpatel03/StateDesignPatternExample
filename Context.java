public class Context {
    //Stores a State object (Either a StateA object or StateB object)
    private State state;

    //Method takes in the state and sets it to the class state object
    public void setState(State state) {
        this.state = state;
    }

    //When requesting, it will invoke the handleRequest method for either A or B, depends on which the user has set
    public void request() {
        state.handleRequest();
    }
}