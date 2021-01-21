package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("014e3eb1-54d7-43ab-95e1-72b3186ae77f")
public class HwISA_Link {
    @objid ("bb6dd393-bb4d-42dc-b140-5e3ce80df829")
    protected Link element;

    @objid ("59de4c1b-1173-4ddf-bec0-2e1fbfd86495")
    public HwISA_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_LINK);
        this.element.setName(MARTEResourceManager.getName("HwISA_Link"));
    }

    @objid ("173cb028-54ef-4c2d-a7d1-d4001555e6d1")
    public HwISA_Link(Link element) {
        this.element = element;
    }

    @objid ("82d71792-8bfb-4503-af96-91137d76b705")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("05952a2a-3f5c-4a75-8be5-a6f06bf94581")
    public Link getElement() {
        return this.element;
    }

    @objid ("caa91c01-9305-4ee2-99b9-4bee585a7772")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_LINK_HWISA_LINK_FAMILY, this.element);
    }

    @objid ("e89527b1-b782-4ca6-99c0-92fb45a60133")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_LINK_HWISA_LINK_FAMILY, value);
    }

    @objid ("403dcbed-da26-4e66-ac32-47669323a610")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_LINK_HWISA_LINK_INST_WIDTH, this.element);
    }

    @objid ("f7cc0bff-a78d-4107-8a6c-e4dc6d717f99")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_LINK_HWISA_LINK_INST_WIDTH, value);
    }

    @objid ("72d070d8-aa33-4773-a05f-3a268b9be6ac")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_LINK_HWISA_LINK_TYPE, this.element);
    }

    @objid ("c5258508-1354-4518-afcf-9cd9db676ace")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_LINK_HWISA_LINK_TYPE, value);
    }

}
