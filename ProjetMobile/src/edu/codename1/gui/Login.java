/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.codename1.gui;

import com.codename1.components.ImageViewer;
import com.codename1.facebook.User;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;
import edu.codename1.entities.Session;
import edu.codename1.entities.user;
import edu.codename1.services.ServicesUsers;

/**
 *
 * @author Ayadi
 */
public class Login extends Form {

    Form current;
    private static user User;

    public Login(Resources theme) {
        current = this; //Récupérsation de l'interface(Form) en cours
        setTitle("My Project");
        setLayout(new FlowLayout(Component.CENTER, Component.CENTER));
        ImageViewer imageName = new ImageViewer(theme.getImage("gestudent.png"));
        Container cnt = new Container(BoxLayout.y());

        TextField username = new TextField(null, "username");
        TextField password = new TextField(null, "password");
        
        password.setConstraint(TextField.PASSWORD);

        Button login = new Button("login");

        cnt.add(imageName);
        cnt.add(username);
        cnt.add(password);
        cnt.add(login);
        add(cnt);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                {

                    User = ServicesUsers.getInstance().Login(username.getText(), password.getText());
                    if (User != null) {

                        username.setText("");
                        password.setText("");
                        Session.start(User);

                            new home(current, theme).show();
                        
                    } else {
                        Dialog.show("Alert", "Invalid password or username", "OK", null);
                    }

                }

            }
        });

    }

}
