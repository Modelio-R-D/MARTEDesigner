package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Distribute_Dependency {
    protected Dependency element;

    public Distribute_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element,"Distribute_Dependency");
        this.element.setName(MARTEResourceManager.getName("Distribute_Dependency"));
    }

    public Distribute_Dependency(Dependency element) {
        this.element = element;
    }

    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        this.element.setDependsOn(destination);
    }

    public Dependency getElement() {
        return this.element;
    }

    public String getpatternShape() {
        return ModelUtils.getTaggedValue("Distribute_Dependency_patternShape", this.element);
    }

    public void setpatternShape(String value) {
        ModelUtils.addStringValue(this.element,"Distribute_Dependency_patternShape", value);
    }

    public String getrepetitionSpace() {
        return ModelUtils.getTaggedValue("Distribute_Dependency_repetitionSpace", this.element);
    }

    public void setrepetitionSpace(String value) {
        ModelUtils.addStringValue(this.element,"Distribute_Dependency_repetitionSpace", value);
    }

    public String getfromTiler() {
        return ModelUtils.getTaggedValue("Distribute_Dependency_fromTiler", this.element);
    }

    public void setfromTiler(String value) {
        ModelUtils.addStringValue(this.element,"Distribute_Dependency_fromTiler", value);
    }

    public String gettoTiler() {
        return ModelUtils.getTaggedValue("Distribute_Dependency_toTiler", this.element);
    }

    public void settoTiler(String value) {
        ModelUtils.addStringValue(this.element,"Distribute_Dependency_toTiler", value);
    }

}
