package com.example.victo.models;

/**
 * Created by victo on 3/23/2017.
 */

public class Expense {
    //region Fields
    private int lei;
    private int month;
    private String type;
    private String description;
    //endregion

    //region Constructor
    public Expense(int lei, int month, String type, String description) {
        this.lei = lei;
        this.month = month;
        this.type = type;
        this.description = description;
    }

    public Expense(int lei, int month, String type) {
        this.lei = lei;
        this.month = month;
        this.type = type;
    }
    //endregion

    //region Methods

    public int getLei() {
        return lei;
    }

    public void setLei(int lei) {
        this.lei = lei;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "lei=" + lei +
                ", month=" + month +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    //endregion
}
