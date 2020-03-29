package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class aleman extends AppCompatActivity {

    ListView aleman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleman);

        aleman = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arrayaleman ,
                android.R.layout.simple_list_item_1);

        aleman.setAdapter(adaptador);
    }
}
