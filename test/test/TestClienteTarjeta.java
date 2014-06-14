/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import clientetarjeta.ClienteNormal;
import clientetarjeta.ClientePlatinium;
import clientetarjeta.Empresa;
import clientetarjeta.Tarjeta;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darien
 */
public class TestClienteTarjeta {

    public TestClienteTarjeta() {
    }

    @Test
    public void crearClienteNormal() {
        ClienteNormal cliente = new ClienteNormal("58964785", "Irving", "Urbano", "u201418556", 600);
    }

    @Test
    public void crearClientePlatinium() {
        ClientePlatinium cliente = new ClientePlatinium("65894758", "Jani", "Giraldo", "u201418557", 800);
    }

    @Test
    public void calcularPuntosClienteNormal() {
        ClienteNormal cliente = new ClienteNormal("58964785", "Irving", "Urbano", "u201418556", 600);
        
        Date fecha = new Date("13/06/2014");
        Tarjeta tarjeta = new Tarjeta(fecha);
       
        cliente.setTarjeta(tarjeta);
             
        cliente.calcularPuntos();
    }

    @Test
    public void calcularPuntosClientePlatinium() {
        ClientePlatinium cliente = new ClientePlatinium("65894758", "Jani", "Giraldo", "u201418557", 800);
        
        Date fecha = new Date("13/06/2014");
        Tarjeta tarjeta = new Tarjeta(fecha);
        cliente.setTarjeta(tarjeta);
        
        cliente.calcularPuntos();
    }

    @Test
    public void totalesPuntosCanjearClientes() {
        ClientePlatinium cliente = new ClientePlatinium("65894758", "Jani", "Giraldo", "u201418557", 800);
        ClienteNormal cliente1 = new ClienteNormal("58964785", "Irving", "Urbano", "u201418556", 600);
        
        
        Date fecha = new Date("13/06/2014");
        Tarjeta tarjeta = new Tarjeta(fecha);
        
        Date fecha1 = new Date("13/06/2014");
        Tarjeta tarjeta1 = new Tarjeta(fecha1);
        
        cliente.setTarjeta(tarjeta);
        cliente1.setTarjeta(tarjeta1);
        
        Empresa empresa = new Empresa();
        empresa.agregarCliente(cliente);
        empresa.agregarCliente(cliente1);
        
        for (int i = 0; i < empresa.getListaClientes().size(); i++) {
            empresa.getListaClientes().get(i).calcularPuntos();
        }
    }
    
    @Test
    public void totalesPuntosCanjearClientesNormales() {
        ClienteNormal cliente = new ClienteNormal("65894758", "Jani", "Giraldo", "u201418557", 800);
        ClienteNormal cliente1 = new ClienteNormal("58964785", "Irving", "Urbano", "u201418556", 600);
        
        Date fecha = new Date("13/06/2014");
        Tarjeta tarjeta = new Tarjeta(fecha);
        
        Date fecha1 = new Date("13/06/2014");
        Tarjeta tarjeta1 = new Tarjeta(fecha1);
        
        cliente.setTarjeta(tarjeta);
        cliente1.setTarjeta(tarjeta1);        
        
        
        
        Empresa empresa = new Empresa();
        empresa.agregarCliente(cliente);
        empresa.agregarCliente(cliente1);
        
        for (int i = 0; i < empresa.getListaClientes().size(); i++) {
            empresa.getListaClientes().get(i).calcularPuntos();
        }
    }   
    
    @Test
    public void codigoUsuarioNoSeRepita() {
        ClienteNormal cliente = new ClienteNormal("65894758", "Jani", "Giraldo", "u201418557", 800);
        ClienteNormal cliente1 = new ClienteNormal("58964785", "Irving", "Urbano", "u201418556", 600);
        Empresa empresa = new Empresa();
        assertEquals(true,empresa.agregarCliente(cliente)); 
        assertEquals(true,empresa.agregarCliente(cliente1));  
    }
    
    @Test
    public void totalesPuntosCanjearClientesPlatinium() {
        ClientePlatinium cliente = new ClientePlatinium("65894758", "Jani", "Giraldo", "u201418557", 800);
        ClientePlatinium cliente1 = new ClientePlatinium("58964785", "Irving", "Urbano", "u201418556", 600);

        Date fecha = new Date("13/06/2014");
        Tarjeta tarjeta = new Tarjeta(fecha);
        
        Date fecha1 = new Date("13/06/2014");
        Tarjeta tarjeta1 = new Tarjeta(fecha1);
        
        cliente.setTarjeta(tarjeta);
        cliente1.setTarjeta(tarjeta1);    
    
        Empresa empresa = new Empresa();
        empresa.agregarCliente(cliente);
        empresa.agregarCliente(cliente1);
        
        for (int i = 0; i < empresa.getListaClientes().size(); i++) {
            empresa.getListaClientes().get(i).calcularPuntos();
        }
    }       
    
}
