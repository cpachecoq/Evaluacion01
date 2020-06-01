/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;
import ec.edu.ups.IDAO.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Lavadora;
import java.util.Collection;


/**
 *
 * @author linar
 */
public class ControladorElectrodomestico {
    
    private Electrodomestico electrodomestico;
    private VistaElectrodomestico vistaElectrodomestico;
    private IElectrodomesticoDAO ielectrodomesticodao;

    public ControladorElectrodomestico() {
    }

    public ControladorElectrodomestico(Electrodomestico electrodomestico, VistaElectrodomestico vistaElectrodomestico, IElectrodomesticoDAO ielectrodomesticodao) {
        this.electrodomestico = electrodomestico;
        this.vistaElectrodomestico = vistaElectrodomestico;
        this.ielectrodomesticodao = ielectrodomesticodao;
    }
    
    
    
    
}
