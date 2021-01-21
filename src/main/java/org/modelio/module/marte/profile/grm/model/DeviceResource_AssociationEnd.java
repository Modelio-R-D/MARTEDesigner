package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4ed2e6be-0a49-4f2c-b5b4-5d8e9864939d")
public class DeviceResource_AssociationEnd extends ProcessingResource_AssociationEnd {
    @objid ("38318610-e54f-4439-9e5e-4980b1c104d3")
    public DeviceResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("DeviceResource_AssociationEnd"));
    }

    @objid ("5c521f5c-c6b1-4b5c-a5f8-1a40b787237c")
    public DeviceResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
