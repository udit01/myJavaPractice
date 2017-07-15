package blockBreakerGame;

import javax.swing.*;

/**
 * Created by udit01 on 16/7/17.
 */
public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Block Breaker");

        BlockBreakerPanel panel = new BlockBreakerPanel();

        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setSize(490,600);

        frame.setResizable(false);
    }
}
