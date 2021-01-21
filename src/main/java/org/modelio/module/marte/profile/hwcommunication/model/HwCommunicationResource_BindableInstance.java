package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("93c3c76b-ad71-4c99-bd83-b9337a3a3245")
public class HwCommunicationResource_BindableInstance extends HwResource_BindableInstance {
    @objid ("8dd916c6-073d-4fd9-a563-a4bc32534383")
    public HwCommunicationResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_BindableInstance"));
    }

    @objid ("30babbf8-06bd-4635-9bb1-974b25aaef8c")
    public HwCommunicationResource_BindableInstance(BindableInstance element) {
        super(element);
    }

}
