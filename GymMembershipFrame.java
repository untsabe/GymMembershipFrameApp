/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author Umenelisi
 */
public class GymMembershipFrame extends JFrame{
    
    private JPanel headingpn1;
    private JPanel clientpn2;
    private JPanel namepm3;
    private JPanel surnamepn;
    private JPanel Idno;
    private JPanel gender;
    private JPanel contractOptions;
    private JPanel contractType;
    private JPanel personalTrainer;
    private JPanel commentspn;
    private JPanel buttonspn;
    private JPanel headingAndClientpn;
    private JPanel contractTypeAndComments;
    private JPanel mainpn;
    
    
    // create lables 
    private JLabel headinglb;
    private JLabel namelb;
    private JLabel surnamelb;
    private JLabel idnolb;
    private JLabel genderlb;
    private JLabel personalTrainerlb;
    private JLabel contractTypelb;
    
   
    //creatw Textfields
    private JTextField nametfld;
    private JTextField surnametfld;
    private JTextField idnotfld;
    
    // create combo box 
    
    private JComboBox genderComboBox;
    
    //radiobuttons
    
    private JRadioButton monthlyRadiobtn;
    private JRadioButton sixMonthRadiobtn;
    private JRadioButton annualradiobtn;
    
    //check box
    
    private JCheckBox personalTrainerchckbox;
    
    //buttonGroup
    
    private ButtonGroup buttongroup;
    
    // text Area
    
    private JTextArea commentsArea;
    
    //Scrollpane
    private JScrollPane scrollableTextarea;
    
    private JButton applybtn;

    public GymMembershipFrame()
    {
        setTitle("Gym memberShip");
        setSize(400,400);
     
        setDefaultCloseOperation(GymMembershipFrame.EXIT_ON_CLOSE);
        //create panels 
        headingpn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientpn2= new JPanel(new GridLayout(4,1,1,1));
        clientpn2.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client detatils"));
        
        namepm3= new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamepn=new JPanel(new FlowLayout(FlowLayout.LEFT));
        Idno = new JPanel(new FlowLayout(FlowLayout.LEFT));
        gender = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractType = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainer = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractOptions = new JPanel(new GridLayout(2,1,1,1));
        contractOptions.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Contract Options"));
        
        commentspn= new JPanel(new FlowLayout(FlowLayout.CENTER));
        commentspn.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1),"Comments"));
        
        buttonspn= new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        headingAndClientpn = new JPanel(new BorderLayout());
        contractTypeAndComments= new JPanel(new BorderLayout());
        mainpn= new JPanel(new BorderLayout());
        
        
        // create lables 
        headinglb= new JLabel("Memberhip Form");
        headinglb.setFont(new Font(Font.SANS_SERIF,Font.BOLD+Font.ITALIC,20));
        headinglb.setForeground(Color.blue);
        headinglb.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        namelb= new JLabel("name:        ");
        surnamelb = new JLabel("surname:   ");
        idnolb= new JLabel("Idno:          ");
        genderlb= new JLabel("Gender:     ");
        contractTypelb = new JLabel("Type Contact: ");
        personalTrainerlb = new JLabel("select the check  box if you need  a personal trainer ");
        
        // text fields 
        
        nametfld = new JTextField(10);
        surnametfld= new JTextField(10);
        idnotfld = new JTextField(10);
        //ComboBox
        genderComboBox = new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        
        // radio buttons
           monthlyRadiobtn= new JRadioButton("month -to-month");
           sixMonthRadiobtn= new JRadioButton("sixMonths");
           annualradiobtn= new JRadioButton("Annual");
           
           // CheckBox
           
           personalTrainerchckbox= new JCheckBox();
           
           // group button
           
           buttongroup = new ButtonGroup();
           buttongroup.add(monthlyRadiobtn);
           buttongroup.add(sixMonthRadiobtn);
           buttongroup.add(annualradiobtn);
           
           // create textArea
            
           commentsArea = new JTextArea(20,40);
           commentsArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "commets"));
           
           scrollableTextarea= new JScrollPane(commentsArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            
           // ceate Button
           
           applybtn = new JButton("Apply");
           
           
           // add components to panels
           
           headingpn1.add(headinglb);
           
           namepm3.add(namelb);
           namepm3.add(nametfld);
           
           surnamepn.add(surnamelb);
           surnamepn.add(surnametfld);
           
           Idno.add(idnolb);
           Idno.add(idnotfld);
           
           gender.add(genderlb);
           gender.add(genderComboBox);
           
           clientpn2.add(namepm3);
           clientpn2.add(surnamepn);
           clientpn2.add(Idno);
           clientpn2.add(gender);
           
           headingAndClientpn.add(headingpn1,BorderLayout.NORTH);
           headingAndClientpn.add(clientpn2,BorderLayout.CENTER);
           
           contractType.add(contractTypelb);
           contractType.add(monthlyRadiobtn);
           contractType.add(sixMonthRadiobtn);
           contractType.add(annualradiobtn);
           
           
           personalTrainer.add(personalTrainerlb);
           personalTrainer.add(personalTrainerchckbox);
           
           
           
           contractOptions.add(contractType);
           contractOptions.add(personalTrainer);
           
           
           commentspn.add(scrollableTextarea);
           
           contractTypeAndComments.add(contractOptions,BorderLayout.NORTH);
           contractTypeAndComments.add(commentspn,BorderLayout.CENTER);
           
           buttonspn.add(applybtn);
           
           mainpn.add(headingAndClientpn,BorderLayout.NORTH);
           mainpn.add(contractTypeAndComments,BorderLayout.CENTER);
  
           mainpn.add(buttonspn,BorderLayout.SOUTH);
           
           add(mainpn);
           
           pack();
           setVisible(true);
           
           
        
        
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
