package ua.hackaton;

import java.util.ArrayList;
import java.util.List;


public class PlanList {

    public List<Notes> getNodes() {
        return nodes;
    }

    public void setNodes(List<Notes> nodes) {
        this.nodes = nodes;
    }

    private List<Notes> nodes = new ArrayList<>();
}
