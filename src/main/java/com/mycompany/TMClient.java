/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
/**
 *
 * @author esmer
 */
public class TMClient implements TableModel{
    
    private List<Client> clients;
    
    public TMClient(List<Client> list) {
        clients = list;
    }
    
    @Override
    public int getRowCount() {
        return clients.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        
        String title = null;
        
        switch(columnIndex){
            case 0:
                title = "ID";
                break;
            case 1:
                title = "Name";
                break;
            case 2:
                title = "Surname";
                break;
            case 3:
                title = "Direction";
                break;
            case 4:
                title = "Mail";
                break;
            case 5:
                title = "Phone";
                break;
        }
        
        return title;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client c = clients.get(rowIndex);
        String val = null;
        switch(columnIndex){
            case 0:
                val = c.getId();
                break;
            case 1:
                val = c.getName();
                break;
            case 2:
                val = c.getSurname();
                break;
            case 3:
                val = c.getDirection();
                break;
            case 4:
                val = c.getMail();
                break;
            case 5:
                val = c.getPhone();
                break;
        }
        
        return val;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Client c = clients.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                c.setId(aValue.toString());
                break;
            case 1:
                c.setName(aValue.toString());
                break;
            case 2:
                c.setSurname(aValue.toString());
                break;
            case 3:
                c.setDirection(aValue.toString());
                break;
            case 4:
                c.setMail(aValue.toString());
                break;
            case 5:
                c.setPhone(aValue.toString());
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
    
}
