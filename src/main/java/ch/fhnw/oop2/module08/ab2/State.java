package ch.fhnw.oop2.module08.ab2;

public enum State {
    ON("On"), OFF("Off");
    private String stateProperty;
    private State(String state){
        this.stateProperty = state;
    }
    @Override
    public String toString(){
        return stateProperty;
    }

}
