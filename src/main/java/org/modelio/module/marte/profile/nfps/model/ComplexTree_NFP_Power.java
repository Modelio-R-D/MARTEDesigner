package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.ComplexTree;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fda1d026-940e-475d-8e8f-d7f674ddcd15")
public class ComplexTree_NFP_Power extends ComplexTree {
    @objid ("484e9a25-f274-471c-87c4-07dff70f3f97")
    private String tagType;

    @objid ("60016dab-0ba0-4ce5-b413-2dc8c2b6c23a")
    public ComplexTree_NFP_Power(String tagType) {
        this.tagType = tagType;
    }

    @objid ("bb74e403-dc04-4e55-b92c-c3c74e4edd31")
    @Override
    public void addItem() {
        createItem(tagType);
        createSubText("precision");
        createSubCombo("unit", new String[] {"W", "mW", "kW"});
    }

    @objid ("772a7e38-8f45-4654-a1e1-7acd2494c354")
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
