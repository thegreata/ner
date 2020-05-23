/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.codename1.gui;

import com.codename1.ui.Component;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Ayadi
 */
public class Module1 extends Form {
    
    static Form  currentForm;

    public Module1(Form previous, Resources theme) {
        currentForm=this;
        setTitle("Module 1");
        setLayout(BoxLayout.y());
        
        getToolbar().addCommandToOverflowMenu("Add Module 1", null, ev->{
                AddModule().show();
        });

        getToolbar().addMaterialCommandToLeftBar("back", FontImage.MATERIAL_ARROW_BACK, ev -> {
            previous.showBack();
        });
    }
    
    public Form AddModule()
    {    
        
        
        Form AddModule = new Form("ADD Module 1", new FlowLayout(Component.CENTER, Component.CENTER));
        AddModule.getToolbar().addMaterialCommandToLeftBar("back", FontImage.MATERIAL_ARROW_BACK, ev -> {
             currentForm.showBack();
        });

        return AddModule;
    }
    
}
