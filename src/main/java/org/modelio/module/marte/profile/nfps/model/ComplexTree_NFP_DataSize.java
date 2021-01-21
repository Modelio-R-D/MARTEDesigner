package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.profile.editors.ComplexTree;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9d2d34f7-2709-4d62-bf8e-0f638b273892")
public class ComplexTree_NFP_DataSize extends ComplexTree {
    @objid ("4c2ef57a-0c2d-43ed-8336-8b9689bc630b")
    private String tagType;

    @objid ("c7eaec74-b68a-42ef-aabb-45a1352addec")
    public ComplexTree_NFP_DataSize(String tagType) {
        this.tagType = tagType;
    }

    @objid ("78075558-377c-43d8-a2d2-a850af4ee6a5")
    @Override
    public void addItem() {
        createItem(tagType);
        createSubText("precision");
        createSubCombo("unit", new String[] {"bit", "byte", "KB", "MB", "GB"});
    }

    @objid ("5a6da175-51ed-4b90-9d74-323a3177d2e2")
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
