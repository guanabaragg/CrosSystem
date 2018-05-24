package com.example.alex.meuprimeiroapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.btnAcessar = (Button) findViewById(R.id.btnAcessar);

        this.mViewHolder.btnAcessar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    //Intent in = new Intent(this, MainActivity.class);
    //Intent in = new Intent(this, TabFragment.class);
    Intent in = new Intent(this, MainActivity2.class);
    startActivity(in);
    Toast.makeText(this, "Login in", Toast.LENGTH_SHORT).show();

    }

    private static class ViewHolder {
        Button btnAcessar;

    }
}