import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Blob;
import com.mysql.cj.xdevapi.Statement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import modelo.pokemon.Combate;
import modelo.pokemon.Turno;
import modelo.pokemon.EnumEstado;
import modelo.pokemon.Movimiento;
import modelo.pokemon.Pokemon;
import modelo.pokemon.EnumTipo;

public class Prueba extends Application {

    public static void main(String[] args) {
        //launch(args);

        String url = "jdbc:mysql://localhost:3306/pokemon ";
        String login = "root";
        String password = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, login, password);

            System.out.println("Conexión establecida");

            //mostrarPokemon(connection);

            // Pokemon poke = new Pokemon(152, "Chikorita", "Planta", "");

            // insertarPokemon(connection, poke);

            try {
                connection.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../vistas/menuPokemon/pokemonMenu.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}