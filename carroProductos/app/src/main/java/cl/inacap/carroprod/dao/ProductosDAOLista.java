package cl.inacap.carroprod.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carroprod.dto.Producto;

public class ProductosDAOLista implements ProductosDAO {

    private List<Producto> productos = new ArrayList<>();
    private static ProductosDAOLista instancia;
    private ProductosDAOLista(){
        Producto p = new Producto();
        p.setNombre("Sprite");
        p.setDescripcion("Suspendisse varius finibus tellus. Etiam vel nulla erat. Fusce malesuada, orci et mattis efficitur, mauris arcu luctus orci, non varius dolor elit a orci. Maecenas tortor urna, accumsan in tempus consectetur, congue quis leo. Quisque id quam vel diam blandit euismod eu at ante. Nulla facilisi. Mauris elementum vehicula lorem, nec posuere sem mattis at.");
        p.setPrecio(800);
        p.setFoto("https://www.misterpanko.com/wp-content/uploads/2019/06/sprite.jpg");

        productos.add(p);

        p = new Producto();
        p.setNombre("Manquewito");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla consectetur leo non nisl venenatis rutrum. Donec dapibus, arcu non tristique lobortis, lectus arcu semper nisi, ut scelerisque ligula risus sit amet dui. Aliquam in ultrices urna.");
        p.setPrecio(900);
        p.setFoto("https://images.lider.cl/wmtcl?source=url[file:/productos/297129a.jpg]&sink");

        productos.add(p);

        p = new Producto();
        p.setNombre("chocolito");
        p.setDescripcion("Maecenas et rhoncus sem. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec laoreet eu nunc at tincidunt. Duis sodales eget lacus sed cursus. Integer commodo, elit quis euismod dignissim, dolor risus sodales massa, in gravida ligula ligula posuere ante. Integer pharetra sodales nisl, vitae dignissim ante congue et. In elit nisi, ornare id venenatis vitae, semper quis velit. Proin vitae ante faucibus nisi tristique volutpat. Nam suscipit efficitur consectetur. Quisque vel lorem quis turpis interdum pulvinar.");
        p.setPrecio(500);
        p.setFoto("https://dojiw2m9tvv09.cloudfront.net/745/product/capturadepantalla2020-07-21ala-s-16-41-524127.png");

        productos.add(p);
    }

    public static ProductosDAOLista getInstance(){
        if(instancia == null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }
    //implementar patron singleton
    @Override
    public List<Producto> getAll() {
        return productos;
    }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }
}
