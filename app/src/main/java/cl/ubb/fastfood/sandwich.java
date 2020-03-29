package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sandwich extends AppCompatActivity {

    private String nombre;
    private String id_img;
    private int precio;
    private String descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich);

        sandwich italiano= new sandwich();

        sandwich chacarero= new sandwich();

        sandwich barrosluco= new sandwich();

        sandwich barrosjarpa= new sandwich();

        sandwich aleman= new sandwich();

    }

    public void italiano(View v){
        Intent intent= new Intent(this,italiano.class);
        startActivity(intent);
    }

    public void aleman(View v){
        Intent intent= new Intent(this,aleman.class);
        startActivity(intent);
    }

    public void chacarero(View v){
        Intent intent= new Intent(this,chacarero.class);
        startActivity(intent);
    }

    public void barrosluco(View v){
        Intent intent= new Intent(this,barrosluco.class);
        startActivity(intent);
    }

    public void barrosjarpa(View v){
        Intent intent= new Intent(this, barrosjarpa.class);
        startActivity(intent);
    }

    // GETTER
    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public int getPrecio(){
        return this.precio;
    }

    public String getId_img(){
        return this.id_img;
    }

    // SETTER
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void setId_img(String id_img){
        this.id_img= id_img;
    }

    public void setPrecio(int precio){
        this.precio= precio;
    }

    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }

}
