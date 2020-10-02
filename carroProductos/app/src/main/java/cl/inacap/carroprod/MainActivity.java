package cl.inacap.carroprod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import cl.inacap.carroprod.adapters.ProductosArrayAdapter;
import cl.inacap.carroprod.dao.ProductosDAO;
import cl.inacap.carroprod.dao.ProductosDAOLista;
import cl.inacap.carroprod.dto.Producto;

public class MainActivity extends AppCompatActivity {

    private ListView productos_lv;
    private List<Producto> productos;
    private ProductosArrayAdapter adaptador;
    private ProductosDAO productosDAO= ProductosDAOLista.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productos = productosDAO.getAll();
        adaptador = new ProductosArrayAdapter(this, R.layout.productos_list, productos);
        productos_lv = findViewById(R.id.productos_lv);
        productos_lv.setAdapter(adaptador);
        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}