package org.modelio.module.marte.profile.hwcommunication.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f12e1db2-99de-4906-bf9d-67e90c0648d2")
public class HwBridge_Association {
    @objid ("566238e1-4b6a-4029-8b65-8f8bccbb6d2c")
    protected Association element;

    @objid ("60bf047c-24ca-4b75-a08f-ea645fbe22e3")
    public HwBridge_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwBridge_Association"));
    }

    @objid ("9eb97c80-9a4a-44e3-b00f-1191e5e38845")
    public HwBridge_Association(Association element) {
        this.element = element;
    }

    @objid ("d9d1ae58-b15b-4701-b6fc-63d9f4f409b9")
    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(this.element, source, destination);
    }

    @objid ("1bebd3a7-456a-473f-a9eb-1ab4ad9ef336")
    public Association getElement() {
        return this.element;
    }

    @objid ("d08798bc-9897-4eeb-9a16-661eb8fa75bd")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATION_HWBRIDGE_ASSOCIATION_SIDES, this.element);
    }

    @objid ("fec8f5ad-5e16-47bb-970d-abc296730dea")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATION_HWBRIDGE_ASSOCIATION_SIDES, value);
    }

    @objid ("5e59e8b9-b4bc-4eaf-bf45-6c0978fdbe42")
    public List<HwEndPoint_AssociationEnd> getHwEndPoint_AssociationEnd() {
        List<HwEndPoint_AssociationEnd> res = new java.util.ArrayList<>();        
        for(AssociationEnd assocEnd : this.element.getEnd()){
            res.add(new HwEndPoint_AssociationEnd((AssociationEnd)this.element));
        }
        return res;
    }

    @objid ("766e2345-132e-49c3-9d8a-2765929693e2")
    public void addHwEndPoint_AssociationEnd(HwEndPoint_AssociationEnd model) {
        this.element.getEnd().add(model.getElement());
    }

}
