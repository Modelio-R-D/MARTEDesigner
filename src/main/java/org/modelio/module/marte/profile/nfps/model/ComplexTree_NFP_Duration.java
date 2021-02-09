package org.modelio.module.marte.profile.nfps.model;

import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.ComplexTree;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ComplexTree_NFP_Duration extends ComplexTree {
    private String tagType;

    public ComplexTree_NFP_Duration(String tagType) {
        this.tagType = tagType;
    }

    @Override
    public void addItem() {
        createItem(tagType);
        createSubText("clock");
        createSubText("precision");
        createSubText("worst");
        createSubText("best");
        createSubCombo("unit", new String[]{"s", "tick", "ms", "us", "min", "hr", "day"});
    }

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
