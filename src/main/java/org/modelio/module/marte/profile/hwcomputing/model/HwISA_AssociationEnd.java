package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d4c534a6-9a86-4f86-adcb-ffd650f45e1e")
public class HwISA_AssociationEnd {
    @objid ("56ba7b20-a04b-4608-a6dc-4344f6152633")
    protected AssociationEnd element;

    @objid ("9c19bf9a-619c-472a-a98d-bc4cd9ff4158")
    public HwISA_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element, "HwPLD_AssociationEnd");
        this.element.setName(MARTEResourceManager.getName("HwPLD_AssociationEnd"));
    }

    @objid ("d95d0f4c-0f4f-4ab5-b529-c005d04c8e46")
    public HwISA_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("c8524478-7073-4d04-9059-be805b25773f")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_FAMILY, this.element);
    }

    @objid ("ba18db35-b7f4-41ad-8d2b-d2d22a078e91")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("6ea08b6c-76b3-4e95-964d-cbc2522c36b0")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("1aa1d173-e1cc-4e6c-904d-0e8f20749738")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_FAMILY, value);
    }

    @objid ("5110bfab-3d2a-4525-989e-61e94153d637")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_INST_WIDTH, this.element);
    }

    @objid ("9c2ae6b3-f0ba-4609-9b97-a7e2f8a4cbe5")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_INST_WIDTH, value);
    }

    @objid ("5816bae9-c910-444d-8003-f3c4567fafde")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, this.element);
    }

    @objid ("7968eb67-70d8-4229-9523-7d67f1e494d3")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, value);
    }

    @objid ("eaa701fa-f446-41d3-9205-4404807977b9")
    public AssociationEnd getElement() {
        return this.element;
    }

}
