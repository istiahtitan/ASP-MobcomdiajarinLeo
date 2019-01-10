package com.example.pc3.mobcomtugas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnCoba);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(v,"Mau pindah ke activity 2?", Snackbar.LENGTH_LONG)
                        .setAction("OKAY!", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                            }
                        });
                snackbar.show();
//                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                startActivity(intent);
//                Toast.makeText(getApplicationContext(), "Ini contoh Toast",Toast.LENGTH_SHORT).show();
//                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
//                alertDialog.setTitle("Titanus alert");
//                alertDialog.setMessage("apakah mau pindah activity?");
//                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YES",
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
//                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                                startActivity(intent);
//                            }
//                        });
//                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO",
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                            }
//                        });
//                alertDialog.show();


            }
        });
    }
}
