package question2;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class StudentSystem extends JFrame{

    private DefaultTableModel model;
    private JTable studentTable;
    private JTextField aTextField;
    private JTextField bTextField;
	private JTextField cTextField;
	private JTextField dTextField;
    
    public StudentSystem()
    {
        super();
        setTitle("Student Information System");
        setBounds(100,100,1000,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] columnNames = {"Number","first name", "last name", "gender"};   //列名
        String [][]tableVales={{"100", "Divya", "Sharma", "MALE"},{"101", "Mihir", "Salunke", "FEMALE"}}; //数据
        model = new DefaultTableModel(tableVales,columnNames);
        studentTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(studentTable);
        getContentPane().add(scrollPane,BorderLayout.CENTER);

        scrollPane.setViewportView(studentTable);
        final JPanel panel = new JPanel();
        getContentPane().add(panel,BorderLayout.SOUTH);
        panel.add(new JLabel("Student ID: "));
        aTextField = new JTextField("Please input..",10);
        panel.add(aTextField);
        panel.add(new JLabel("First Name: "));
        bTextField = new JTextField("Please input..",10);
        panel.add(bTextField);
        panel.add(new JLabel("Last Name: "));
        cTextField = new JTextField("Please input..",10);
        panel.add(cTextField);
        panel.add(new JLabel("Gender: "));
        dTextField = new JTextField("Please input..",10);
        panel.add(dTextField);
        final JButton addButton = new JButton("ADD");
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String []rowValues = {aTextField.getText(),bTextField.getText(),cTextField.getText(),dTextField.getText()};
                model.addRow(rowValues);
                aTextField.setText("Please input..");
                bTextField.setText("Please input..");
                cTextField.setText("Please input..");
                dTextField.setText("Please input..");
            }
        });
        panel.add(addButton);  
        
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        StudentSystem StudentSystem = new StudentSystem();
        StudentSystem.setVisible(true);
    }

}