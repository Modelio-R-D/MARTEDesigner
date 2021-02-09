package org.modelio.module.marte.profile.editors;


/**
 * Is the dialog page interface.
 * It provides both refresh and setActive functions.
 * @author ehouziaux
 */
public interface IDialogPage {
    /**
     * Provides the page refreshing.
     */
    void refresh();

    /**
     * Sets  the active status.
     * 
     * @param activity is the new activity.
     */
    void setActive(boolean activity);

}
