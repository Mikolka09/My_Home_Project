package com.example.myhomeproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity_DZ_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("My Chess Board");
        textView.setTextSize(30);
        textView.setId(View.generateViewId());

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);

        TableLayout tableLayout = new TableLayout(this);
        ConstraintLayout.LayoutParams layoutParamsTable = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsTable.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParamsTable.topToBottom = textView.getId();
        layoutParamsTable.width = ConstraintLayout.LayoutParams.MATCH_PARENT;
        layoutParamsTable.height = ConstraintLayout.LayoutParams.WRAP_CONTENT;
        layoutParamsTable.leftMargin = 20;
        layoutParamsTable.rightMargin = 20;
        tableLayout.setLayoutParams(layoutParamsTable);

        TableRow tableRow = new TableRow(this);
        ConstraintLayout.LayoutParams layoutParamsTableRow = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsTableRow.width = ConstraintLayout.LayoutParams.MATCH_PARENT;
        tableRow.setLayoutParams(layoutParamsTableRow);

        AppCompatButton appCompatButton = new AppCompatButton(this);
        ConstraintLayout.LayoutParams layoutParamsButton = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsButton.horizontalWeight = ConstraintLayout.LayoutParams.LEFT;
        layoutParamsButton.width = ConstraintLayout.LayoutParams.MATCH_CONSTRAINT;
        layoutParamsButton.height = ConstraintLayout.LayoutParams.WRAP_CONTENT;
        appCompatButton.setLayoutParams(layoutParamsButton);

        for (int j = 1; j < 9; j++) {
            tableRow = new TableRow(this);
            for (int i = 1; i < 9; i++) {
                appCompatButton = new AppCompatButton(this);
                appCompatButton.setId(View.generateViewId());
                if (j % 2 != 0) {
                    if (i % 2 != 0) appCompatButton.setBackgroundColor(Color.BLACK);
                    else appCompatButton.setBackgroundColor(Color.WHITE);
                } else {
                    if (i % 2 != 0) appCompatButton.setBackgroundColor(Color.WHITE);
                    else appCompatButton.setBackgroundColor(Color.BLACK);
                }
                tableRow.addView(appCompatButton);
            }
            tableLayout.addView(tableRow);
        }
              constraintLayout.addView(tableLayout);
        setContentView(constraintLayout);
    }

}