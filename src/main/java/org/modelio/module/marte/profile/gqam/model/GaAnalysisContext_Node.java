package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaAnalysisContext_Node extends Configuration_Node {
    public GaAnalysisContext_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAANALYSISCONTEXT_NODE);
                this.element.setName(MARTEResourceManager.getName("GaAnalysisContext_Node"));
    }

    public GaAnalysisContext_Node(Node element) {
        super(element);
    }

    public String getcontext() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_CONTEXTPARAMS, this.element);
    }

    public void setcontext(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_CONTEXTPARAMS, value);
    }

    public String getworkload() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_WORKLOAD, this.element);
    }

    public void setworkload(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_WORKLOAD, value);
    }

    public String getplatform() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_PLATFORM, this.element);
    }

    public void setplatform(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_PLATFORM, value);
    }

}
