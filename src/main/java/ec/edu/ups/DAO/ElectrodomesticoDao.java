/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.DAO;

import ec.edu.ups.IDAO.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author linar
 */
public class ElectrodomesticoDao {
    
    private Map<String, Electrodomestico> electrosomesticos;
    
    public ElectrodomesticoDao(){
        electrosomesticos= new HashMap<String, Electrodomestico>();
        
    }
    
}
