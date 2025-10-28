package cs112.ud2;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private TextField nameField, typeField;

    @FXML
    private ListView<String> pokemonList;

    @FXML
    private Label statusLabel;

    // Add Pokémon button
    @FXML
    protected void onAddButtonClick() {
        String name = nameField.getText();
        String type = typeField.getText();

        if (name.isEmpty() || type.isEmpty()) {
            statusLabel.setText("⚠ Please fill all fields!");
            return;
        }

        // connect to your UD1 model class later (Pokemon.java)
        Pokemon p = new Pokemon(name, type);
        pokemonList.getItems().add(p.toString());
        statusLabel.setText("✅ Added: " + name);

        // clear input fields
        nameField.clear();
        typeField.clear();
    }

    // Clear button
    @FXML
    protected void onClearButtonClick() {
        pokemonList.getItems().clear();
        statusLabel.setText("🗑 List cleared!");
    }
}
