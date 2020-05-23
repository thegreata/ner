/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.codename1.gui;

import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import edu.codename1.entities.Session;
import edu.codename1.entities.user;

/**
 *
 * @author Ayadi
 */
public class home extends Form{
    
    
     static Form current;
    user User=Session.getCurrentSession();
    public home(Form previous, Resources theme) {
        current = this; //Récupérsation de l'interface(Form) en cours
  
        setTitle(User.getRoles());
        setLayout(BoxLayout.y());
        
       

        getToolbar().addCommandToSideMenu("Home", null, ev -> {

        }
        );
        
        
        getToolbar().addCommandToSideMenu("Module1", null, ev -> {
            new Module1(current, theme).showBack();

        });


        getToolbar().addMaterialCommandToSideMenu("Logout", FontImage.MATERIAL_EXIT_TO_APP, ev -> {
            try {
                Session.close();
            } catch (Exception ex) {
                ex.getMessage();
            }
            previous.showBack();
        });

    }
    
}
