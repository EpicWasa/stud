package ua.hackaton;

import java.util.ArrayList;
import java.util.List;


public class PlanList {

    public ArrayList<Notes> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Notes> nodes) {
        this.nodes = nodes;
    }

    private ArrayList<Notes> nodes = new ArrayList<>();
}
