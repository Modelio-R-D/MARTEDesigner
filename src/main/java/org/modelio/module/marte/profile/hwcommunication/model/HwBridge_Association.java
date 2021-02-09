package org.modelio.module.marte.profile.hwcommunication.model;

import java.util.List;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBridge_Association {
    protected Association element;

    public HwBridge_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwBridge_Association"));
    }

    public HwBridge_Association(Association element) {
        this.element = element;
    }

    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(this.element, source, destination);
    }

    public Association getElement() {
        return this.element;
    }

    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATION_HWBRIDGE_ASSOCIATION_SIDES, this.element);
    }

    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATION_HWBRIDGE_ASSOCIATION_SIDES, value);
    }

    public List<HwEndPoint_AssociationEnd> getHwEndPoint_AssociationEnd() {
        List<HwEndPoint_AssociationEnd> res = new java.util.ArrayList<>();        
        for(AssociationEnd assocEnd : this.element.getEnd()){
            res.add(new HwEndPoint_AssociationEnd((AssociationEnd)this.element));
        }
        return res;
    }

    public void addHwEndPoint_AssociationEnd(HwEndPoint_AssociationEnd model) {
        this.element.getEnd().add(model.getElement());
    }

}
