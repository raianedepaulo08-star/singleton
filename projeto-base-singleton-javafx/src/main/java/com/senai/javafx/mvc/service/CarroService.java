package com.senai.javafx.mvc.service;

import com.senai.javafx.mvc.BancoDeDados;
import com.senai.javafx.mvc.model.Carro;

import java.util.ArrayList;

public class CarroService {

    public Carro salvar(Carro carro) {
       carro.setId(BancoDeDados.getInstance().pegarProximoId());
       BancoDeDados.getInstance().carros.add(carro);
       return carro;
    }

    public ArrayList<Carro> listarTodos() {
        return BancoDeDados.getInstance().carros;
    }

}
