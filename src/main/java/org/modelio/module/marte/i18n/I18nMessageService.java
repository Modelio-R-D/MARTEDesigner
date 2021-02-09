package org.modelio.module.marte.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class I18nMessageService {
    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle ("org.modelio.module.marte.i18n.messages");

    private I18nMessageService() {
    }

    public static String getString(String key) {
        try {
            return RESOURCE_BUNDLE.getString (key);
        } catch (@SuppressWarnings ("unused") MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    public static String getString(String key, Object... params) {
        try {
            return MessageFormat.format (RESOURCE_BUNDLE.getString (key), params);
        } catch (@SuppressWarnings ("unused") MissingResourceException e) {
            return '!' + key + '!';
        }
    }

}
