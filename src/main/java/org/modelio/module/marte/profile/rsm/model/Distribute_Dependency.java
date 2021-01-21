package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f3c96e2c-ce73-42cd-998f-fafb5c9591ac")
public class Distribute_Dependency {
    @objid ("d932157f-4f37-4ac2-b35b-182c5191e975")
    protected Dependency element;

    @objid ("d06db6d9-eab4-4133-9fe0-41d9348cf6e2")
    public Distribute_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element,"Distribute_Dependency");
        this.element.setName(MARTEResourceManager.getName("Distribute_Dependency"));
    }

    @objid ("cbb5d31c-e4f5-43c4-9ee6-fd016173b67f")
    public Distribute_Dependency(Dependency element) {
        this.element = element;
    }

    @objid ("ed9956e1-507a-4476-b657-3185d527d076")
    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        this.element.setDependsOn(destination);
    }

    @objid ("994fded1-43fb-4f42-ae5d-b3dcade620a4")
    public Dependency getElement() {
        return this.element;
    }

    @objid ("64360426-4f06-4d1b-a5d5-7a7553a251b3")
    public String getpatternShape() {
        return ModelUtils.getTaggedValue("Distribute_Dependency_patternShape", this.element);
    }

    @objid ("967580d7-9993-4648-a4b7-69e0eb43971c")
    public void setpatternShape(String value) {
        ModelUtils.addStringValue(this.element,"Distribute_Dependency_patternShape", value);
    }

    @objid ("b6893926-8a5c-45f8-a8fc-a48073946233")
    public String getrepetitionSpace() {
        return ModelUtils.getTaggedValue("Distribute_Dependency_repetitionSpace", this.element);
    }

    @objid ("00935871-c64b-4e5a-a0d3-d0c73d586dde")
    public void setrepetitionSpace(String value) {
        ModelUtils.addStringValue(this.element,"Distribute_Dependency_repetitionSpace", value);
    }

    @objid ("1e4532da-3f3d-418f-a188-2a5ac6acb365")
    public String getfromTiler() {
        return ModelUtils.getTaggedValue("Distribute_Dependency_fromTiler", this.element);
    }

    @objid ("092be0db-0b45-4c8b-9349-cd1690b9b84f")
    public void setfromTiler(String value) {
        ModelUtils.addStringValue(this.element,"Distribute_Dependency_fromTiler", value);
    }

    @objid ("f240676e-9ac5-4028-868b-2c9287c93a7f")
    public String gettoTiler() {
        return ModelUtils.getTaggedValue("Distribute_Dependency_toTiler", this.element);
    }

    @objid ("8da3dae2-d23f-4763-ae2c-4e2d8cc317b9")
    public void settoTiler(String value) {
        ModelUtils.addStringValue(this.element,"Distribute_Dependency_toTiler", value);
    }

}
