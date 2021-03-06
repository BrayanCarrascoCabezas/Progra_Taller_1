package progra_taller.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;
import progra_taller.rnegocio.Impl.*;

public class PublicacionTest {
    public PublicacionTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
        //              INSERTAR
        int filasAfectadas =0;
        IPublicacion publicacionDao = new PublicacionImpl();
        IUsuario usuarioDao = new UsuarioImpl();
        Usuario usuario = usuarioDao.obtener(1);
        INivel nivelDao = new NivelImpl();
        Nivel nivel = nivelDao.obtener(1);
        Publicacion publicacion = new Publicacion(3,usuario,nivel,"titulo2","contenido2",1,1,12.34,new Date(),new Date());
        
        try{
            filasAfectadas = publicacionDao.insertar(publicacion);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);

        List<Publicacion> lista = new ArrayList<>();
        try {
            lista = publicacionDao.obtener();
            for (Publicacion c:lista){
                System.out.println("---Datos publicacion---");
                System.out.println("Id :"+c.getIdpublicacion());
                System.out.println("Usuario :"+c.getUsuario().getIdusuario());
                System.out.println("Nivel :"+c.getNivel().getIdnivel());
                System.out.println("Titulo :"+c.getTitulo());
                System.out.println("Contenido :"+c.getContenido());
                System.out.println("Publicado :"+c.getPublicado());
                System.out.println("Vistas :"+c.getVistas());
                System.out.println("Votos :"+c.getVotos());
                System.out.println("Fecha creado :"+c.getCreado());
                System.out.println("Fecha actualizado :"+c.getActualizado());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}



