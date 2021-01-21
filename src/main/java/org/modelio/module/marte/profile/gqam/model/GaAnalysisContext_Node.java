package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("71a3e47e-ed35-4322-8b10-bfbfe19ff531")
public class GaAnalysisContext_Node extends Configuration_Node {
    @objid ("1ec89623-7fc1-421e-91a1-5e7ff6f3fc5a")
    public GaAnalysisContext_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAANALYSISCONTEXT_NODE);
                this.element.setName(MARTEResourceManager.getName("GaAnalysisContext_Node"));
    }

    @objid ("1898b3c9-2e4a-48ad-a502-ed0cb146a45e")
    public GaAnalysisContext_Node(Node element) {
        super(element);
    }

    @objid ("04b91262-2b65-4389-a4f5-29b135dcbc23")
    public String getcontext() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_CONTEXTPARAMS, this.element);
    }

    @objid ("1379cf18-a5ef-42c1-acf0-25b0aab0ba3d")
    public void setcontext(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_CONTEXTPARAMS, value);
    }

    @objid ("6eb5936f-2a94-4578-b58c-6287f19fe544")
    public String getworkload() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_WORKLOAD, this.element);
    }

    @objid ("419b2871-37b0-4ced-8326-9523cb574b67")
    public void setworkload(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_WORKLOAD, value);
    }

    @objid ("0e0afc30-5878-4dd8-a1d2-99463ac9e5d4")
    public String getplatform() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_PLATFORM, this.element);
    }

    @objid ("80ebd00d-bcb0-4a98-8860-32ca81e41544")
    public void setplatform(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_NODE_GAANALYSISCONTEXT_NODE_PLATFORM, value);
    }

}
