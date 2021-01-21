package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("53e3e090-9606-4bea-872f-f4b5baebefba")
public class GCMTrigger_Dependency {
    @objid ("eb1ccea7-fd6a-4e4a-8351-ac64dea346e9")
    protected Dependency element;

    @objid ("186118ec-c4d0-41f6-acd4-c743534e9cb8")
    public GCMTrigger_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GCMTRIGGER_DEPENDENCY);
        this.element.setName(MARTEResourceManager.getName("GCMTrigger_Dependency"));
    }

    @objid ("1bc44c88-43bd-4a0a-ad4b-8a7bb8478d16")
    public GCMTrigger_Dependency(Dependency element) {
        this.element = element;
    }

    @objid ("f8242e08-2cd9-4fba-a5ae-e048de99deef")
    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        this.element.setDependsOn(destination);
    }

    @objid ("fe7ae2a6-b719-4963-a5d4-1e530b7b905b")
    public Dependency getElement() {
        return this.element;
    }

    @objid ("55c0711e-5f2e-4daf-bc07-0d1edc949c25")
    public String getfeature() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_FEATURE, this.element);
    }

    @objid ("5cab4d7d-fb6c-407f-a4a2-ec17bf13b528")
    public void setfeature(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_FEATURE, value);
    }

}
