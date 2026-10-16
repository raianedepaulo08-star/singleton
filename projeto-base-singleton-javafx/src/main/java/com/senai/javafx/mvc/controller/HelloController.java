package com.senai.javafx.mvc.controller;

import com.senai.javafx.mvc.Navegacao;
import com.senai.javafx.mvc.model.Carro;
import com.senai.javafx.mvc.service.CarroService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField txtfNomeDoCarro;

    @FXML
    private TextField txtfMarcaDoCarro;

    @FXML
    private TextField txtfModeloDoCarro;

    @FXML
    private TextField txtfPlacaDoCarro;

    private CarroService carroService = new CarroService();

    @FXML
    public void salvar() throws IOException {
        String nome = txtfNomeDoCarro.getText();
        String marca = txtfMarcaDoCarro.getText();
        String modelo = txtfModeloDoCarro.getText();
        String placa = txtfPlacaDoCarro.getText();

        Carro carro = new Carro();
        carro.setNome(nome);
        carro.setMarca(marca);
        carro.setModelo(modelo);
        carro.setPlaca(placa);

        carroService.salvar(carro);


        Navegacao.abrirTela("tela-listagem-de-carros.fxml",
                "Tela listagem de carros");
    }


}
