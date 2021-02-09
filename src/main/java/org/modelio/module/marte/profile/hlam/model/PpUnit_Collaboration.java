package org.modelio.module.marte.profile.hlam.model;

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

public class PpUnit_Collaboration {
    protected Collaboration element;

    public PpUnit_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PPUNIT_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("PpUnit_Collaboration"));
    }

    public PpUnit_Collaboration(Collaboration element) {
        this.element = element;
    }

    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    public Collaboration getElement() {
        return this.element;
    }

    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_CONCPOLICY, this.element);
    }

    public void setconcPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_CONCPOLICY, value);
    }

    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_MEMORYSIZE, this.element);
    }

    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_MEMORYSIZE, value);
    }

    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
