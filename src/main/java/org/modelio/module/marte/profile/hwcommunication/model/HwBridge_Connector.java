package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("deb11f01-61e5-44de-a2c9-e65fa4e1a5f0")
public class HwBridge_Connector {
    @objid ("5fb58f5b-56ee-4331-b24c-5ff3e05fc364")
    protected Connector element;

    @objid ("38045a3d-a45a-439d-b56c-84aa92797a91")
    public HwBridge_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_LINK);
        this.element.setName(MARTEResourceManager.getName("HwBridge_Connector"));
    }

    @objid ("3f77e8f9-aadd-4d32-8aac-139e664a6590")
    public HwBridge_Connector(Connector element) {
        this.element = element;
    }

    @objid ("bfd503f6-a89c-4498-8f47-493f90ce04ea")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachConnector(this.element, source, destination);
    }

    @objid ("5e0c17ab-1a89-47f8-b033-bc33c7c52593")
    public Connector getElement() {
        return this.element;
    }

    @objid ("7d9c29e0-8f4d-42bf-aea4-454e707aa724")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_LINK_HWBRIDGE_LINK_SIDES, this.element);
    }

    @objid ("0eb6f374-8481-4189-b8a0-d95d18b28849")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_LINK_HWBRIDGE_LINK_SIDES, value);
    }

}
