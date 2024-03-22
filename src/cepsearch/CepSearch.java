/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cepsearch;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class CepSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        CEP cep = new CEP();
        cep.buscarCep("55018070");
        System.out.println(cep.getLogradouro());
        System.out.println(cep.getCidade());
        System.out.println(cep.getBairro());
        System.err.println(cep.getCep());
        System.out.println(cep.getDDD());
        
 
    }
    
}
