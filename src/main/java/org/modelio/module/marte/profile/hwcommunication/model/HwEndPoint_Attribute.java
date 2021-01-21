package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6618ac3b-ff81-432c-91fd-cf4a60d2e180")
public class HwEndPoint_Attribute extends CommunicationEndPoint_Attribute {
    @objid ("de240285-58a8-40bc-a7a2-745998292de3")
    public HwEndPoint_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Attribute"));
    }

    @objid ("4ddad6a4-4b14-4bd6-bf5a-1a546a74be54")
    public HwEndPoint_Attribute(Attribute element) {
        super(element);
    }

    @objid ("e34caa99-1084-451c-9157-17abbe5f3171")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_ATTRIBUTE_HWENDPOINT_ATTRIBUTE_CONNECTEDTO, this.element);
    }

    @objid ("683c35c7-c904-4440-acb5-53a05db87815")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_ATTRIBUTE_HWENDPOINT_ATTRIBUTE_CONNECTEDTO, value);
    }

}
