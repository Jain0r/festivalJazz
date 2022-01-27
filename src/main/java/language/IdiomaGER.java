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
 * @author Jainor
 */
public class IdiomaGER extends IdiomaGenerico{

    @Override
    public List<String> idiomaMenu() {
        List<String> worter = Arrays.asList("JAZZ FESTIVAL", "Kennung", "Name", "Dokumentieren", "Jahre", "Kaufen SBB", "Anfang", "Ende");
        return worter;
    }

}
