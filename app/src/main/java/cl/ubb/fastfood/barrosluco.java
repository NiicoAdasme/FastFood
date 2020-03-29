package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class barrosluco extends AppCompatActivity {

    ListView barrosluco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrosluco);

        barrosluco = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arraybarrosluco ,
                android.R.layout.simple_list_item_1);

        barrosluco.setAdapter(adaptador);

    }
}
