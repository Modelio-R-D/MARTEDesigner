package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fd6d39bc-2bb2-4703-b149-f3fdcdd5f7ac")
public class HwBus_Association {
    @objid ("5cabb286-bb09-4ae7-b9e1-cfd77df173b2")
    protected Association element;

    @objid ("cb7dd0c8-6e18-4b60-93b5-5fb4a98d51a6")
    public HwBus_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwBus_Association"));
    }

    @objid ("668a352d-8b5d-4125-b82c-1c8de8128ee1")
    public HwBus_Association(Association element) {
        this.element = element;
    }

    @objid ("9c7620b3-8e16-4ea8-9f9d-9ab8effdee40")
    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(this.element, source, destination);
    }

    @objid ("e839c9a5-a9dc-4bbb-a3dd-fad4b94921bb")
    public Association getElement() {
        return this.element;
    }

    @objid ("88439fca-4308-4165-ad9c-eb5c9ea40253")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATION_HWBUS_ASSOCIATION_ADRESSWIDTH, this.element);
    }

    @objid ("147e14c5-3b6b-442a-9195-c98478abed19")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATION_HWBUS_ASSOCIATION_ADRESSWIDTH, value);
    }

    @objid ("57db24ea-3821-423e-9234-cb6bee1d49ea")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATION_HWBUS_ASSOCIATION_WORDWIDTH, this.element);
    }

    @objid ("50de1c8a-731f-4a3e-9514-7c7bdb2b418f")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATION_HWBUS_ASSOCIATION_WORDWIDTH, value);
    }

    @objid ("5f67741e-e761-482a-be84-fd13ba75276a")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATION_HWBUS_ASSOCIATION_ISSYNCHRONOUS, this.element);
    }

    @objid ("f380530d-4145-4f1f-853d-0ead1e128b91")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATION_HWBUS_ASSOCIATION_ISSYNCHRONOUS,value);
    }

    @objid ("d3e33cd8-6b21-43fb-b963-3244cb8558cf")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATION_HWBUS_ASSOCIATION_ISSERIAL, this.element);
    }

    @objid ("9ec17ba8-8e95-44ff-a455-b12c843aab36")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATION_HWBUS_ASSOCIATION_ISSERIAL,value);
    }

}
