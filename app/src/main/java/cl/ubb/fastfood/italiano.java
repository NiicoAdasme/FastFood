package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class italiano extends AppCompatActivity {

    private String nombre;
    private String id_img;
    private int precio;
    private String descripcion;

    ListView italiano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italiano);

        italiano = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arrayitaliano ,
                android.R.layout.simple_list_item_1);

        italiano.setAdapter(adaptador);
    }


}
