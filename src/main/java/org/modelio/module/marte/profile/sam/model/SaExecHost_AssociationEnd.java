package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d1c680ae-f967-43dd-aa36-01e421506932")
public class SaExecHost_AssociationEnd {
    @objid ("adbee026-45d2-4b56-86ff-f51e13f21251")
    protected AssociationEnd element;

    @objid ("1ac49e29-c214-4bff-aa32-35c789f67445")
    public SaExecHost_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.SAEXECHOST_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_ASSOCIATIONEND));
    }

    @objid ("fb5fc7a5-2774-40cc-baa1-9586237fa988")
    public SaExecHost_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("d4edde61-0605-4a24-8135-fac75795b178")
    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    @objid ("3d72bfee-c5c3-48aa-922d-4194fda9d283")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("5b404cf4-a9c7-4856-8a13-6e688404e6ef")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue( MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISSCHED, this.element);
    }

    @objid ("71fa0b46-feab-46be-ba9d-c7bf6df39fa2")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISSCHED, value);
    }

    @objid ("9b5b995b-9b92-4021-be0b-dce0580ed7e7")
    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHSLACK, this.element);
    }

    @objid ("59c7d215-976c-4826-8cf5-e5c7def49ab1")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHSLACK, value);
    }

    @objid ("6626871b-fd2c-4a0f-a1bd-7d8561efe334")
    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ, this.element);
    }

    @objid ("536d4e9d-2f57-42b3-b888-9db20e8aae35")
    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ, value);
    }

    @objid ("a175e7bc-db00-422f-b04b-e43ee0dde452")
    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT, this.element);
    }

    @objid ("c97eb0d1-1ceb-4496-bd75-39c681e8205a")
    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT, value);
    }

    @objid ("5e2620c1-dccb-4849-a00d-bc60cc3e605b")
    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE, this.element);
    }

    @objid ("c1829a30-685e-4a52-bd04-b207217d4612")
    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE, value);
    }

}
