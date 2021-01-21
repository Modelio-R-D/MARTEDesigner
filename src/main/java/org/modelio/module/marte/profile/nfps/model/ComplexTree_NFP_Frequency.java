package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.ComplexTree;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d3b93af0-8426-4ee6-8832-3b876cd9f57d")
public class ComplexTree_NFP_Frequency extends ComplexTree {
    @objid ("a9e83c30-8707-43d6-ad6e-b6aa9ba600da")
    private String tagType;

    @objid ("d70e91f7-021f-4e8a-bbfe-f476da59d113")
    public ComplexTree_NFP_Frequency(String tagType) {
        this.tagType = tagType;
    }

    @objid ("a6165560-b514-4041-b721-74c9a4e4782a")
    @Override
    public void addItem() {
        createItem(tagType);
        createSubText("precision");
        createSubCombo("unit", new String[] {"Hz", "kHz", "MHz", "GHz", "rpm"});
    }

    @objid ("af58c36c-c628-4a6e-8784-29a3f97c2429")
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
