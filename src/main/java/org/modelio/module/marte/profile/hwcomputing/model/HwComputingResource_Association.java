package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComputingResource_Association {
    protected Association element;

    public HwComputingResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwComputingResource_Association"));
    }

    public HwComputingResource_Association(Association element) {
        this.element = element;
    }

    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    public Association getElement() {
        return this.element;
    }

    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES, this.element);
    }

    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW, value);
    }

    public String getHwComputingResource_Association_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY, this.element);
    }

    public void setHwComputingResource_Association_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY, value);
    }

    public String getHwComputingResource_Association_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS, this.element);
    }

    public void setHwComputingResource_Association_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS, value);
    }

}
