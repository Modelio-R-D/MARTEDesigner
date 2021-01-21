package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("88ad5f8b-cfc0-43bd-a027-e968c232c51d")
public class Resource_Association {
    @objid ("6b89ddbc-37f1-4552-8958-1e0d0ebe64bb")
    protected Association element;

    @objid ("c62b70ef-0a99-4c7f-b6d0-27f375d08a49")
    public Resource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("Resource_Association"));
    }

    @objid ("ec9d19dc-c4a3-47f6-b80d-bce3dc6ce884")
    public Resource_Association(final Association element) {
        this.element = element;
    }

    @objid ("ad85eb70-48f5-499e-8a84-2bac4fc81ab2")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("fdb332e9-9243-48a5-8501-aada2f63aee5")
    public Association getElement() {
        return this.element;
    }

    @objid ("9591ff98-e884-4ff7-8f42-dc9b355df94d")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATION_RESOURCE_ASSOCIATION_RESMULT, this.element);
    }

    @objid ("f1a10a4a-1dd5-4f86-9323-9cfc7564fe2f")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_ASSOCIATION_RESOURCE_ASSOCIATION_RESMULT, value);
    }

    @objid ("e9fc15ad-4a78-440f-aa6f-e9fb28da26d2")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATION_RESOURCE_ASSOCIATION_ISPROTECTED, this.element);
    }

    @objid ("bdb5341d-f08e-4011-ad34-279cd97277ea")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_ASSOCIATION_RESOURCE_ASSOCIATION_ISPROTECTED,value);
    }

    @objid ("c1ceb744-fc9a-4cda-8d04-ba1fef30c8b0")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATION_RESOURCE_ASSOCIATION_ISACTIVE, this.element);
    }

    @objid ("eaf9a61e-4c3b-4d7a-8d9c-17aed27ec8a7")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_ASSOCIATION_RESOURCE_ASSOCIATION_ISACTIVE,value);
    }

}
