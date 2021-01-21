package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("85db0b3d-7700-4c6c-a2e0-be1b10aa7565")
public class HwArbiter_Node extends HwCommunicationResource_Node {
    @objid ("fb8d18d2-241c-4f3d-9ae5-d22c29ccc28b")
    public HwArbiter_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWARBITER_CLASSIFIER));
    }

    @objid ("04267d1d-9e21-4456-8e0d-d4d5d68e0dfe")
    public HwArbiter_Node(Node element) {
        super(element);
    }

    @objid ("8c725f10-4cb8-4676-9f1b-969ceca1a1e7")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_CLASSIFIER_HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("0a8d45c5-6543-4a8a-80d5-df44cff3a9e4")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_CLASSIFIER_HWARBITER_CLASSIFIER_CONTROLLEDMEDIAS, value);
    }

}
