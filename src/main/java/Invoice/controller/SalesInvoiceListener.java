/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Invoice.controller;

import Invoice.model.Invoice;
import Invoice.view.SalesInvoiceFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author sony
 */
public class SalesInvoiceListener implements ActionListener, ListSelectionListener{

    private SalesInvoiceFrame frame;
    public SalesInvoiceListener(SalesInvoiceFrame frame){
        this.frame = frame;
    } 
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionListener");
        String actionComand = e.getActionCommand();
        switch(actionComand){
            case "New In":
                NewIn();
                    break;
            case"Delet In":
                DeletIn();
                break;
            case "New Line":
                NewLine();
                break;
            case"Delet Line":
                DeletLine();
                break;
            case"Load Data":
                LoadData(null, null);
                break;
            case"Save Data":
                SaveData();
                break;
                 
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
         System.out.println("ListSelectionListener");
    }

    private void NewIn() {
    }

    private void DeletIn() {
    }

    private void NewLine() {
    }

    private void DeletLine() {
    }

    public void LoadData(String headerPath, String linePath) {
              File headerFile = null;
              File lineFile = null;
              if(headerPath == null && linePath == null){
              JFileChooser fc = new JFileChooser();
              int result = fc.showOpenDialog (frame) ;
              if (result == JFileChooser.APPROVE_OPTION){
              headerFile = fc.getSelectedFile();
              result = fc.showOpenDialog(frame);
              if(result == JFileChooser.APPROVE_OPTION){
               lineFile = fc.getSelectedFile();
} 
 }
    
}else{
      headerFile = new File(headerPath);
      lineFile = new File(linePath);
              }
      if (headerFile != null && lineFile != null){
          try {
              List<String> headerLines = Files.lines(Paths.get(headerFile.getAbsolutePath())).collect(Collectors.toList());
              List<String> lineLines = Files.lines(Paths.get(lineFile.getAbsolutePath())).collect(Collectors.toList());
              ArrayList<Invoice> invoices = new ArrayList<>();
              
              for (String headerLine : headerLines){
               String[] parts = headerLine.split(",");
               String numString = parts[0];
               String dateString =  parts[1];
               String name = parts[2];
               int num =Integer.parseInt(numString);
               Date date = SalesInvoiceFrame.sdf.parse(dateString);
               Invoice inv = new Invoice(num, name, date);
               invoices.add(inv);
               
              }
              System.out.println("Chech point");
          }catch (Exception ex){
              ex.printStackTrace();
          }
      }
              }

    private void SaveData() {
    }
}

    
    