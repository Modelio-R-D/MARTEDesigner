package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b917a8c2-d371-422d-a500-e3e95a032ff2")
public class HwMedia_BindableInstance extends HwCommunicationResource_BindableInstance {
    @objid ("e419ac7a-96f4-41c2-ab6a-c55a04ee06ff")
    public HwMedia_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwMedia_BindableInstance"));
    }

    @objid ("4c2c6291-1b21-4369-b859-faa9ab15c80b")
    public HwMedia_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("046f4150-a527-41f6-a8d1-ab504403b919")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_ARBITERS, this.element);
    }

    @objid ("9ffd1ec1-e18f-43f2-acf7-4be3c1ab2345")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_INSTANCE_HWMEDIA_INSTANCE_ARBITERS, value);
    }

}
