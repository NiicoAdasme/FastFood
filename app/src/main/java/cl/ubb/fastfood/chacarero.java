package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class chacarero extends AppCompatActivity {

    ListView chacarero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chacarero);

        chacarero = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arraychacarero ,
                android.R.layout.simple_list_item_1);

        chacarero.setAdapter(adaptador);
    }
}
