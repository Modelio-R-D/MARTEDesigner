package org.modelio.module.marte.profile.editors;

import java.util.ArrayList;
import org.eclipse.swt.custom.TreeEditor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.ListUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Is an abstract class which provides the different functions to allow the data getting.
 * It allows also the data updating.
 * It gets and updates according to the tag type nature :
 * - boolean > check button
 * - integer, real or String [0..1] > text field
 * - integer, real or String [*] > MultipleValueList
 * - kind [0..1] > combo box
 * - kind [*] > multiple check buttons
 * - model element [0..1] > combo box
 * - model element [*] > AddRemoveList
 * - complex structure > ComplexTree
 * @author ehouziaux
 */
public abstract class CompositeHandle {
    /**
     * Gets beautiful data for a boolean tag type.
     * 
     * @param b is a Button because a boolean is represented by a check button.
     * @return a boolean.
     */
    public boolean getDataBoolean(Button b) {
        boolean result = false;
        if (b.getSelection()) {
            result = true;
        }
        return result;
    }

    /**
     * Gets beautiful data for a single tag type (String).
     * 
     * @param t is a Text because a single data is represented by a text field.
     * @return a String which can be empty.
     */
    public String getDataSingleValue(Text t) {
        return t.getText();
    }

    /**
     * Gets beautiful data for a single tag type (Integer).
     * 
     * @param t is a Text because a single data is represented by a text field.
     * @return a String if the text field contains an integer or is empty, null if the text is not an integer.
     */
    public String getDataSingleValueInteger(Text t) {
        String result = "";
        
        if(ModelUtils.isInteger(t.getText())) {
            result = t.getText();
        }
        return result;
    }

    /**
     * Gets beautiful data for a single tag type (Real).
     * 
     * @param t is a Text because a single data is represented by a text field.
     * @return a String if the text field contains an real or is empty, null if the text is not an real.
     */
    public String getDataSingleValueReal(Text t) {
        String result = null;
        if (ModelUtils.isDouble(t.getText())) {
            result = t.getText();
        }
        return result;
    }

    /**
     * Gets beautiful data for a multiple tag type (Integer).
     * 
     * @param l is the integers list.
     * @return a String table, null if the data are not integers.
     */
    public String[] getDataMultipleValueInteger(org.eclipse.swt.widgets.List l) {
        String[] result = null;
        if (ModelUtils.isInteger(l.getItems())) {
            result = l.getItems();
        }
        return result;
    }

    /**
     * Gets beautiful data for a multiple tag type (Real).
     * 
     * @param l is the reals list.
     * @return a String table, null if the data are not reals.
     */
    public String[] getDataMultipleValueReal(org.eclipse.swt.widgets.List l) {
        String[] result = null;
        if (ModelUtils.isParseableDouble(l.getItems())) {
            result = l.getItems();
        }
        return result;
    }

    /**
     * Gets beautiful data for a multiple tag type (String).
     * 
     * @param l is the string list.
     * @return a String table.
     */
    public String[] getDataMultipleValue(org.eclipse.swt.widgets.List l) {
        String[] result = null;
        result = l.getItems();
        return result;
    }

    /**
     * Gets beautiful data for a multiple tag type (Integer).
     * 
     * @param l is the integers list.
     * @return a String table which can be null is there are not items in the list.
     */
    public String[] getDataMultipleElt(org.eclipse.swt.widgets.List l) {
        String[] result = null;
        result = l.getItems();
        return result;
    }

    /**
     * Gets the name model this.element.
     * 
     * @param c is the combo box which contains the different model elements.
     * @return a String which is the model element or an empty String.
     */
    public String getDataSingleElt(Combo c) {
        return c.getText();
    }

    /**
     * Gets the multiple kinds chosen.
     * 
     * @param bs is the check buttons list.
     * @return a String table which contains the different kinds chosen.
     */
    public String[] getDataMultipleKind(ArrayList<Button> bs) {
        ArrayList<String> res = new ArrayList<>();
        
        for (int i = 0; i <bs.size(); i++) {
            if (bs.get(i).getSelection()) {
                res.add(bs.get(i).getData().toString());
            }
        }
        
        String[] result = res.toArray(new String[res.size()]);
        return result;
    }

    /**
     * Gets the complex data.
     * 
     * @param complex is the tree editor array List<MObject> which contains the different controls which contains the data.
     * @return a String table which contains the complex data.
     */
    public String[] getDataComplex(ArrayList<ArrayList<TreeEditor>> complex) {
        // empty items checking
        // the empty data will be removed.
        ArrayList<ArrayList<TreeEditor>> toDel = new ArrayList<ArrayList<TreeEditor>>();
        for (ArrayList<TreeEditor> l : complex) {
            boolean isEmpty = true;
            for (TreeEditor te : l) {
                if (te.getEditor() instanceof Text) {
                    if (!((Text)te.getEditor()).getText().equals("")) {
                        isEmpty = false;
                    }
                }
                else if (te.getEditor() instanceof Combo) {
                    if (!((Combo)te.getEditor()).getText().equals("")) {
                        isEmpty = false;
                    }
                }
            }
            if(isEmpty) {
                toDel.add(l);
            }
        }
        for (ArrayList<TreeEditor> l : toDel) {
            complex.remove(l);
        }
        
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        
        // string List<MObject> creation
        // the combo and text data are get and added in the result array list.
        for (int i = 0; i < complex.size(); i++) {
            ArrayList<String> tmp = new ArrayList<>();
            for (int j = 0; j < complex.get(i).size(); j++) {
                String data = "";
                if (complex.get(i).get(j).getEditor() instanceof Combo) {
                    data = ((Combo)(complex.get(i).get(j).getEditor())).getText();
                }
                else if (complex.get(i).get(j).getEditor() instanceof Text) {
                    data = ((Text)(complex.get(i).get(j).getEditor())).getText();
                }
                tmp.add(data);
            }
            result.add(tmp);
        }
        
        // String table creation
        String[] beautifulResult = new String[result.size()];
        for (int h = 0; h < result.size(); h++) {
            String tmpString = "";
            for (int m = 0; m < result.get(h).size(); m++) {
                tmpString = tmpString +"<"+result.get(h).get(m)+"> ";
            }
            beautifulResult[h] = tmpString;
            tmpString = "";
        }
        return beautifulResult;
    }

    /**
     * Updates the button with the current tag type value.
     * 
     * @param b is the button to update.
     * @param tagType is the tag type name.
     * @param element is the owner this.element.
     */
    public void updateBoolean(Button b, String tagType, ModelElement element) {
        if (ModelUtils.hasTaggedValue(tagType, element)) {
            b.setSelection(true);
        }
        else {
            b.setSelection(false);
        }
    }

    /**
     * Updates the text field with the current tag type value.
     * 
     * @param t is the text field to update.
     * @param tagType is the tag type name.
     * @param element is the owner this.element.
     */
    public void updateSingleValue(Text t, String tagType, ModelElement element) {
        t.setText(ModelUtils.getTaggedValue(tagType, element));
    }

    /**
     * Updates the List<MObject> with the current tag type values.
     * 
     * @param l is the List<MObject> to update.
     */
    public void updateMultipleValue(org.eclipse.swt.widgets.List l, String tagType, ModelElement element) {
        if(ModelUtils.getMultipleTaggedValue(tagType, element) != null) {
            l.setItems(ModelUtils.getMultipleTaggedValue(tagType, element));
        }
    }

    /**
     * Updates the combo with the current tag type value.
     * @param List<MObject> is the available model elements list.
     * 
     * @param c is the combo to update.
     * @param tagType is the tag type name.
     * @param element is the owner this.element.
     */
    public void updateSingleElement(Combo c, String tagType, ModelElement element, ListUtils list, String stereoDepName) {
        c.setItems(list.getListString());
        c.add("", 0);
        
        if(!ModelUtils.getTaggedValue(tagType, element).equals("") && LinkManager.hasLink(element, stereoDepName)) {
            int ind = c.indexOf(ModelUtils.getTaggedValue(tagType, element));
            c.select(ind);
        }
        else {
            c.select(0);
        }
    }

    /**
     * Updates both add and remove lists with the current tag type values.
     * @param lAdd is the available model elements List<MObject> (GUI).
     * @param lRem is the owner elements list.
     * @param List<MObject> is the available elements list.
     * 
     * @param tagType is the tag type name.
     * @param element is the owner this.element.
     */
    public void updateMultipleElement(AddRemoveList<MObject> l, String tagType, ModelElement element, Class<? extends MObject> extendedClass, String stereoName, String depName) {
        // lists initialization
        String[] availableElt = ModelUtils.searchElement(extendedClass, stereoName).getListString();
        String[] selectedElt = new String[LinkManager.getAllTargets(element, depName).size()];
        
        for (int i = 0; i < LinkManager.getAllTargets(element, depName).size(); i++) {
            selectedElt[i] = ((ModelElement)LinkManager.getAllTargets(element, depName).get(i).getCompositionOwner()).getName()+"::"+LinkManager.getAllTargets(element, depName).get(i).getName();
        }
        
        
        ArrayList<String> newAvailableList = new ArrayList<>();
        for (String s : availableElt) {
            newAvailableList.add(s);
        }
        
        // List<MObject> checking
        for (String s : availableElt) {
            for (String s1 : selectedElt) {
                if (s.equals(s1)) {
                    newAvailableList.remove(s);
                }
            }
        }
        
        String[] r = newAvailableList.toArray(new String[newAvailableList.size()]);
        l.setlAdd(r);
        l.setlRem(selectedElt);
    }

    /**
     * Updates the combo with the current tag type value.
     * @param List<MObject> is the kinds list.
     * 
     * @param c is the combo box.
     * @param tagType is the tag type name.
     * @param element is the owner this.element.
     */
    public void updateSingleKind(Combo c, String tagType, ModelElement element, String[] list) {
        c.setItems(list);
        c.add("", 0);
        int ind = c.indexOf(ModelUtils.getTaggedValue(tagType, element));
        c.select(ind);
    }

    /**
     * Updates the check buttons with the current tag type values.
     * 
     * @param bs is the check buttons list.
     * @param tagType is the tag type name.
     * @param element is the owner this.element.
     */
    public void updateMultipleKind(ArrayList<Button> bs, String tagType, ModelElement element) {
        String[] current = ModelUtils.getMultipleTaggedValue(tagType, element);
        if (current != null) {
            for (String s : current) {
                for (Button b : bs) {
                    if ((b.getData().toString()+" ").equals(s)) {
                        b.setSelection(true);
                    }
                }
            }
        }
    }

}
