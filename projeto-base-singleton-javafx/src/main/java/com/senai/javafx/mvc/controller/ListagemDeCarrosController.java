
package com.senai.javafx.mvc.controller;

import com.senai.javafx.mvc.Navegacao;
import com.senai.javafx.mvc.model.Carro;
import com.senai.javafx.mvc.service.CarroService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class ListagemDeCarrosController {

    @FXML
    private TableView<Carro> tabelaCarros;

    @FXML
    private TableColumn<Carro, Long> colId;

    @FXML
    private TableColumn<Carro, String> colNome;

    @FXML
    private TableColumn<Carro, String> colMarca;

    @FXML
    private TableColumn<Carro, String> colModelo;

    @FXML
    private TableColumn<Carro, String> colPlaca;

    private final CarroService carroService = new CarroService();

    @FXML
    public void initialize() {
        configurarColunas();
        atualizarTabela();
    }

    public void abrirTelaCadastro() throws IOException {
        Navegacao.abrirTela("hello-view.fxml", "Cadastro");
    }

    private void configurarColunas() {
        colId.setCellValueFactory(
                new PropertyValueFactory<>("id")
        );

        colNome.setCellValueFactory(
                new PropertyValueFactory<>("nome")
        );

        colMarca.setCellValueFactory(
                new PropertyValueFactory<>("marca")
        );

        colModelo.setCellValueFactory(
                new PropertyValueFactory<>("modelo")
        );

        colPlaca.setCellValueFactory(
                new PropertyValueFactory<>("placa")
        );
    }

    @FXML
    public void atualizarTabela() {
        ObservableList<Carro> carros =
                FXCollections.observableArrayList(
                        carroService.listarTodos()
                );

        tabelaCarros.setItems(carros);
    }
}
