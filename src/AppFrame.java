

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame {
        public AppFrame() {
            setLayout(new BorderLayout());
                    JButton btnUI = new JButton("Check UI");
                    JButton btnFibonacci = new JButton("Calculate Fibonacci");
                    JButton btnFactorial = new JButton("Calculate Factorial");
                    JButton restartButton = new JButton("reiniciar");

                    btnUI.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println("UI is working");
                        }
                    });
                    btnFibonacci.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            new Thread(() -> {
                                System.out.println("Fibonacci result: " + Calculos.fibonacci(47));
                            }).start();
                        }
                    });

                    btnFactorial.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            new Thread(() -> {
                                System.out.println("Factorial result: " + Calculos.factorial(50));
                            }).start();
                        }
                    });


                    JPanel panelButtons = new JPanel();
                    panelButtons.setLayout(new FlowLayout());
                    panelButtons.add(btnUI);
                    panelButtons.add(btnFibonacci);
                    panelButtons.add(btnFactorial);
                    panelButtons.add(restartButton);


                    SnakeGame snakeGame = new SnakeGame();

                    add(panelButtons, BorderLayout.NORTH);
                    add(snakeGame, BorderLayout.CENTER);

                    setSize(800, 600);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(true);
                }
            }

