package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("513deb7a-e275-44d4-96b5-57774945bf91")
public class DeviceResource_Association {
    @objid ("5b3237dc-4cf8-4a45-a4d2-c2a0de42f303")
    protected Association element;

    @objid ("2c211f65-a866-4a30-a655-445af320b945")
    public DeviceResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("DeviceResource_Association"));
    }

    @objid ("20d6aa34-024b-4976-80fd-6cb0380a2fc6")
    public DeviceResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("e09ad73a-1add-4cb6-a908-625f6b0e67f5")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("7d3d5e64-fd88-4ece-9bff-4bc89a8e75fa")
    public Association getElement() {
        return this.element;
    }

}
