package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sandwich(View v){
        Intent intent= new Intent(this,sandwich.class);
        startActivity(intent);
    }

    public void acercaDeNosotros(View v){
        Intent intent= new Intent(this,acercaDeNosotros.class);
        startActivity(intent);
    }

}
