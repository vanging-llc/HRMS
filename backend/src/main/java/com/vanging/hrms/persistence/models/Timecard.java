package com.vanging.hrms.persistence.models;

import java.util.Date;

public class Timecard
{
    private String id;
    private String project_id;
    private String employee_id;
    private Date date;
    private int start_time;
    private int end_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date datetime) {
        this.date = datetime;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int from) {
        this.start_time = from;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int to) {
        this.end_time = to;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }
}
