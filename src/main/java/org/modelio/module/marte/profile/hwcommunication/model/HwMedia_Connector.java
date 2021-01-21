package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("391b4e30-2cf4-4939-86cb-d45aba522a4f")
public class HwMedia_Connector {
    @objid ("5b0584cf-bc88-4c07-bba1-40b03c7f14de")
    protected Connector element;

    @objid ("1bd8d32e-90a5-41fa-93e8-5377899be152")
    public HwMedia_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_LINK);
        this.element.setName(MARTEResourceManager.getName("HwMedia_Connector"));
    }

    @objid ("1f8c346f-6b0e-4a44-b5e1-2665fa8803bb")
    public HwMedia_Connector(Connector element) {
        this.element = element;
    }

    @objid ("e99ec330-8866-4d70-8331-6e9038b86d86")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachConnector(this.element, source, destination);
    }

    @objid ("15141032-dbf6-4878-9ac9-85bdaa099f28")
    public Connector getElement() {
        return this.element;
    }

    @objid ("789955d7-64cc-4b1e-8ed5-3afcc6133207")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_ARBITERS, this.element);
    }

    @objid ("8a68b03f-4eee-40a4-ac85-3a135f5f7368")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_LINK_HWMEDIA_LINK_ARBITERS, value);
    }

}
