package br.ifsc.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
    }

    public  void mudaTexto(View view){
        imageView.setImageResource(R.drawable.cachorro);

    }

    public  void  mudaImage(View view){
        imageView.setImageResource(R.drawable.porquinho);

    }
}
