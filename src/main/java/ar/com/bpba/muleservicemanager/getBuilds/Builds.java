package ar.com.bpba.muleservicemanager.getBuilds;

import java.util.ArrayList;

public class Builds{
    public int count;
    public ArrayList<Value> value;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<Value> getValue() {
        return value;
    }

    public void setValue(ArrayList<Value> value) {
        this.value = value;
    }
}