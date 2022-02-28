package com.company;

public enum Weekday {
    MONDAY("Дуйшомбу: Technical java lesson "),
    TUESDAY("Шейшемби: Practice and Soft Skill"),
    WEDNESDAY("Шаршеми: Technical java lesson"),
    THURSDAY("Бейшемби: Practice and English"),
    FRIDAY("Жума: Technical java lesson"),
    SATURDAY("Ишемби: Practice  and consolidation"),
    SUNDAY("Жекшемби: Weekend");

    private String method;

    Weekday(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return  method;
    }


}
