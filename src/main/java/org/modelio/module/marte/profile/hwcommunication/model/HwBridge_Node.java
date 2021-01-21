package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1dbe68aa-6074-454d-b430-af1ed5f91ada")
public class HwBridge_Node extends HwMedia_Node {
    @objid ("5d970ffa-c3ec-4b79-9d1d-95856a7832a7")
    public HwBridge_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWBRIDGE_CLASSIFIER));
    }

    @objid ("51aca9b6-48e8-4760-b0b8-16281521cb4a")
    public HwBridge_Node(Node element) {
        super(element);
    }

    @objid ("a4f10d90-e8fc-4077-8756-61c7b8f185bc")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_CLASSIFIER_HWBRIDGE_CLASSIFIER_SIDES, this.element);
    }

    @objid ("20dc10fe-cfb3-4def-8c88-60a1510b6efb")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_CLASSIFIER_HWBRIDGE_CLASSIFIER_SIDES, value);
    }

}
