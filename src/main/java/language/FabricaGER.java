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
public class FabricaGER extends IdiomaFactory{
    FabricaGER(){super();}

    @Override
    public IdiomaGenerico metodoIdioma() {
        return new IdiomaGER();
    }
   
}
