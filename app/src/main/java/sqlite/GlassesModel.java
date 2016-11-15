package sqlite;

/**
 * Created by Akstor on 11/11/2016.
 */

public class GlassesModel {

    private String codigo_modelo;
    private String forma_gafa;
    private String imagen;

    public GlassesModel(){

    }

    public GlassesModel(String codigo_modelo, String forma_gafa, String imagen){
        this.codigo_modelo = codigo_modelo;
        this.forma_gafa = forma_gafa;
        this.imagen = imagen;
    }

    public  void setCodigo_modelo(String codigo_modelo){
        this.codigo_modelo = codigo_modelo;
    }

    public void setForma_gafa(String forma_gafa){
        this.forma_gafa = forma_gafa;
    }

    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    public String getCodigo_modelo(){
        return codigo_modelo;
    }

    public String getForma_gafa(){
        return forma_gafa;
    }

    public String getImagen(){
        return imagen;
    }
}
