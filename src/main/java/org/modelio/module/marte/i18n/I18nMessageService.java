package org.modelio.module.marte.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1270dd6d-04bf-4e45-9f63-81216b34d8a2")
public class I18nMessageService {
    @objid ("68d6573c-c9d6-4f65-a407-de9aeb900f98")
    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle ("org.modelio.module.marte.i18n.messages");

    @objid ("ec6b953b-95bc-4875-80ce-9e699d010b29")
    private I18nMessageService() {
    }

    @objid ("1eb483fe-5c1e-4ba7-9000-84c920d5f9ad")
    public static String getString(String key) {
        try {
            return RESOURCE_BUNDLE.getString (key);
        } catch (@SuppressWarnings ("unused") MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    @objid ("b2701330-5575-47f4-8f54-f5ac0411c3ee")
    public static String getString(String key, Object... params) {
        try {
            return MessageFormat.format (RESOURCE_BUNDLE.getString (key), params);
        } catch (@SuppressWarnings ("unused") MissingResourceException e) {
            return '!' + key + '!';
        }
    }

}
