package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8596c25d-6650-4581-a4d2-4ea8fdea3c0b")
public class GrService_Operation {
    @objid ("9e0a6800-4a5a-44f1-a10e-4a0790b0d97c")
    protected Operation element;

    @objid ("29939263-239b-4f00-a89f-f512c0627617")
    public GrService_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GRSERVICE_OPERATION);
        this.element.setName(MARTEResourceManager.getName("GrService_Operation"));
    }

    @objid ("819c4aee-97e8-454b-8244-8f113228b549")
    public GrService_Operation(final Operation element) {
        this.element = element;
    }

    @objid ("3433cabb-b90f-40b5-b316-555e7e2838f7")
    public Operation getElement() {
        return this.element;
    }

    @objid ("0be48c34-06b1-4d3f-b120-c84c804faa25")
    public void setParent(final Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("360f56c2-2498-41c5-a2e0-e46d6ae871fd")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("30220fe4-25e7-4968-91b8-649d8acf4f25")
    public String getGrService_Operation_own() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER, this.element);
    }

    @objid ("f463c3a5-1be2-4f18-9f2d-4f8e73507a2f")
    public void setGrService_Operation_own(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER, value);
    }

}
