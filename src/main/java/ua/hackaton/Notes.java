package ua.hackaton;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Notes {

    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public Notes(String studied, LocalDate deadline ) {
        this.deadline = deadline;
        this.studied = studied;
        this.details = "";
        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        beginDate = LocalDate.now();
    }

    public Notes(String studied, LocalDate deadline, String details ) {
        this.deadline = deadline;
        this.studied = studied;
        this.details = details;
        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        beginDate = LocalDate.now();
    }

    private LocalDate beginDate;

    private LocalDate deadline;

    private ArrayList<LocalDate> rememberDates = new ArrayList<>();

    private  String studied;

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public ArrayList<LocalDate> getRememberDates() {
        return rememberDates;
    }

    public void setRememberDates(ArrayList<LocalDate> rememberDates) {
        this.rememberDates = rememberDates;
    }

    public String getStudied() {
        return studied;
    }

    public void setStudied(String studied) {
        this.studied = studied;
    }
}
