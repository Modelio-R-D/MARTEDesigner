package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d2ea6464-0fcf-4de2-b18b-8a567b87d867")
public class MutualExclusionResource_Link {
    @objid ("9615281f-6eac-435e-bf96-ec28b4ab7218")
    protected Link element;

    @objid ("0fe7570f-f089-4dbc-8290-51de10cdea3a")
    public MutualExclusionResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Link"));
    }

    @objid ("8cce5d4c-c602-4448-a61e-6137d49abe1a")
    public MutualExclusionResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("289ce1d3-e6ef-4568-b01b-3a75de7dd9de")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("e9dede21-2000-4374-b730-ea967fe1068c")
    public Link getElement() {
        return this.element;
    }

    @objid ("fbb35de7-a9ae-406d-aa1c-bd9a4005457c")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND, this.element);
    }

    @objid ("17aa9f7b-847c-46a6-beab-fdcafc435684")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND, value);
    }

    @objid ("6d194ddf-3cb7-49fd-8873-69e2a60ecbf8")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_CEILING, this.element);
    }

    @objid ("ec759632-ce67-4103-aaa0-6612ce1c6667")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_CEILING, value);
    }

    @objid ("1ae49486-5e89-4197-8679-8e2cc46eec15")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("b5f52cc0-4943-4dbe-a678-3a9115b77594")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("5b043e59-edc9-4b2b-ae6a-4c17f6335bc5")
    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER, this.element);
    }

    @objid ("d08823f3-a98e-489d-a9da-62012d0d1609")
    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER, value);
    }

}
