package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1c0316c9-3003-4485-9328-1eb9ec4feef8")
public class HwMedia_Instance extends HwCommunicationResource_Instance {
    @objid ("d5f1ee0b-64d2-4290-a532-21fe7d5c28d4")
    public HwMedia_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwMedia_Instance"));
    }

    @objid ("2bbf9ba2-c698-4091-b109-0b9370e25721")
    public HwMedia_Instance(Instance element) {
        super(element);
    }

    @objid ("df201f11-c412-483a-bbb8-90b9b10f1c4e")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_ARBITERS, this.element);
    }

    @objid ("92f0c9d5-6bef-4b0a-b2f2-ef540f976b2d")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_ARBITERS, value);
    }

}
