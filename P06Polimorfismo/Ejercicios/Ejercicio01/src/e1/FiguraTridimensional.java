/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e1;

/**
 *
 * @author jchal
 */
public abstract class FiguraTridimensional implements Figura{

    public String tipoFiguraTri;
    public String tipoCuerpoTri;
    
    public FiguraTridimensional(String FiguraTri, String CuerpoTri) {
        tipoFiguraTri = FiguraTri;
        tipoCuerpoTri = CuerpoTri;
    }

    public String getTipoFiguraTri() {
        return tipoFiguraTri;
    }

    public String getTipoCuerpoTri() {
        return tipoCuerpoTri;
    }

    public void setTipoFiguraTri(String tipoFiguraTri) {
        this.tipoFiguraTri = tipoFiguraTri;
    }

    public void setTipoCuerpoTri(String tipoCuerpoTri) {
        this.tipoCuerpoTri = tipoCuerpoTri;
    }

}
