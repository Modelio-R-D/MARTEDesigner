package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d4e9d621-5351-4789-b993-3bddaf27d82f")
public class HwI_O_Node {
    @objid ("5de40236-723b-4d0f-b655-9162523bfb2f")
    protected Node element;

    @objid ("df346b61-201b-4dee-b2c7-0558f9023eb1")
    public HwI_O_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWI_O_CLASSIFIER));
    }

    @objid ("b2af9b8f-7e60-4da0-aa84-abf7922be638")
    public HwI_O_Node(Node element) {
        this.element = element;
    }

    @objid ("50bf2eb6-0d8a-4b4c-a81a-a19e825d1ee2")
    public Node getElement() {
        return this.element;
    }

    @objid ("9436c6ac-f7bc-4adc-8f6c-d0400a10730b")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("4b46dfe6-84cf-44ef-97ff-0497aef94790")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
