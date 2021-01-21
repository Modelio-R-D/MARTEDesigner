package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b5a80179-f94a-4be5-8238-6ff3b0077e16")
public class HwCommunicationResource_Class extends HwResource_Class {
    @objid ("48648c07-d252-4d91-b6a1-9b1957265a94")
    public HwCommunicationResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_CLASSIFIER));
    }

    @objid ("43a43cf0-3a32-4b81-84ae-efbd503899e3")
    public HwCommunicationResource_Class(Class element) {
        super(element);
    }

}
