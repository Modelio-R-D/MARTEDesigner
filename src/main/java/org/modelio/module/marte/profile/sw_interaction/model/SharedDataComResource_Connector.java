package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4a73861f-219a-4553-a446-9087ad7777c0")
public class SharedDataComResource_Connector {
    @objid ("491ae908-d658-419f-8ef1-df9b5e9a8810")
    protected Connector element;

    @objid ("b51b451f-de3d-4d37-81e8-035960885e63")
    public SharedDataComResource_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("SharedDataComResource_Connector"));
    }

    @objid ("4ec142f3-6be3-4bfb-921e-0b7fd5b74b37")
    public SharedDataComResource_Connector(Connector element) {
        this.element = element;
    }

    @objid ("a01b6b44-58ad-4d7d-a526-534c2b63ddd4")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachConnector(element, source, destination);
    }

    @objid ("3d62c22d-2243-4b2c-bf7b-9116153bc2f2")
    public Connector getElement() {
        return this.element;
    }

    @objid ("06cc5c16-ebc6-4cc1-b558-c90c058183b9")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_READSERVICES, this.element);
    }

    @objid ("79ed549a-48cd-4fb8-8e00-8a8c4a845ff4")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_READSERVICES, value);
    }

    @objid ("a896f108-b1f8-4cad-908e-395cbd37be83")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_WRITESERVICES, this.element);
    }

    @objid ("5e761108-2357-4336-b685-53c526af71eb")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_WRITESERVICES, value);
    }

}
