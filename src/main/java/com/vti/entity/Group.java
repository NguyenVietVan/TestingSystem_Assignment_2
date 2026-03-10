package com.vti.entity;
import java.time.LocalDate;

public class Group {
    public int groupId;
    public String groupName;
    public Account creator;
    public Account[] accounts;
    public LocalDate createDate;

}
