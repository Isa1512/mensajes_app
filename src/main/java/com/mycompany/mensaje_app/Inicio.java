/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensaje_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author isa_1
 */
public class Inicio {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int option = 0;
        
        do{
            System.out.println("---------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensaje");
            System.out.println(" 3. Editar mensaje");
            System.out.println(" 4. Eliminar mensaje");
            System.out.println(" 5. Salir");
            
            //Leemos la opcion del usuario
            option = sc.nextInt();
            
            switch(option){
                case 1: 
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    break;
            }
        }while(option != 5);
        
        
        
        Conexion conexion = new Conexion();
        
        try(Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            System.out.println(e);        }
    }
    
}
