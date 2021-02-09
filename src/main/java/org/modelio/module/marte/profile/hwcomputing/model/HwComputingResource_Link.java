package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComputingResource_Link {
    protected Link element;

    public HwComputingResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("HwComputingResource_Link"));
    }

    public HwComputingResource_Link(Link element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Link getElement() {
        return this.element;
    }

    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES, this.element);
    }

    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_OWNEDHW, value);
    }

    public String getHwComputingResource_Link_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_FREQUENCY, this.element);
    }

    public void setHwComputingResource_Link_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_FREQUENCY, value);
    }

    public String getHwComputingResource_Link_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_ENDPOINTS, this.element);
    }

    public void setHwComputingResource_Link_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LINK_HWCOMPUTINGRESOURCE_LINK_ENDPOINTS, value);
    }

}
