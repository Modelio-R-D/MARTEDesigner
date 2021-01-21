package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Is the dialog page interface.
 * It provides both refresh and setActive functions.
 * @author ehouziaux
 */
@objid ("2523802c-fd66-4a2b-b274-693c6a81b81b")
public interface IDialogPage {
    /**
     * Provides the page refreshing.
     */
    @objid ("ed37e6cf-0fd7-41cb-aa91-72e278f58bb3")
    void refresh();

    /**
     * Sets  the active status.
     * 
     * @param activity is the new activity.
     */
    @objid ("5699f06f-f22c-4d08-87e3-ddcfb52a0ae0")
    void setActive(boolean activity);

}
