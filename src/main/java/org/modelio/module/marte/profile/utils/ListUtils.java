package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * Provides a useful List<MObject> to handle the model elements lists.
 * @author ehouziaux
 */
@objid ("970ef41b-335b-4772-9510-a8e88d1c12e4")
public class ListUtils {
    @objid ("235f3aa1-aab5-41e3-9d4c-99cf4c1b5f80")
    private String[] listString;

    @objid ("65839064-b89a-49d2-8efa-203f038a4c70")
    private List<ModelElement> listElement;

    @objid ("ca5d689f-224a-419e-bd53-365f7f597161")
    public ListUtils() {
        this.listString = new String[]{};
        this.listElement = new ArrayList<>();
    }

    @objid ("04a4c704-cefd-4bba-af45-ddbc63736af1")
    public ListUtils(String[] listString, List<ModelElement> listElement) {
        this.listString = listString;
        this.listElement = listElement;
        // DEBUG Modelio.out.println("ListUtils, size List<MObject> elt : "+listElement.size()+", size List<MObject> string : "+listString.length);
    }

    @objid ("d53f19b0-3bf6-496f-95d0-29f377d65750")
    public String[] getListString() {
        return listString;
    }

    @objid ("9d01041e-399a-4415-8930-278a766b4e1d")
    public void setListString(String[] listString) {
        this.listString = listString;
    }

    @objid ("4794b90c-19aa-4406-9d39-fedecead9891")
    public List<ModelElement> getListElement() {
        return listElement;
    }

    @objid ("0a523dde-ae3d-4b1a-9267-29bef23ecc62")
    public void setListElement(List<ModelElement> listElement) {
        this.listElement = listElement;
    }

    @objid ("c41422a8-cd12-42dd-9f96-8a8588935e76")
    public ModelElement elementAt(int i) {
        return listElement.get(i);
    }

    @objid ("1975efdb-1e53-4abb-8944-73fae0ce57b8")
    public int index(String name) {
        int ind = 0;
        int result = -1;
        for (String s : listString) {
           // DEBUG Modelio.out.print("ListUtils, Strings du tableau de string : "+s);
            if (s.equals(name)) {
                result = ind;
            }
            ind =+1;
        }
        return result;
    }

    @objid ("6c64dd0d-0d4d-4d3c-81d6-19c89835cb36")
    public ModelElement getElementOfName(String name) {
        ModelElement result;
        int indElt = -1;
        
        for (int i=0; i<listString.length;i++) {
            String s = listString[i];
            if (s.equals(name)) {
                indElt = i;
            }
        }
        
        if (indElt != -1) {
            result = listElement.get(indElt);
        }
        else {
            result = null;
        }
        return result;
    }

}
