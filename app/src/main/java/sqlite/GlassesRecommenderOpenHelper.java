package sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.hardware.camera2.params.Face;
import android.os.StrictMode;

/**
 * Created by Akstor on 10/11/2016.
 */

public class GlassesRecommenderOpenHelper extends SQLiteOpenHelper {
    //ToDo: Confrimar que la imagen va en base 64 y que el mejor tipo de datos es text o cual es.

    private static final String modelo_gafas = "modelo_gafas";
    private static final String gafas_cara = "gafas_cara";
   /* private static final String codigo_modelo = "codigo_modelo";
    private static final String forma_gafa = "forma_gafa";
    private static final String imagen = "imagen";
    private static final String forma_cara = "forma_cara";
    private static final String genero = "genero";
    private static final float porcentaje = Float.parseFloat("porcentaje");*/


    private static final java.lang.String GLASSES_MODEL_TABLE_CREATE = "CREATE TABLE " + modelo_gafas + " ( codigo_modelo  text primary key, forma_gafa  text  foreign key, imagen  text);";
    private static final java.lang.String FACE_GLASSES_TABLE_CREATE = "CREATE TABLE " + gafas_cara + " (forma_cara text primary key,  forma_gafa text, genero  text, porcentaje  decimal(1,2));";


    //metodo para meter datos en la tabla de relacion gafas-modelo
    /*public void AñadirGafas(GlassesModel gm){
        SQLiteDatabase base_de_datos = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(codigo_modelo, gm.getCodigo_modelo());
        values.put(forma_gafa, gm.getForma_gafa());
        values.put(imagen, gm.getImagen());

        base_de_datos.insert(modelo_gafas, null, values);
        base_de_datos.close();
    }
*/
    //metodo para meter datos en la tabla relacion gafas-cara
  /*  public void AñadirCaras(FaceGlasses fg){
        SQLiteDatabase base_de_datos = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(forma_cara, fg.getForma_gafa());
        values.put(forma_gafa, fg.getForma_gafa());
        values.put(genero, fg.getGenero());
        values.put("porcentaje", fg.getPorcentaje()); //ToDo: Observar como meter datos tipo float en una base de datos usando el metodo values.put o similar.

        base_de_datos.insert(gafas_cara, null, values);
        base_de_datos.close();
    }
*/
    //metodo para obtener el tipo de gafas usando como primary key la forma de cara en la tabla de relacion cara-gafas
 /*   public FaceGlasses getGlasses(String forma_cara){
        SQLiteDatabase base_de_datos = this.getReadableDatabase();
        Cursor cursor = base_de_datos.query(gafas_cara, new String[]{forma_cara, forma_gafa, genero, String.valueOf(porcentaje)}, forma_cara + "=?", new String[] {String.valueOf(forma_cara)}, null, null,null,null );
        if(cursor !=null)
            cursor.moveToFirst();
        FaceGlasses contact = new FaceGlasses(cursor.getString(0), cursor.getString(1), cursor.getString(2), Float.parseFloat(cursor.getString(3)));
        return contact;
    }
*/
    //metodo para obtener el modelo de gafas usando como primary key el codigo del modelo en la tabla de relacion modelo-gafas
 /*   public GlassesModel getModel(String codigo_modelo){
        SQLiteDatabase base_de_datos = this.getReadableDatabase();
        Cursor cursor = base_de_datos.query(modelo_gafas, new String[]{codigo_modelo, forma_gafa, imagen}, codigo_modelo + "=?", new String[]{String.valueOf(codigo_modelo)}, null, null, null, null);
        if (cursor!= null)
            cursor.moveToFirst();
        GlassesModel contact = new GlassesModel(cursor.getColumnName(0), cursor.getString(1), cursor.getString(2));
        return contact;

        //informacion de metodos en http://mobilesiri.com/android-sqlite-database-tutorial-using-android-studio/

    } */
    /**
     * Create a helper object to create, open, and/or manage a database.
     * This method always returns very quickly.  The database is not actually
     * created or opened until one of {@link #getWritableDatabase} or
     * {@link #getReadableDatabase} is called.
     *  @param context to use to open or create the database
     * @param name    of the database file, or null for an in-memory database
     */
    public GlassesRecommenderOpenHelper(Context context, String name) {
        super(context, "GlassesRecommenderDB", null, 1);
    }

    /**
     * Called when the database is created for the first time. This is where the
     * creation of tables and the initial population of the tables should happen.
     *
     * @param db The database.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se crea la tabla que relaciona las caras con las gafas
        db.execSQL(FACE_GLASSES_TABLE_CREATE);
        //Se crea la tabla que relaciona los tipos de gafas con los modelos
        db.execSQL(GLASSES_MODEL_TABLE_CREATE);
    }

    /**
     * Called when the database needs to be upgraded. The implementation
     * should use this method to drop tables, add tables, or do anything else it
     * needs to upgrade to the new schema version.
     * <p>
     * <p>
     * The SQLite ALTER TABLE documentation can be found
     * <a href="http://sqlite.org/lang_altertable.html">here</a>. If you add new columns
     * you can use ALTER TABLE to insert them into a live table. If you rename or remove columns
     * you can use ALTER TABLE to rename the old table, then create the new table and then
     * populate the new table with the contents of the old table.
     * </p><p>
     * This method executes within a transaction.  If an exception is thrown, all changes
     * will automatically be rolled back.
     * </p>
     *
     * @param db         The database.
     * @param oldVersion The old database version.
     * @param newVersion The new database version.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
