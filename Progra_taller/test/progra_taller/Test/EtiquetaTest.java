package progra_taller.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;
import progra_taller.rnegocio.impl.*;

public class EtiquetaTest {
    public EtiquetaTest() {
    }
    @Test
    public void pruebageneral(){
        //              INSERTAR
        int filasAfectadas =0;
        IEtiqueta etiquetaDao = new EtiquetaImpl();
        Etiqueta etiqueta = new Etiqueta(1,"Etiqueta",new Date(),new Date());
        try{
            filasAfectadas = etiquetaDao.insertar(etiqueta);
            System.out.println("Etiqueta ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE etiqueta
        List<Etiqueta> lista = new ArrayList<>();
        try {
            lista = etiquetaDao.obtener();
            for (Etiqueta c:lista){
                System.out.println("---Datos etiquetas---");
                System.out.println("Id :"+c.getIdetiqueta());
                System.out.println("Nombre :"+c.getNombre());
                System.out.println("Fecha creacion :"+c.getCreado());
            System.out.println("Fecha actualizacion :"+c.getActualizado());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}