package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.List;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * Provides a useful List<MObject> to handle the model elements lists.
 * @author ehouziaux
 */
public class ListUtils {
    private String[] listString;

    private List<ModelElement> listElement;

    public ListUtils() {
        this.listString = new String[]{};
        this.listElement = new ArrayList<>();
    }

    public ListUtils(String[] listString, List<ModelElement> listElement) {
        this.listString = listString;
        this.listElement = listElement;
        // DEBUG Modelio.out.println("ListUtils, size List<MObject> elt : "+listElement.size()+", size List<MObject> string : "+listString.length);
    }

    public String[] getListString() {
        return listString;
    }

    public void setListString(String[] listString) {
        this.listString = listString;
    }

    public List<ModelElement> getListElement() {
        return listElement;
    }

    public void setListElement(List<ModelElement> listElement) {
        this.listElement = listElement;
    }

    public ModelElement elementAt(int i) {
        return listElement.get(i);
    }

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
