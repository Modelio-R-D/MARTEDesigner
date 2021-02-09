package org.modelio.module.marte.profile.alloc.model;

import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Allocate_Dependency {
    protected Dependency element = null;

    public Allocate_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY);
        this.element.setName(MARTEResourceManager.getName("Allocate_Dependency"));
    }

    public Allocate_Dependency(Dependency element) {
        this.element = element;
    }

    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        if (!source.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT))
            ModelUtils.setStereotype(source, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT);
        
        this.element.setDependsOn(destination);
        if (!source.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT))
            ModelUtils.setStereotype(source, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT);
    }

    public Dependency getElement() {
        return this.element;
    }

    public String getkind() {
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_KIND, this.element);
        if(!(MARTEEnumerationUtils.isAllocationKind(value_kind))){
            value_kind = "";
        }
        return value_kind;
    }

    public void setkind(String value) {
        if(MARTEEnumerationUtils.isAllocationKind(value)){
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_KIND, value);
        }
    }

    public String getnature() {
        String value_nature = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_NATURE, this.element);
        if(!(MARTEEnumerationUtils.isAllocationNature(value_nature))){
            value_nature = "";
        }
        return value_nature;
    }

    public void setnature(String value) {
        if(MARTEEnumerationUtils.isAllocationNature(value)){
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_NATURE, value);
        }
    }

}
