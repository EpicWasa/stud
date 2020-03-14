package ua.hackaton;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Named
@ManagedBean(name = "listBean", eager = true)
@RequestScoped
public class ListBean {

    private static PlanList list = new PlanList();

    public PlanList getList() {
        return list;
    }

    public void setList(PlanList list) {
        this.list = list;
    }


    public void AddNote() throws Exception {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        list.getNodes().add(new Notes(studied, LocalDate.parse(deadline, formatter), details));

        studied = "";
        details = "";
        deadline = "";
    }

    private String studied ="";

    private String details ="";

    private String deadline ="";

    public String getStudied() {
        return studied;
    }

    public void setStudied(String studied) {
        this.studied = studied;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
