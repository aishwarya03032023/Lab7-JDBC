/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;
import util.DatabaseConnector;
/**
 *
 * @author Admin
 */
public class CreateUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateUserPanel
     */
    final JPanel bottomPanel;
    public CreateUserPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        CreateUserForm = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        ageInput = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder());

        CreateUserForm.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CreateUserForm.setForeground(new java.awt.Color(204, 0, 102));
        CreateUserForm.setText("Create User Form");

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setText("Name :");

        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        age.setText("Age :");

        nameInput.setBackground(new java.awt.Color(255, 204, 204));
        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        ageInput.setBackground(new java.awt.Color(255, 204, 204));
        ageInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageInputActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(204, 0, 102));
        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreateUserForm)
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(age))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CreateUserForm)
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>                        

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void ageInputActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        User newUser = new User();
        try{
            String name = nameInput.getText();
            int age = Integer.parseInt(ageInput.getText());
            
            if (name.isEmpty() || name.length() > 26 || !name.matches("^[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "Please enter a Name with: \n1. Length between 1-20 characters. \n2. Chararcters from A...Z or a..z.\n3. No special characters.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }else{
                if (age < 12 || age > 100) {
                    JOptionPane.showMessageDialog(null, "Please enter age between 12 and 100 (both inclusive).", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }else{
                    newUser.setName(name);
                    newUser.setAge(age);
                    DatabaseConnector.addUser(newUser);
                    JOptionPane.showMessageDialog(null, "User Registered successfully.", "Successful Registration", 1);

                }
            }
            
            
            
            } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Fields cannot be Empty.");
        }
        
    }                                      


    // Variables declaration - do not modify                     
    private javax.swing.JLabel CreateUserForm;
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageInput;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameInput;
    private javax.swing.JButton submit;
    // End of variables declaration                   
}

