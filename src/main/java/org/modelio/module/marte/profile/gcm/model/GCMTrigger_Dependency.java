package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GCMTrigger_Dependency {
    protected Dependency element;

    public GCMTrigger_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GCMTRIGGER_DEPENDENCY);
        this.element.setName(MARTEResourceManager.getName("GCMTrigger_Dependency"));
    }

    public GCMTrigger_Dependency(Dependency element) {
        this.element = element;
    }

    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        this.element.setDependsOn(destination);
    }

    public Dependency getElement() {
        return this.element;
    }

    public String getfeature() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_FEATURE, this.element);
    }

    public void setfeature(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_FEATURE, value);
    }

}
