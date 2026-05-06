package co.edu.uniquindio.inventarioObserver;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa la interfaz gráfica para visualizar un Árbol Binario de Búsqueda (BST).
 * Permite interactuar con el árbol mediante operaciones como insertar, eliminar,
 * buscar (animado), recorrer y visualizar información del árbol.
 */
public class ArbolGrafico extends JFrame {

    /** Estructura de datos del árbol binario */
    private ArbolBinario arbol = new ArbolBinario();

    /** Campo de texto para ingresar datos */
    private JTextField txtDato = new JTextField(5);

    /** Área de salida para mostrar resultados */
    private JTextArea txtSalida = new JTextArea(5, 50);

    /** Panel donde se dibuja el árbol */
    private JPanel panelDibujo;

    /**
     * Constructor que inicializa la interfaz gráfica,
     * componentes, botones y eventos.
     */
    public ArbolGrafico() {
        setTitle("BST - Visualizador");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(900, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel pnlControl = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton btnAdd = new JButton("Agregar");
        JButton btnDelete = new JButton("Eliminar");
        JButton btnSearch = new JButton("Buscar (Animado)");
        JButton btnIn = new JButton("Inorden");
        JButton btnPre = new JButton("Preorden");
        JButton btnPost = new JButton("Postorden");
        JButton btnInfo = new JButton("Ver Info");
        JButton btnClear = new JButton("Borrar Árbol");

        pnlControl.add(new JLabel("Dato:"));
        pnlControl.add(txtDato);
        pnlControl.add(btnAdd);
        pnlControl.add(btnDelete);
        pnlControl.add(btnSearch);
        pnlControl.add(btnIn);
        pnlControl.add(btnPre);
        pnlControl.add(btnPost);
        pnlControl.add(btnInfo);
        pnlControl.add(btnClear);

        add(pnlControl, BorderLayout.NORTH);

        /**
         * Panel personalizado donde se dibuja el árbol.
         */
        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (arbol.raiz != null) {
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    int x = getWidth() / 2;
                    int y = 50;
                    int esp = getWidth() / 4;

                    dibujarLineas(g2, arbol.raiz, x, y, esp);
                    dibujarNodos(g2, arbol.raiz, x, y, esp);
                }
            }
        };

        panelDibujo.setBackground(Color.WHITE);
        JScrollPane scroll = new JScrollPane(panelDibujo);
        add(scroll, BorderLayout.CENTER);

        txtSalida.setEditable(false);
        txtSalida.setBackground(new Color(245, 245, 245));
        add(new JScrollPane(txtSalida), BorderLayout.SOUTH);

        /**
         * Acción para agregar un nodo.
         */
        btnAdd.addActionListener(e -> {
            try {
                arbol.agregar(Integer.parseInt(txtDato.getText()));
                arbol.resetColores(arbol.raiz);
                txtDato.setText("");

                actualizarTamanoPanel();
                repaint();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Número no válido");
            }
        });

        /**
         * Acción para buscar un nodo con animación.
         */
        btnSearch.addActionListener(e -> {
            try {
                animarBusqueda(Integer.parseInt(txtDato.getText()));
            } catch (Exception ex) {}
        });

        /**
         * Acción para eliminar un nodo.
         */
        btnDelete.addActionListener(e -> {
            try {
                arbol.eliminar(Integer.parseInt(txtDato.getText()));
                actualizarTamanoPanel();
                repaint();
            } catch (Exception ex) {}
        });

        /** Acciones de recorridos */
        btnIn.addActionListener(e -> txtSalida.setText("Inorden: " + arbol.recorrido("Inorden")));
        btnPre.addActionListener(e -> txtSalida.setText("Preorden: " + arbol.recorrido("Preorden")));
        btnPost.addActionListener(e -> txtSalida.setText("Postorden: " + arbol.recorrido("Postorden")));

        /**
         * Muestra información general del árbol.
         */
        btnInfo.addActionListener(e -> {
            if (arbol.estaVacio()) {
                txtSalida.setText("Árbol vacío");
                return;
            }
            txtSalida.setText(
                    "Altura: " + arbol.obtenerAltura() +
                            "\nNodos: " + arbol.obtenerPeso() +
                            "\nHojas: " + arbol.contarHojas() +
                            "\nMenor: " + arbol.obtenerMenor() +
                            "\nAmplitud: " + arbol.recorrido("Amplitud")
            );
        });

        /**
         * Borra completamente el árbol.
         */
        btnClear.addActionListener(e -> {
            arbol.borrarArbol();
            actualizarTamanoPanel();
            repaint();
            txtSalida.setText("");
        });
    }

    /**
     * Ajusta dinámicamente el tamaño del panel según el árbol.
     */
    private void actualizarTamanoPanel() {
        int altura = arbol.obtenerAltura();

        int alto = Math.max(600, altura * 120);
        int ancho = Math.max(1200, arbol.obtenerPeso() * 80);

        panelDibujo.setPreferredSize(new Dimension(ancho, alto));
        panelDibujo.revalidate();
    }

    /**
     * Dibuja las líneas entre nodos del árbol.
     */
    private void dibujarLineas(Graphics2D g2, Nodo n, int x, int y, int esp) {
        if (n == null) return;

        int vertical = 100;

        if (n.izquierdo != null) {
            int hijoX = x - esp;
            int hijoY = y + vertical;
            g2.drawLine(x, y, hijoX, hijoY);
            dibujarLineas(g2, n.izquierdo, hijoX, hijoY, esp / 2);
        }

        if (n.derecho != null) {
            int hijoX = x + esp;
            int hijoY = y + vertical;
            g2.drawLine(x, y, hijoX, hijoY);
            dibujarLineas(g2, n.derecho, hijoX, hijoY, esp / 2);
        }
    }

    /**
     * Dibuja los nodos del árbol.
     */
    private void dibujarNodos(Graphics2D g2, Nodo n, int x, int y, int esp) {
        if (n == null) return;

        n.x = x;
        n.y = y;

        int vertical = 100;

        if (n.izquierdo != null)
            dibujarNodos(g2, n.izquierdo, x - esp, y + vertical, esp / 2);

        if (n.derecho != null)
            dibujarNodos(g2, n.derecho, x + esp, y + vertical, esp / 2);

        int radio = 20;

        g2.setColor(n.colorActual);
        g2.fillOval(x - radio, y - radio, radio * 2, radio * 2);

        g2.setColor(Color.BLACK);
        g2.drawOval(x - radio, y - radio, radio * 2, radio * 2);

        g2.setColor(Color.WHITE);
        String txt = String.valueOf(n.dato);
        FontMetrics fm = g2.getFontMetrics();
        g2.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getAscent() / 2 - 2);
    }

    /**
     * Realiza una búsqueda animada en el árbol.
     * Resalta los nodos visitados y marca en verde el encontrado.
     *
     * @param valor valor a buscar
     */
    private void animarBusqueda(int valor) {
        arbol.resetColores(arbol.raiz);

        Timer timer = new Timer(600, null);
        final Nodo[] actual = {arbol.raiz};

        timer.addActionListener(e -> {
            if (actual[0] == null) {
                txtSalida.setText("Dato " + valor + " no encontrado.");
                timer.stop();
            } else {
                actual[0].colorActual = Color.ORANGE;
                repaint();

                if (actual[0].dato == valor) {
                    actual[0].colorActual = Color.GREEN;
                    txtSalida.setText("¡Dato " + valor + " encontrado!");
                    repaint();
                    timer.stop();
                } else if (valor < actual[0].dato) {
                    actual[0] = actual[0].izquierdo;
                } else {
                    actual[0] = actual[0].derecho;
                }
            }
        });

        timer.start();
    }

    /**
     * Método principal que ejecuta la aplicación.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ArbolGrafico().setVisible(true));
    }
}