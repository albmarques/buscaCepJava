/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class CEP {

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String ddd;

    public void buscarCep(String cep) throws MalformedURLException, IOException {
        URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/?callback=callback_name");
        Scanner s = new Scanner(url.openStream());
        lerAPI(s);

    }

    public void lerAPI(Scanner s) {
        s.nextLine();
        for (int i = 1; i < 10; i++) {
            lerPalavra(s.nextLine());
        }
    }

    public void lerPalavra(String linha) {
        String palavra = linha.split(":")[1].replace("\"", "").replace(",", "");
        if ("\"logradouro\"".equals(linha.split(":")[0].replace(" ", ""))) {
            this.logradouro = palavra;
        }
        if ("\"bairro\"".equals(linha.split(":")[0].replace(" ", ""))) {
            this.bairro = palavra;
        }
        if ("\"localidade\"".equals(linha.split(":")[0].replace(" ", ""))) {
            this.cidade = palavra;
        }
        if ("\"cep\"".equals(linha.split(":")[0].replace(" ", ""))) {
            this.cep = palavra;
        }
        if ("\"uf\"".equals(linha.split(":")[0].replace(" ", ""))) {
            this.estado = palavra;
        }
        if ("\"ddd\"".equals(linha.split(":")[0].replace(" ", ""))) {
            this.ddd = palavra;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public String getDDD() {
        return ddd;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
