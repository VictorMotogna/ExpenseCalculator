package com.example.victo.expensecalculator;

import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.victo.models.Expense;
import com.example.victo.repository.Repository;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Repository repository;

    EditText editExpense = (EditText) findViewById(R.id.editExpense);
    EditText editType = (EditText) findViewById(R.id.editType);
    EditText editDescription = (EditText) findViewById(R.id.editDescription);

    ListView listView = (ListView) findViewById(R.id.list_view);

    Button add = (Button) findViewById(R.id.button);
    Button update = (Button) findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date date = new Date();

        final int month = date.getMonth();

        ArrayList<Expense> expenses = repository.getAll();

        final ArrayAdapter<Expense> arrayAdapter = new ArrayAdapter<Expense>(
                this,
                android.R.layout.simple_list_item_1,
                expenses);

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                listView.setAdapter(arrayAdapter);

                int lei = Integer.valueOf(editExpense.getText().toString());
                String type = editType.getText().toString();
                String description = editDescription.getText().toString();

                Expense expense = new Expense(lei, month, type, description);

                repository.addExpense(expense);
            }
        });


    }
}
