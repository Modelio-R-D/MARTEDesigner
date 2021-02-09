package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwEndPoint_AssociationEnd extends CommunicationEndPoint_AssociationEnd {
    public HwEndPoint_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_AssociationEnd"));
    }

    public HwEndPoint_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    public HwMedia_Association getHwMedia_Association() {
        return new HwMedia_Association( this.element.getAssociation());
    }

    public void addHwMedia_Association(HwMedia_Association model) {
        this.element.setAssociation(model.getElement());
    }

    public HwBridge_Association getHwBridge_Association() {
        return new HwBridge_Association(this.element.getAssociation());
    }

    public void addHwBridge_Association(HwBridge_Association model) {
        this.element.setAssociation(model.getElement());
    }

}
