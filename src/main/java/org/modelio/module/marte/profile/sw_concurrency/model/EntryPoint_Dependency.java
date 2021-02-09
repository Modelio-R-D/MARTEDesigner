package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.infrastructure.Abstraction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class EntryPoint_Dependency {
    protected Dependency element;

    public EntryPoint_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ENTRYPOINT_DEPENDENCY);
        this.element.setName(MARTEResourceManager.getName("EntryPoint_Dependency"));
    }

    public EntryPoint_Dependency(Abstraction element) {
        this.element = element;
    }

    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        this.element.setDependsOn(destination);
    }

    public Dependency getElement() {
        return this.element;
    }

    public boolean isisReentrant() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ISREENTRANT, this.element);
    }

    public void isisReentrant(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ISREENTRANT,value);
    }

    public String getroutine() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ROUTINE, this.element);
    }

    public void setroutine(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ROUTINE, value);
    }

}
