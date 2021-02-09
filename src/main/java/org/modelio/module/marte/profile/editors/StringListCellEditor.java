package org.modelio.module.marte.profile.editors;

import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;

/**
 * This Editor is used to edit a ModelElement multiple dependency field in a dialog box.
 * The editor is opened on a SINGLECLICK.
 * When closing the edition dialog by OK the input is validated otherwise it is canceled.
 */
public class StringListCellEditor {
    private boolean active = false;

    private String title = "";

    private String message = "";

    private String detailedMessage = "";

    private int size = 0;

    protected KeyAdapter keyListener = new KeyAdapter() {
		
		@Override
		public void keyPressed(KeyEvent e) {
			try {
//				onKeyPressed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
				// Do nothing
			}
		}
	};

    protected TraverseListener travListener = new TraverseListener() {
		public void keyTraversed(TraverseEvent e) {
			// onTraverse(e);
		}
	};

    public void closeEditor(boolean save) {
        this.active = false;
        //        super.close(save);
        //        selectNextField();
    }

}
