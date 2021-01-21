package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8b7e92cf-dd10-4709-adf5-127e126b71ff")
public class Resource_Node {
    @objid ("880a6220-3445-4330-b13d-4811b8b7bb1e")
    protected Node element;

    @objid ("90b05421-0580-498c-9a9e-17d6c1d2ed1d")
    public Resource_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.RESOURCE_CLASSIFIER));
    }

    @objid ("1883a111-0b8f-4fb1-9e28-7fb7dc2cd2ea")
    public Resource_Node(final Node element) {
        this.element = element;
    }

    @objid ("9dd0bbf6-2b1f-4556-af31-abfeb9783aa2")
    public Node getElement() {
        return this.element;
    }

    @objid ("1c909ac6-6f6a-4f7e-989a-d154e7503477")
    public void setParent(final ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("92d1ce99-44a5-4143-81c6-0725cf030f09")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("3f9344bb-d194-4348-ad6b-174c0496573a")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT, this.element);
    }

    @objid ("c0dc7b11-c656-4182-842f-8c49ec48dc29")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT, value);
    }

    @objid ("d7a1873a-d96a-4bd1-a054-16c03690c697")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED, this.element);
    }

    @objid ("db4a66eb-6351-420c-892e-25020034fd74")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED,value);
    }

    @objid ("b851c590-7d13-404a-aca1-e16851654a7c")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE, this.element);
    }

    @objid ("ec8bebcf-575d-4e84-9344-295fc9993bc9")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE,value);
    }

}
