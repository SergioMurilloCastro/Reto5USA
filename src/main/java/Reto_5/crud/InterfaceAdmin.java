/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto_5.crud;

import Reto_5.modelo.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sergio
 */
public interface InterfaceAdmin extends CrudRepository<Admin,Integer>{
    
}
