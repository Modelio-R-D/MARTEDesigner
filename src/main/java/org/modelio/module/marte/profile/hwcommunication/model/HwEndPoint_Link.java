package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f87498d3-8b8d-4269-a0eb-d2171c685f61")
public class HwEndPoint_Link {
    @objid ("15bcd452-3f11-4939-b2fb-105a39c86d1f")
    protected Link element;

    @objid ("c183462e-c8c7-458d-8b48-c13445974f2c")
    public HwEndPoint_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_LINK);
        this.element.setName(MARTEResourceManager.getName("HwEndPoint_Link"));
    }

    @objid ("c59ac9d7-ec8f-4243-998e-b67754dbbc58")
    public HwEndPoint_Link(Link element) {
        this.element = element;
    }

    @objid ("41074a84-4210-4de5-9bd7-4e91a1ef3f6d")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("7138b9b1-f8a1-47e4-9d3b-d5ea4f4bbea8")
    public Link getElement() {
        return this.element;
    }

    @objid ("db3fdcb1-b743-4ec7-b616-dd3ce437ae2a")
    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_CONNECTEDTO, this.element);
    }

    @objid ("26efd165-1c7f-4cfe-ad91-8b38bf36a8c7")
    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_CONNECTEDTO, value);
    }

}
