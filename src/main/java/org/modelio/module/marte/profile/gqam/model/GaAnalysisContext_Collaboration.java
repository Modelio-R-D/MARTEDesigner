package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("6572e229-f9ce-4b7d-9a72-c648da956758")
public class GaAnalysisContext_Collaboration {
    @objid ("42b9d7f7-a360-493c-a846-7ee6148bc00d")
    protected Collaboration element;

    @objid ("93ac0d34-2dce-4246-a414-ec391776d837")
    public GaAnalysisContext_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAANALYSISCONTEXT_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("GaAnalysisContext_Collaboration"));
    }

    @objid ("a8df8061-5550-44d8-b956-cfb8451210c5")
    public GaAnalysisContext_Collaboration(Collaboration element) {
        this.element = element;
    }

    @objid ("01bca167-3cd3-48ba-9200-ecfa48be74d6")
    public void setParent(Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("2f160e50-2063-4ef9-a008-40337ff527ca")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("9e8eb9d2-fe85-4d18-8e2f-f07344a6b9a7")
    public String getcontext() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS, this.element);
    }

    @objid ("19c707ca-82c3-4dce-9ff9-394cf51c624d")
    public void setcontext(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS, value);
    }

    @objid ("4376dd88-fa3f-4124-94f2-d75cea117275")
    public String getworkload() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_WORKLOAD, this.element);
    }

    @objid ("30b7eca9-be7f-4080-87b1-31ef0067a763")
    public void setworkload(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_WORKLOAD, value);
    }

    @objid ("e046b5bc-4ad5-4994-8044-41b5e7497eef")
    public String getplatform() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_PLATFORM, this.element);
    }

    @objid ("7f159750-7d5d-4877-abfe-4e6479b8e9f9")
    public void setplatform(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_PLATFORM, value);
    }

    @objid ("14f41562-6f9f-440c-a2a7-c01579cf6348")
    public void setParent(Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("f7d9f90a-c622-4bda-a05e-8fab6d3c413e")
    public void setParent(ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("84341787-8a03-4236-b089-26717c373c70")
    public void setParent(TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
