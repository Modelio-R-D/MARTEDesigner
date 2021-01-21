package org.modelio.module.marte.profile.utils;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("cab274b2-7c2b-49dd-8831-f5e56c934428")
public class MARTEResourceManager {
    @objid ("7ecd5133-a92e-4dcb-8de2-8ccad68b77a5")
    public static String getName(String string) {
        return I18nMessageService.getString(string + ".Name");
    }

    @objid ("8a0546d1-b874-4a01-a4dc-5ede94709bd0")
    public static String getError(String string) {
        return I18nMessageService.getString(string + ".Error");
    }

    @objid ("715874a8-a668-4b63-ab38-ce31652d6225")
    public static String getCommandeLabel(String string) {
        return I18nMessageService.getString(string + ".Label");
    }

    @objid ("7fe0e2e3-5c83-4c5f-a9b5-aff79e43019d")
    public static String getImage(Stereotype stereotype) {
        return stereotype.getImage();
    }

    @objid ("0a6aa692-5231-4099-9288-3e7ab873ce4e")
    public static String getCommandeTooltip(String string) {
        return I18nMessageService.getString(string + ".Tooltip");
    }

    @objid ("ae5e2838-ade3-4fef-9f1b-2256592d0f0a")
    public static String getPropertyName(String string) {
        String propertyName = I18nMessageService.getString("Property." + string + ".Name");
        return propertyName.toUpperCase().substring(0, 1) +  propertyName.substring(1);
    }

    @objid ("46ad0715-84be-4f4e-bd19-e746f821b52a")
    public static String getImageNode() {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator 
                                                        + "MARTEDesigner" + File.separator + "res" + File.separator + "icons" + File.separator + "node.png";
    }

    @objid ("820f86f7-7008-40ee-abb3-93465b82f055")
    public static String getImageClass() {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator +
                                                        "MARTEDesigner" + File.separator + "res" + File.separator + "icons" + File.separator + "class.png";
    }

    @objid ("c006c62b-4eaa-4538-86e2-54f61aa21848")
    public static String getImage(String path) {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator + 
                                                        "MARTEDesigner" + File.separator + "res" + File.separator + "icons" + File.separator + path;
    }

    @objid ("4c4c63a3-b472-48ee-b5d1-36f9307727ee")
    public static String getImageBindableInstance() {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator +
                                                        "MARTEDesigner" + File.separator + "res" + File.separator + "icons" + File.separator + "bindableinstance.png";
    }

    @objid ("a3c71878-ad81-434f-a0aa-8ab4f13a6018")
    public static String getCommandeSlot(String string) {
        return I18nMessageService.getString(string + ".Slot");
    }

    @objid ("b60b1ea2-6639-4c5e-b574-02af70fdb5cc")
    public static String getBitmap(String string) {
        return Modelio.getInstance().getContext().getProjectSpacePath().getAbsolutePath() + File.separator + "mda" + File.separator + 
                                                        "MARTEDesigner" + File.separator + "res" + File.separator + "icons"+ File.separator+ I18nMessageService.getString(string + ".Bitmap");
    }

    @objid ("b309bcef-1e7a-4928-8a63-c823cb6ec1e5")
    public static ImageDescriptor getImageDescriptor(String fileName) {
        return  ImageDescriptor.createFromImage(new Image(Display.getDefault(), getImage(fileName)));
    }

}
