/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language;

/**
 *
 * @author quaz_
 */
public abstract class IdiomaFactory {
    public IdiomaFactory(){}
    
    public abstract IdiomaGenerico metodoIdioma();
    
    public static IdiomaGenerico establecerIdioma(int num){
        IdiomaGenerico idiom= null;
        switch(num){
            case 0:
                idiom = new FabricaESP().metodoIdioma();
                break;
            case 1:
                idiom = new FabricaGER().metodoIdioma();
                break;
        }
        return idiom;
    }
}
