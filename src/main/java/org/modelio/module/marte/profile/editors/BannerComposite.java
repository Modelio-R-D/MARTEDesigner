package org.modelio.module.marte.profile.editors;

import java.io.File;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.modelio.api.modelio.Modelio;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;

/**
 * Provides a beautiful Modelio banner.
 * It is used for the properties frame.
 * @author ehouziaux
 */
public class BannerComposite extends Composite {
    private StyledText text;

    private Label label;

    /**
     * Constructs a beautiful Modelio banner.
     * 
     * @param parent is the parent Composite.
     * @param style is the used SWT style.
     */
    public BannerComposite(Composite parent, int style) {
        super(parent, style);
        
        IMARTEDesignerPeerModule module = (IMARTEDesignerPeerModule) Modelio.getInstance().getModuleService().getPeerModule(IMARTEDesignerPeerModule.class);
        
        setLayout(new FormLayout());
        
        // banner
        String icon = module.getConfiguration().getModuleResourcesPath() + File.separator + "bandeau.png";
        Image image = new Image(null, icon);
        label = new Label(this, SWT.NONE);
        label.setImage(image);
        
        String description = "nothing";
        String title = "nothing";
        
        final FormData fd_label = new FormData();
        fd_label.left = new FormAttachment(0, 0);
        fd_label.top = new FormAttachment(0, 0);
        label.setLayoutData(fd_label);
        
        
        text = new StyledText(this, SWT.NONE);
        text.setEnabled(false);
        String theTitle = "\n" + title + "\n";
        String htmlText = theTitle + description;
        text.setText(htmlText);
        
        StyleRange style1 = new StyleRange();
        style1.start = 0;
        style1.length = theTitle.length();
        style1.fontStyle = SWT.BOLD;
        style1.foreground = new Color(null, 96, 171, 171);
        text.setStyleRange(style1);
        
        StyleRange style2 = new StyleRange();
        style2.start = theTitle.length();
        style2.length = description.length();
        style2.fontStyle = SWT.ITALIC;
        style2.foreground = new Color(null, 160, 160, 160);
        text.setStyleRange(style2);
        
        final FormData fd_text = new FormData();
        fd_text.left = new FormAttachment(label, 0);
        fd_text.top = new FormAttachment(0, 0);
        fd_text.right = new FormAttachment(100, 0);
        fd_text.bottom = new FormAttachment(0, 55);
        text.setLayoutData(fd_text);
    }

    /**
     * Sets the banner text.
     * 
     * @param title is the banner title.
     * @param description is the banner description.
     */
    public void setText(String title, String description) {
        String theTitle = title + "\n";
        String htmlText = theTitle + description;
        text.setText(htmlText);
        
        StyleRange style1 = new StyleRange();
        style1.start = 0;
        style1.length = theTitle.length();
        style1.fontStyle = SWT.BOLD;
        style1.foreground = new Color(null, 96, 171, 171);
        text.setStyleRange(style1);
        
        StyleRange style2 = new StyleRange();
        style2.start = theTitle.length();
        style2.length = description.length();
        style2.fontStyle = SWT.ITALIC;
        style2.foreground = new Color(null, 160, 160, 160);
        text.setStyleRange(style2);
        
        final FormData fd_text = new FormData();
        fd_text.left = new FormAttachment(label, 0);
        fd_text.top = new FormAttachment(0, 0);
        fd_text.right = new FormAttachment(100, 0);
        fd_text.bottom = new FormAttachment(0, 55);
        text.setLayoutData(fd_text);
    }

}
