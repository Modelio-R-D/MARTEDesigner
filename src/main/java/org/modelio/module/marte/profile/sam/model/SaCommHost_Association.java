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

@objid ("51977cce-e0f5-48f7-b990-a52067a484da")
public class SaCommHost_Association {
    @objid ("f265d3f0-ead4-437e-8b93-4b59676a69a8")
    protected Association element;

    @objid ("8fb74a77-63d7-4e39-ba89-d0e120834ade")
    public SaCommHost_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_ASSOCIATION));
    }

    @objid ("9147ffa6-8530-4984-ade7-b272a1a1af43")
    public SaCommHost_Association(Association element) {
        this.element = element;
    }

    @objid ("55074388-c3da-4f60-bd2c-51876c11401e")
    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    @objid ("a45cd897-4365-4a31-a69d-e51c4043e7fe")
    public Association getElement() {
        return this.element;
    }

    @objid ("99237a2c-98d2-4504-b327-980fcb19f5e9")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Association_isSched", this.element);
    }

    @objid ("f77f9551-ef1a-4f31-b246-db7e42311666")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_ISSCHED, value);
    }

    @objid ("b599a51c-18d0-4578-a716-2478c8f413eb")
    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Association_schSlack", this.element);
    }

    @objid ("14382e72-ba29-4375-89b8-0824ea34ca92")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_SCHSLACK, value);
    }

}
