package com.example.indrapro.indra_1202152164_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detail extends AppCompatActivity {
    private int counts = 0;
    private Button plus, minus;
    private TextView liter1;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//inisialisasi setiap element dan get intent
        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String deskripsi = intent.getStringExtra("deskripsi");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.title);
        TextView textDesc = findViewById(R.id.desc);
        ImageView imageGambar = findViewById(R.id.imageview);

        textTitle.setText(title);
        textDesc.setText(deskripsi);
        imageGambar.setImageResource(gambar);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        liter1 = findViewById(R.id.liter);
        battery = findViewById(R.id.battery);

        battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
        liter1.setText(Integer.toString(counts) + "L");

    }
//aksi saat tombol ditekal (increment)
    public void plus(View view) {
        counts++;
        if (liter1 != null) {
            switch (counts) {
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "air botol sedikit", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Botol Penuh", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
//aksi saat tombol ditekan (decerement)
    public void minus(View view) {
        counts--;
        if (liter1 != null) {
            switch (counts) {
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Botol kamu penuh", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    liter1.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "air botol sedikit", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
