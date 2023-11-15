// En el dominio
public interface ProductRepository {
    // Operaciones relacionadas con la persistencia de productos
    public void guardarProducto(Producto producto);
    public Producto obtenerProductoPorId(String id);
    public List<Producto> obtenerTodosLosProductos();
    public void eliminarProducto(String id);
}
