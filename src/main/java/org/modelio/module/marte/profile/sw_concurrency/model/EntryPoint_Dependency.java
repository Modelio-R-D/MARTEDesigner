package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7de377dc-effc-4a3a-99c0-3b957fcbd38f")
public class EntryPoint_Dependency {
    @objid ("57b02dd4-7a0c-40ad-810c-93061a51b024")
    protected Dependency element;

    @objid ("ea9ac3c8-3f13-4c56-9050-55c2a9b52f00")
    public EntryPoint_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ENTRYPOINT_DEPENDENCY);
        this.element.setName(MARTEResourceManager.getName("EntryPoint_Dependency"));
    }

    @objid ("0f0a16f3-e0fa-42a9-bebc-32ee36a0e2f9")
    public EntryPoint_Dependency(Abstraction element) {
        this.element = element;
    }

    @objid ("cb6f5b88-f74c-477e-86d1-46d5af5791bb")
    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        this.element.setDependsOn(destination);
    }

    @objid ("5d051677-f820-4f08-8834-8c84cdb0e374")
    public Dependency getElement() {
        return this.element;
    }

    @objid ("b9285752-d001-411e-b30c-3514c83d203a")
    public boolean isisReentrant() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ISREENTRANT, this.element);
    }

    @objid ("aa18c76c-5ad0-4ca9-801e-b07454894585")
    public void isisReentrant(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ISREENTRANT,value);
    }

    @objid ("8d92ebb5-ced6-4a19-bf16-11ec06d62b97")
    public String getroutine() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ROUTINE, this.element);
    }

    @objid ("289e7fd0-3858-44c8-a97b-685b4401b52b")
    public void setroutine(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ENTRYPOINT_DEPENDENCY_ENTRYPOINT_DEPENDENCY_ROUTINE, value);
    }

}
