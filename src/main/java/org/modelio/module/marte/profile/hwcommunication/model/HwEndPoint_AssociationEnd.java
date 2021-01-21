package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("511473df-03f9-4a99-ae41-eb22c33df532")
public class HwEndPoint_AssociationEnd extends CommunicationEndPoint_AssociationEnd {
    @objid ("95c19aef-86e8-4057-9e9d-a52b182e3c15")
    public HwEndPoint_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_AssociationEnd"));
    }

    @objid ("b6267e7f-a7b4-45e6-abaf-f0a7117f4b01")
    public HwEndPoint_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("96492f64-74f0-4269-b10f-a2e939909df5")
    public HwMedia_Association getHwMedia_Association() {
        return new HwMedia_Association( this.element.getAssociation());
    }

    @objid ("f78bd976-9dc2-4003-abfd-0bb65d6f1437")
    public void addHwMedia_Association(HwMedia_Association model) {
        this.element.setAssociation(model.getElement());
    }

    @objid ("2cba7726-fc33-4051-af02-18346055e3d1")
    public HwBridge_Association getHwBridge_Association() {
        return new HwBridge_Association(this.element.getAssociation());
    }

    @objid ("42e28c59-e37d-4e41-8236-ef8170554715")
    public void addHwBridge_Association(HwBridge_Association model) {
        this.element.setAssociation(model.getElement());
    }

}
