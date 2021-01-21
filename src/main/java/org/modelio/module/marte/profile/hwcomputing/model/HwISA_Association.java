package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e92ad24d-a77b-46c4-8cca-266480eb13ee")
public class HwISA_Association {
    @objid ("03a2fdb9-992c-4160-9fd3-333a527cab13")
    protected Association element;

    @objid ("59d1147a-4fff-4d38-bdb3-daca7e1a8982")
    public HwISA_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwISA_Association"));
    }

    @objid ("9eae6293-5068-46a1-912f-5d26bb62f0a2")
    public HwISA_Association(Association element) {
        this.element = element;
    }

    @objid ("9f705a48-cb30-4220-b420-222565091ef0")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("927412ad-93f3-4ea8-af53-e93f3d2658f7")
    public Association getElement() {
        return this.element;
    }

    @objid ("68a8204e-436b-4a30-ac30-0de568fd3a33")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_FAMILY, this.element);
    }

    @objid ("204347c2-150d-4f0e-b486-add586aea2cf")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_FAMILY, value);
    }

    @objid ("99a3821b-efa2-4bae-a9ce-59079bfcf33b")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_INST_WIDTH, this.element);
    }

    @objid ("f8c75964-81d4-4286-9a77-6ac9b4c4edf2")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_INST_WIDTH, value);
    }

    @objid ("415f0ad4-00fa-4055-b1c2-f2efd71d842d")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_TYPE, this.element);
    }

    @objid ("b434b78f-3049-4338-a7e5-bf94ec7b1d18")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_TYPE, value);
    }

}
