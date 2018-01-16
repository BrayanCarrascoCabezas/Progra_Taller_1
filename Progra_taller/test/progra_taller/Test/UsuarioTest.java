package progra_taller.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import progra_taller.rnegocio.Impl.UsuarioImpl;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;
import progra_taller.rnegocio.Impl.*;

public class UsuarioTest {
    public UsuarioTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
        //              INSERTAR
        int filasAfectadas =0;
        IUsuario usuarioDao = new UsuarioImpl();
        IRol rolDao = new RolImpl();
        Rol rol = rolDao.obtener(1);
        Usuario usuario = new Usuario(1,"nombre","email","password",new Date(),new Date(),rol);
        
        try{
            filasAfectadas = usuarioDao.insertar(usuario);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE PEdido
        List<Usuario> lista = new ArrayList<>();
        try {
            lista = usuarioDao.obtener();
            for (Usuario c:lista){
                System.out.println("---Datos usuario---");
                System.out.println("Id :"+c.getIdusuario());
                System.out.println("Nombre :"+c.getNombre());
                System.out.println("Email :"+c.getEmail());
                System.out.println("Contraseña :"+c.getPassword());
                System.out.println("Fecha creado :"+c.getCreado());
                System.out.println("Fecha actualizado :"+c.getActualizado());
                System.out.println("Rol :"+c.getRol().getIdrol());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}



