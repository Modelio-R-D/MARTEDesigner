package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.ComplexTree;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5ddf7b47-f779-49a3-80d6-951be8304243")
public class ComplexTree_NFP_DataTxRate extends ComplexTree {
    @objid ("93a79875-ac89-473b-bb30-e8e1fce127f4")
    private String tagType;

    @objid ("2331d0db-40ea-45cc-8e41-677b3d351d4c")
    public ComplexTree_NFP_DataTxRate(String tagType) {
        this.tagType = tagType;
    }

    @objid ("4a7d92d0-a7d5-4fc1-a182-adc6c73d716f")
    @Override
    public void addItem() {
        createItem(tagType);
        createSubText("precision");
        createSubCombo("unit", new String[] {"b/s", "Kb/s", "Mb/s"});
    }

    @objid ("08a14cfc-8ccb-47f3-8622-8161fac0cf22")
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
