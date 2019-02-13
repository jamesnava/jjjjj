/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getters_setters;

import java.time.Year;

/**
 *
 * @author CESAR
 */
public class ProduCateIgvMarca_Getters_Setters {
    // getter y setter del Producto
    
    String CodigoP;
    String Nombrep;
    String DescripcionP;
    String colorP;
    String TamanioP;
    String Codi_CategoriaP;
    String Dni_usuaP;
    Integer Codi_MarcaP;
    
    //getter y setter de Categoria
    
    String CodigoC;
    String NombreC;
    String DescripcionC;
    
    //getter y setter de IGV
    
    String CodigoI;
    Double MontoI;
    String DescripcionI;
    Year AnioI;
    
    //getter y setter de Marca
    
    Integer CodigoM;
    String NombreM;
    String DescripcionM;
    
    public ProduCateIgvMarca_Getters_Setters(){
     
// getter y setter del Producto
    
    CodigoP="";
    Nombrep="";
    DescripcionP="";
    colorP="";
    TamanioP="";
    Codi_CategoriaP="";
    Dni_usuaP="";
    Codi_MarcaP = 0;
    
    //getter y setter de Categoria
    
    CodigoC="";
    NombreC="";
    DescripcionC="";
    
    //getter y setter de IGV
    
    CodigoI="";
    MontoI= 0.0;
    DescripcionI="";
    AnioI= null;
    
    //getter y setter de Marca
    
    CodigoM=0;
    NombreM="";
    DescripcionM="";
             
    }

    public String getCodigoP() {
        return CodigoP;
    }

    public void setCodigoP(String CodigoP) {
        this.CodigoP = CodigoP;
    }

    public String getNombrep() {
        return Nombrep;
    }

    public void setNombrep(String Nombrep) {
        this.Nombrep = Nombrep;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }

    public String getColorP() {
        return colorP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

    public String getTamanioP() {
        return TamanioP;
    }

    public void setTamanioP(String TamanioP) {
        this.TamanioP = TamanioP;
    }

    public String getCodi_CategoriaP() {
        return Codi_CategoriaP;
    }

    public void setCodi_CategoriaP(String Codi_CategoriaP) {
        this.Codi_CategoriaP = Codi_CategoriaP;
    }

    public String getDni_usuaP() {
        return Dni_usuaP;
    }

    public void setDni_usuaP(String Dni_usuaP) {
        this.Dni_usuaP = Dni_usuaP;
    }

    public Integer getCodi_MarcaP() {
        return Codi_MarcaP;
    }

    public void setCodi_MarcaP(Integer Codi_MarcaP) {
        this.Codi_MarcaP = Codi_MarcaP;
    }

    public String getCodigoC() {
        return CodigoC;
    }

    public void setCodigoC(String CodigoC) {
        this.CodigoC = CodigoC;
    }

    public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    public String getDescripcionC() {
        return DescripcionC;
    }

    public void setDescripcionC(String DescripcionC) {
        this.DescripcionC = DescripcionC;
    }

    public String getCodigoI() {
        return CodigoI;
    }

    public void setCodigoI(String CodigoI) {
        this.CodigoI = CodigoI;
    }

    public Double getMontoI() {
        return MontoI;
    }

    public void setMontoI(Double MontoI) {
        this.MontoI = MontoI;
    }

    public String getDescripcionI() {
        return DescripcionI;
    }

    public void setDescripcionI(String DescripcionI) {
        this.DescripcionI = DescripcionI;
    }

    public Year getAnioI() {
        return AnioI;
    }

    public void setAnioI(Year AnioI) {
        this.AnioI = AnioI;
    }

    public Integer getCodigoM() {
        return CodigoM;
    }

    public void setCodigoM(Integer CodigoM) {
        this.CodigoM = CodigoM;
    }

    public String getNombreM() {
        return NombreM;
    }

    public void setNombreM(String NombreM) {
        this.NombreM = NombreM;
    }

    public String getDescripcionM() {
        return DescripcionM;
    }

    public void setDescripcionM(String DescripcionM) {
        this.DescripcionM = DescripcionM;
    }
    
    
}
