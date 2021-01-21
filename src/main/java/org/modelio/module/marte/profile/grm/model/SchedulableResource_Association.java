package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("79453f30-902f-4002-a49f-115a1a84394d")
public class SchedulableResource_Association {
    @objid ("ddedc570-e289-455f-a91c-4a02a11e0cda")
    protected Association element;

    @objid ("9a46f2bb-b7b6-4a2b-a2a0-d31c9c15e93e")
    public SchedulableResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("SchedulableResource_Association"));
    }

    @objid ("8bcf5457-45a4-4310-85c7-af9b862865fd")
    public SchedulableResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("dde427b1-cac8-46e8-b017-79d54161368b")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("7832eb6a-0ab7-43be-9201-4229a59ba38c")
    public Association getElement() {
        return this.element;
    }

    @objid ("c3c644b0-79dc-4f80-beaa-a4022e0fbcf2")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS, this.element);
    }

    @objid ("a8b11ad1-895d-48bb-8f5e-7f436c2792fd")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS, value);
    }

    @objid ("b87eaa40-af7a-4f40-89dc-d1ff829c5fcf")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDULABLERESOURCE_ASSOCIATION_HOST, this.element);
    }

    @objid ("2f1cb325-5ed9-47ab-a14a-4da05a35fc4c")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDULABLERESOURCE_ASSOCIATION_HOST, value);
    }

    @objid ("7230fe6c-76ac-4aef-a28e-f23f45d94b21")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("da58ff23-fb1f-4612-b447-f78aaa1769f6")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER, value);
    }

}
