package com.example.cyc;

import javax.swing.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebView;
import javafx.scene.Scene;

public class App extends JFrame implements Runnable {
    private JFXPanel panel;

    public void run() {
        setTitle("Cyclone");
        setBounds(0, 0, 1950, 1050);
        setVisible(true);

        panel = new JFXPanel();
        add(panel);
        Platform.runLater(() -> {
            WebView view = new WebView();
            view.getEngine().load("https://duckduckgo.com/");

            panel.setScene(new Scene(view));
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new App());
    }
}
