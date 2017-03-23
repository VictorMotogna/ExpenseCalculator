package com.example.victo.repository;

import com.example.victo.models.Expense;

import java.util.ArrayList;

/**
 * Created by victo on 3/23/2017.
 */

public class Repository {
    //region Fields
    private ArrayList<Expense> expenses;
    //endregion

    //region Constructor
    public Repository(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }
    //endregion

    //region Methods
    public ArrayList<Expense> getAll() {
        return this.expenses;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public Expense getLastExpense() {
        return expenses.remove(expenses.size());
    }

    public void deleteAll() {
        expenses.clear();
    }
    //endregion
}
