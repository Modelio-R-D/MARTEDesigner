package org.modelio.module.marte.profile.utils;

import java.io.File;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.i18n.I18nMessageService;

/**
 * Allows the messages handling.
 * Get the different message kind : name, error or command name.
 * @author ehouziaux
 */
public class MARTEResourceManager {
    public static String getName(String string) {
        return I18nMessageService.getString(string + ".Name");
    }

    public static String getError(String string) {
        return I18nMessageService.getString(string + ".Error");
    }

    public static String getCommandeLabel(String string) {
        return I18nMessageService.getString(string + ".Label");
    }

    public static String getImage(Stereotype stereotype) {
        return stereotype.getImage();
    }

    public static String getCommandeTooltip(String string) {
        return I18nMessageService.getString(string + ".Tooltip");
    }

    public static String getPropertyName(String string) {
        String propertyName = I18nMessageService.getString("Property." + string + ".Name");
        return propertyName.toUpperCase().substring(0, 1) +  propertyName.substring(1);
    }

    public static String getImageNode() {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator 
                                                        + "MARTEDesigner" + File.separator + "res" + File.separator + "icons" + File.separator + "node.png";
    }

    public static String getImageClass() {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator +
                                                        "MARTEDesigner" + File.separator + "res" + File.separator + "icons" + File.separator + "class.png";
    }

    public static String getImage(String path) {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator + 
                                                        "MARTEDesigner" + File.separator + "res" + File.separator + "icons" + File.separator + path;
    }

    public static String getImageBindableInstance() {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator +
                                                        "MARTEDesigner" + File.separator + "res" + File.separator + "icons" + File.separator + "bindableinstance.png";
    }

    public static String getCommandeSlot(String string) {
        return I18nMessageService.getString(string + ".Slot");
    }

    public static String getBitmap(String string) {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator + 
                                                        "MARTEDesigner" + File.separator + "res" + File.separator + "icons"+ File.separator+ I18nMessageService.getString(string + ".Bitmap");
    }

    public static ImageDescriptor getImageDescriptor(String fileName) {
        return  ImageDescriptor.createFromImage(new Image(Display.getDefault(), getImage(fileName)));
    }

}
