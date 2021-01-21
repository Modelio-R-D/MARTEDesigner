package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.ComplexTree;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6c0064a2-5a3e-459f-a9a4-e1a343022234")
public class ComplexTree_NFP_Duration extends ComplexTree {
    @objid ("f9dd4048-f9a3-4c4e-8d17-481b060b9dad")
    private String tagType;

    @objid ("c56e652a-0cda-4eed-bf24-3433f16621aa")
    public ComplexTree_NFP_Duration(String tagType) {
        this.tagType = tagType;
    }

    @objid ("4d2917b3-6fbe-47d7-a32b-326423cf4993")
    @Override
    public void addItem() {
        createItem(tagType);
        createSubText("clock");
        createSubText("precision");
        createSubText("worst");
        createSubText("best");
        createSubCombo("unit", new String[]{"s", "tick", "ms", "us", "min", "hr", "day"});
    }

    @objid ("e1196b39-99b1-42c1-b28a-cff42f50b512")
    public void update(ComplexTree c, String tagType, ModelElement element) {
        if (ModelUtils.getMultipleTaggedValue(tagType, element) != null) {
            for (String s : ModelUtils.getMultipleTaggedValue(tagType, element)){
        
                if (ModelUtils.evaluateComplexString(s, 5) != null) {
                    String[] values = ModelUtils.evaluateComplexString(s, 5);
                    c.addItem();
                    c.getListText().get(c.getListText().size()-4).setText(values[0]);
                    c.getListText().get(c.getListText().size()-3).setText(values[1]);
                    c.getListText().get(c.getListText().size()-2).setText(values[2]);
                    c.getListText().get(c.getListText().size()-1).setText(values[3]);
                    
                    int ind = c.getListCombo().get(c.getListCombo().size()-1).indexOf(values[4]);
                    c.getListCombo().get(c.getListCombo().size()-1).select(ind);
                }
        
            }
        }
    }

}
