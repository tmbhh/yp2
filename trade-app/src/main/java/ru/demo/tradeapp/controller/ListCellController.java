package ru.demo.tradeapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ru.demo.tradeapp.model.Product;

import java.io.IOException;

public class ListCellController {

    @FXML
    private ImageView ImageViewPhoto;

    @FXML
    private Label LabelDescription;

    @FXML
    private Label LabelManufacturer;

    @FXML
    private Label LabelPercent;

    @FXML
    private Label LabelTitle;

    public void setProduct(Product product) throws IOException {
        ImageViewPhoto.setImage(product.getPhoto());
        LabelPercent.setText(product.getDiscountAmount().toString());
        LabelTitle.setText(product.getTitle());
        LabelManufacturer.setText(product.getManufacturer().getTitle());

    }

}

