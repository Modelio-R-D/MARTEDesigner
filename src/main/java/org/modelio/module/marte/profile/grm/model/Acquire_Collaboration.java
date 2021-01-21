package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b5d333cf-d0a8-441d-8ab0-3ae11c96b803")
public class Acquire_Collaboration {
    @objid ("bd1a7474-8478-437c-9cc0-eea7dbcb9535")
    protected Collaboration element;

    @objid ("fabee084-9548-4494-af82-effeb61f9fea")
    public Acquire_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ACQUIRE_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("Acquire_Collaboration"));
    }

    @objid ("6703379f-1037-44f6-9fd3-f351c45e9b7d")
    public Acquire_Collaboration(final Collaboration element) {
        this.element = element;
    }

    @objid ("b7c97780-9b22-4c8b-b6a2-88fc601ecd05")
    public void setParent(Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("3568e147-ddfd-48d6-84dc-69ccdb8b9441")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("c6a6445e-6310-484b-991e-a1f17c2bcb85")
    public boolean isisBlocking() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_COLLABORATION_ACQUIRE_COLLABORATION_ISBLOCKING, this.element);
    }

    @objid ("8919136d-35ae-4e4e-87ec-e529eba5eac9")
    public void isisBlocking(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ACQUIRE_COLLABORATION_ACQUIRE_COLLABORATION_ISBLOCKING,value);
    }

    @objid ("f7deb32d-7040-484f-963f-1be97d6a433d")
    public void setParent(Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("de9b7a8c-2335-4e80-8fdd-a2ae06ccca81")
    public void setParent(ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("d6e2519e-c946-45e8-814d-7c7915e9afe0")
    public void setParent(TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
