package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwISA_Association {
    protected Association element;

    public HwISA_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwISA_Association"));
    }

    public HwISA_Association(Association element) {
        this.element = element;
    }

    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    public Association getElement() {
        return this.element;
    }

    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_FAMILY, this.element);
    }

    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_FAMILY, value);
    }

    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_INST_WIDTH, this.element);
    }

    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_INST_WIDTH, value);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_TYPE, value);
    }

}
