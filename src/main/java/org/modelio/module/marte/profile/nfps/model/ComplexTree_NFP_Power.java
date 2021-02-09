package org.modelio.module.marte.profile.nfps.model;

import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.ComplexTree;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ComplexTree_NFP_Power extends ComplexTree {
    private String tagType;

    public ComplexTree_NFP_Power(String tagType) {
        this.tagType = tagType;
    }

    @Override
    public void addItem() {
        createItem(tagType);
        createSubText("precision");
        createSubCombo("unit", new String[] {"W", "mW", "kW"});
    }

    @Override
    public void update(ComplexTree c, String tagType, ModelElement element) {
        if (ModelUtils.getMultipleTaggedValue(tagType, element) != null) {
            for (String s : ModelUtils.getMultipleTaggedValue(tagType, element)){
        
                if (ModelUtils.evaluateComplexString(s, 2) != null) {
                    String[] values = ModelUtils.evaluateComplexString(s, 2);
                    c.addItem();
                    c.getListText().get(c.getListText().size()-1).setText(values[1]);
                    int ind = c.getListCombo().get(c.getListCombo().size()-1).indexOf(values[0]);
                    c.getListCombo().get(c.getListCombo().size()-1).select(ind);
                }
        
            }
        }
    }

}
