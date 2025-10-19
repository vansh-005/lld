package main.Models;
import main.enums.GateType;

public abstract class Gate {
    private int id;
    private GateType type;
    protected Gate(int id, GateType type) {
        this.id = id;
        this.type = type;
    }
    public GateType getType() {
        return type;
    }
    public int getId(){
        return id;
    }
}

