package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("63ee0437-448f-417e-a7cf-4be5d2ee1363")
public class SaExecHost_Link {
    @objid ("12aa5c01-ddc4-46c2-8209-5bde61a2f40f")
    protected Link element;

    @objid ("e41e19ad-5152-40a2-acd4-33e49b71c2cd")
    public SaExecHost_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAEXECHOST_LINK);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_LINK));
    }

    @objid ("238e9b9e-9630-4244-a6d1-b184648edf92")
    public SaExecHost_Link(Link element) {
        this.element = element;
    }

    @objid ("c0610d5e-3284-4973-bd52-db45746369d7")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("6899a4ad-e989-40bd-b4b5-844c78329e39")
    public Link getElement() {
        return this.element;
    }

    @objid ("66e94cca-4817-4b0d-b9cf-088d94047b4c")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaExecHost_Link_isSched", this.element);
    }

    @objid ("bc460e7d-7c71-4d57-baed-29f39a3c902c")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_ISSCHED,value);
    }

    @objid ("43ddf385-a32c-4a6b-98fd-9340e9af4e05")
    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_SCHSLACK, this.element);
    }

    @objid ("836a1886-0e18-49a7-ac67-88f71a8492ec")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_SCHSLACK, value);
    }

    @objid ("33f0dbc2-a84a-4471-8365-746221c2ec0c")
    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_SCHEDUTILIZ, this.element);
    }

    @objid ("e236f500-b159-455c-8432-0acdc366772f")
    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_SCHEDUTILIZ, value);
    }

    @objid ("9647fb8a-0f01-4900-bd85-ad5f424e6d8b")
    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_ISRSWITCHT, this.element);
    }

    @objid ("4905bb80-41b8-4881-bfc3-a18ad5d7abb5")
    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_ISRSWITCHT, value);
    }

    @objid ("2b40a7a2-4975-4cc6-abc0-f50e6af1641b")
    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_ISRPRIORANGE, this.element);
    }

    @objid ("bb6215c7-95ad-4303-9cb6-5c09fdad43ec")
    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LINK_SAEXECHOST_LINK_ISRPRIORANGE, value);
    }

}
