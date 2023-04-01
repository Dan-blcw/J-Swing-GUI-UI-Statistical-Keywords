package searchWord;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridLayout;
// import java.awt.BorderLayout;


public class searchView extends JFrame{
    private searchModel srModel;
    private JTextArea jTextAreaParagrah;
    private JTextField jTextFieldKeyWord;
    private JLabel jLabel_Result;

    public searchView(){
        this.srModel = new searchModel();
        this.inIt();
    }
    public void inIt(){
//        this.setTitle("Search word");
        this.setSize(700,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        Font font = new Font("sansserif", 1, 16);
        Font font_B = new Font("sansserif",Font.BOLD,28);
        Controller_sr  sr = new Controller_sr(this);

        JLabel jLabelWord = new JLabel("Paragraph");
        jLabelWord.setFont(font_B);
        jTextAreaParagrah = new JTextArea(10,10);
        jTextAreaParagrah.setFont(font);

        JScrollPane jScrollPane = new JScrollPane(jTextAreaParagrah);

        JButton jButton_statistical = new JButton("Statistical");
        jButton_statistical.setFont(font);
        jButton_statistical.addActionListener(sr);
        jButton_statistical.setBackground(Color.WHITE);
        jLabel_Result = new JLabel();
        jLabel_Result.setFont(font);
        
        JPanel jPanelFooter = new JPanel();
        jPanelFooter.setLayout(new GridLayout(2,1,10,10));
        JLabel jLabelKeyWord = new JLabel("Key Word");
        jLabelKeyWord.setBounds(31, 628, 89, 42);
        jLabelKeyWord.setFont(font_B);
        jTextFieldKeyWord = new  JTextField();
        jTextFieldKeyWord.setFont(font);
        jTextFieldKeyWord.setColumns(10);
        
        jPanelFooter.add(jLabelKeyWord);
        jPanelFooter.add(jTextFieldKeyWord);
        jPanelFooter.add(jButton_statistical);
        jPanelFooter.add(jLabel_Result);
        	
        this.setLayout(new BorderLayout());
        this.add(jLabelWord, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanelFooter,BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    public void countWord(){
        this.srModel.setWoRd(jTextAreaParagrah.getText());
        this.srModel.setkeyWord(jTextFieldKeyWord.getText());
        this.srModel.countWord();
        this.jLabel_Result.setText(this.srModel.getReSult()+"");
    }

}
