package sqlite;

/**
 * Created by Akstor on 11/11/2016.
 */

public class FaceGlasses {
    private String forma_cara;
    private String forma_gafa;
    private String genero;
    private float porcentaje;

    public FaceGlasses(){

    }

    public FaceGlasses(String forma_cara, String forma_gafa, String genero, float porcentaje){
        this.forma_gafa = forma_gafa;
        this.forma_cara = forma_cara;
        this.genero = genero;
        this.porcentaje = porcentaje;

    }

    public void setForma_cara(String forma_cara){
        this.forma_cara = forma_cara;
    }

    public void setForma_gafa(String forma_gafa){
        this.forma_gafa = forma_gafa;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setPorcentaje(float porcentaje){
        this.porcentaje = porcentaje;
    }

    public String getForma_cara(){
        return forma_cara;
    }

    public String getForma_gafa(){
        return forma_gafa;
    }

    public String getGenero(){
        return genero;
    }

    public float getPorcentaje(){
        return porcentaje;
    }
}
