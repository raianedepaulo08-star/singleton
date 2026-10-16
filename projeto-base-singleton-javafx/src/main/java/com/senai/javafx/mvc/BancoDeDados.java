package com.senai.javafx.mvc;

import com.senai.javafx.mvc.model.Carro;

import java.util.ArrayList;

public class BancoDeDados {

    private static BancoDeDados bancoDeDados;
    public ArrayList<Carro> carros = new ArrayList<>();
    private Long ultimoId;

    private BancoDeDados () {}

    public static BancoDeDados getInstance() {
        if (bancoDeDados == null) {
            bancoDeDados = new BancoDeDados();
        }
        return bancoDeDados;
    }

    public Long pegarProximoId() {
        // lista vazia e id vazio (primeiro item da lista definitivo)
        if (carros.isEmpty() && ultimoId == null) {
            ultimoId = 1L;
            return  ultimoId;
        }

        // lista excluida totalmente, mas possuia itens antes
        if (carros.isEmpty()) {
            ultimoId += 1;
            return ultimoId;
        }

        // incremento normal
        ultimoId = carros.get(carros.size() -1).getId() + 1;
        return ultimoId;
    }

}
