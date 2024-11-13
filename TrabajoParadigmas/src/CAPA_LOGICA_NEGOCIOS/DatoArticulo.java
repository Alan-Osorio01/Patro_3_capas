
package CAPA_LOGICA_NEGOCIOS;
import java. util. ArrayList;
import java.sql.*;
import CAPA_DATOS.Conexion;


public class DatoArticulo {
    private String art_cod;
    private String art_nom;
    private String art_uni;
    private double art_pre;
    private int art_stk;
    private String art_marca;
    
    public String EliminarArticulo (){
        
        Conexion objmod=new Conexion ();
        String cad="delete from articulo where art_cod='"+this.getArt_cod()+"'";
        return objmod.Ejecutar (cad) ;
    }
    public String GrabarArticulo (){
        
        Conexion objmod=new Conexion ();
        String cad="insert into articulo values('"+this.getArt_cod()
                +"','"+this.getArt_nom()+"','"+this.getArt_uni()
                +"','" +this.getArt_pre()+"','"+this.getArt_stk()
                +"',"+"'" +this.getArt_marca()+"')";
        return objmod.Ejecutar (cad) ;
    }
    public String EditarArticulo(){
        Conexion objmod=new Conexion();
        String cad="update articulo set art_nom='"+this.getArt_nom()
                +"',art_uni='"+this.getArt_uni()+"',art_pre='"+this.getArt_pre()
                +"',art_stk='"+this.getArt_stk()+"',art_marca='"+this.getArt_marca()
                +"' where art_cod='"+this.getArt_cod()+"'";
        return objmod.Ejecutar (cad) ;
    }
    public ArrayList<DatoArticulo>ListaArticulos(){
        ArrayList lista2=new ArrayList ();
        try
        {
            Conexion objmod=new Conexion ();
            ResultSet tabla=objmod.Listar("select * from articulo");
            DatoArticulo objart;
            while (tabla.next()){
                
                objart =new DatoArticulo();
                objart.setArt_cod(tabla.getString("art_cod"));
                objart.setArt_nom(tabla.getString("art_nom"));
                objart.setArt_uni(tabla.getString("art_uni"));
                objart.setArt_pre(tabla.getDouble("art_pre"));
                objart.setArt_stk(tabla.getInt ("art_stk"));
                objart.setArt_marca(tabla.getString("art_marca"));
                lista2.add(objart) ;
            }
        }
        catch (Exception e){
            javax.swing.JOptionPane. showMessageDialog(null,e.getMessage());
        }
        return lista2;
}

    public String getArt_cod() {
        return art_cod;
    }

    public void setArt_cod(String art_cod) {
        this.art_cod = art_cod;
    }

    public String getArt_nom() {
        return art_nom;
    }

    public void setArt_nom(String art_nom) {
        this.art_nom = art_nom;
    }

    public String getArt_uni() {
        return art_uni;
    }

    public void setArt_uni(String art_uni) {
        this.art_uni = art_uni;
    }

    public double getArt_pre() {
        return art_pre;
    }

    public void setArt_pre(double art_pre) {
        this.art_pre = art_pre;
    }

    public int getArt_stk() {
        return art_stk;
    }

    public void setArt_stk(int art_stk) {
        this.art_stk = art_stk;
    }

    public String getArt_marca() {
        return art_marca;
    }

    public void setArt_marca(String art_marca) {
        this.art_marca = art_marca;
    }


}
