package viewer;

import javax.swing.*;

public class SQLiteViewer extends JFrame {

    public SQLiteViewer() {
        super("SQLite Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 900);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        initApp();
        setVisible(true);
    }

    private void initApp() {
        int textField_tail = 200;

        JTextField textField = new JTextField();
        textField.setName("FileNameTextField");
        textField.setBounds(5, 20, getWidth() -textField_tail, 30);
        add(textField);

        JButton openButton = new JButton("Open");
        openButton.setName("OpenFileButton");
        openButton.setBounds(getWidth() -textField_tail + 15, 20, 100, 30);
        add(openButton);
    }
}
