/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cecar.controladores;

import edu.cecar.componentes.baseDatos.ConectarMySQL;
import edu.cecar.modelos.Empleado;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase: $(name)
 * 
 * @version: 0.1
 *  
 * @since: $(date)
 * 
 * Fecha de Modificación:
 * 
 * @author: Diana De Hoyos
 * 
 * Copyrigth: CECAR
 */



/**
 *
 * clase
 */
public class ControladorEmpleado {
    private ConectarMySQL conectarMySQL;
    
    public ControladorEmpleado()throws SQLException{
        conectarMySQL = new ConectarMySQL ("127.0.0.1", "manpower", "root", "");
    }

    public void guardar(Empleado empleado) throws SQLException{
       PreparedStatement preparedStatement = conectarMySQL.getConnection().prepareStatement("Insert into empleados values(?,?,?,?)");
       preparedStatement.setString(1, empleado.getCodigo());
       preparedStatement.setString(2, empleado.getNombres());
       preparedStatement.setString(3, empleado.getApellidos());
       preparedStatement.setDate(4, empleado.getFechaNacimiento());
       preparedStatement.execute();
   }
    
    
   /* public void consultar(String codigo) {
    Empleado empleado =null;
    retern
    } */
    
    
    public void actualizar() {}
    public void eliminar() {}
}
