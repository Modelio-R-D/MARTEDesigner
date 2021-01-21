package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("73f93d08-ae5d-4683-bfce-b16741c04a32")
public class HwCommunicationResource_Instance extends HwResource_Instance {
    @objid ("9262ed50-c305-4b1f-b213-c7ec5183a4b7")
    public HwCommunicationResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Instance"));
    }

    @objid ("746e2d43-8c6f-4625-aaaf-eb093ffab34b")
    public HwCommunicationResource_Instance(Instance element) {
        super(element);
    }

}
