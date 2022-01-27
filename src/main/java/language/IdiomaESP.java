/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author quaz_
 */
public class IdiomaESP extends IdiomaGenerico {
    
    public IdiomaESP(){super();}

    @Override
    public List<String> idiomaMenu() {
       List<String> palabras = Arrays.asList("FESTIVAL JAZZ","Identificador", "Nombre", "Documento", "Edad", "COMPRA SBB", "ORIGEN", "DESTINO");
       return palabras;
    }
    
}
