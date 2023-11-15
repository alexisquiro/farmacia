public interface UserRepository {

    public Usuario getUserByName(String nombreUsuario);

    public boolean authUser(String usuario, String contraseña);

}