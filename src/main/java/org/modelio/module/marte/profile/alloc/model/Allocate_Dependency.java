package org.modelio.module.marte.profile.alloc.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fc2cb19a-9952-4c07-9fe6-941f01b5a76e")
public class Allocate_Dependency {
    @objid ("495a4ecc-b7cd-48f3-af5d-bca0b540ebd9")
    protected Dependency element = null;

    @objid ("ddfd4967-2334-4028-959a-a6e171ddd8fe")
    public Allocate_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY);
        this.element.setName(MARTEResourceManager.getName("Allocate_Dependency"));
    }

    @objid ("19b759d1-c811-43fe-bb30-db6e181dca7e")
    public Allocate_Dependency(Dependency element) {
        this.element = element;
    }

    @objid ("e5425958-b57d-4aa8-a5bf-c4bb46f52029")
    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        if (!source.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT))
            ModelUtils.setStereotype(source, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT);
        
        this.element.setDependsOn(destination);
        if (!source.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT))
            ModelUtils.setStereotype(source, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT);
    }

    @objid ("782ac09c-9386-4655-8554-069db6442253")
    public Dependency getElement() {
        return this.element;
    }

    @objid ("6d652076-0f96-496d-a944-6c7945cdae85")
    public String getkind() {
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_KIND, this.element);
        if(!(MARTEEnumerationUtils.isAllocationKind(value_kind))){
            value_kind = "";
        }
        return value_kind;
    }

    @objid ("8bcb102d-9e38-4bd7-b393-2eefa7f82627")
    public void setkind(String value) {
        if(MARTEEnumerationUtils.isAllocationKind(value)){
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_KIND, value);
        }
    }

    @objid ("a9924949-8f9c-44e7-a235-87d9f6892a99")
    public String getnature() {
        String value_nature = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_NATURE, this.element);
        if(!(MARTEEnumerationUtils.isAllocationNature(value_nature))){
            value_nature = "";
        }
        return value_nature;
    }

    @objid ("46104372-67b2-4040-9613-b806d53e93c3")
    public void setnature(String value) {
        if(MARTEEnumerationUtils.isAllocationNature(value)){
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALLOCATE_DEPENDENCY_ALLOCATE_DEPENDENCY_NATURE, value);
        }
    }

}
