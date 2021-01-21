package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("25e21640-2f38-4bab-865c-2c72156632d8")
public class SaExecHost_Association {
    @objid ("21aa381e-c37d-4ec2-a30b-fff04dc1563e")
    protected Association element;

    @objid ("fdb7880c-23e1-4d89-a1db-f00404a18821")
    public SaExecHost_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.SAEXECHOST_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_ASSOCIATION));
    }

    @objid ("053e64bd-c62f-4cb0-9fad-2782d31875cb")
    public SaExecHost_Association(Association element) {
        this.element = element;
    }

    @objid ("09adc11b-6d7c-478d-b95e-dabbda32f84e")
    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    @objid ("3378c800-df52-44e3-ae45-efc784fa7221")
    public Association getElement() {
        return this.element;
    }

    @objid ("c0162708-88e9-4b8e-baf9-5c389d70c6b9")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue( MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISSCHED, this.element);
    }

    @objid ("182909e6-9b07-4364-ab89-6d770d9bcf16")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISSCHED, value);
    }

    @objid ("1e26996f-920c-4fed-aa19-5061cafaa800")
    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHSLACK, this.element);
    }

    @objid ("710e8a70-defb-42df-8fa2-c1055b3f8729")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHSLACK, value);
    }

    @objid ("0fea23d4-cc83-49ff-bcbf-8527c6954ab0")
    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHEDUTILIZ, this.element);
    }

    @objid ("dad591f7-6831-44a8-9f90-01d7d5dd5b08")
    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_SCHEDUTILIZ, value);
    }

    @objid ("3eddd279-0969-4dcf-92d0-b55979e3ae6b")
    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRSWITCHT, this.element);
    }

    @objid ("ab25c884-bae2-4e11-ad8e-86d696e16853")
    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRSWITCHT, value);
    }

    @objid ("7b72a280-25d6-4567-a377-2ea419832108")
    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRPRIORANGE, this.element);
    }

    @objid ("a405888d-86d1-450e-b632-b415534ba04a")
    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATION_SAEXECHOST_ASSOCIATION_ISRPRIORANGE, value);
    }

}
