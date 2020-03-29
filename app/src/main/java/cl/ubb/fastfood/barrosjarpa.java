package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class barrosjarpa extends AppCompatActivity {

    ListView barrosjarpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrosjarpa);

        barrosjarpa = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arraybarrsojarpa ,
                android.R.layout.simple_list_item_1);

        barrosjarpa.setAdapter(adaptador);
    }
}
