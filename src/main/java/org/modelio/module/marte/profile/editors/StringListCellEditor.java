package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;

/**
 * This Editor is used to edit a ModelElement multiple dependency field in a dialog box.
 * The editor is opened on a SINGLECLICK.
 * When closing the edition dialog by OK the input is validated otherwise it is canceled.
 */
@objid ("5fa28da2-ab5b-4c94-aa11-48fa2fcbc1ef")
public class StringListCellEditor {
    @objid ("a854006f-4b2f-4b32-a597-3c2472e3eb39")
    private boolean active = false;

    @objid ("54bdcc46-026e-4ebd-ac4d-87bf95cd7a55")
    private String title = "";

    @objid ("26787928-d59d-4100-88e8-dd3b71a57700")
    private String message = "";

    @objid ("27af35d7-a6a9-4e1b-a05a-14e8dcf74623")
    private String detailedMessage = "";

    @objid ("90ace896-ea22-49a3-8704-bb7f4a9c48ce")
    private int size = 0;

    @objid ("aabe8ddb-3e5f-4ead-a82e-0a41031022eb")
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

    @objid ("ef0be22b-b5e7-4275-a4a3-edb8a5fe536c")
    protected TraverseListener travListener = new TraverseListener() {
		public void keyTraversed(TraverseEvent e) {
			// onTraverse(e);
		}
	};

    @objid ("fc332124-7f4f-46a2-8cce-e1f81d2372a3")
    public void closeEditor(boolean save) {
        this.active = false;
        //        super.close(save);
        //        selectNextField();
    }

}
