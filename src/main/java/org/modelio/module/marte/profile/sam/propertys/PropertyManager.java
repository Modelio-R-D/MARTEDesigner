package org.modelio.module.marte.profile.sam.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.SAANALYSISCONTEXT_COLLABORATION)){
            return new SaAnalysisContext_CollaborationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAANALYSISCONTEXT_PACKAGE)){
            return new SaAnalysisContext_PackageProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAANALYSISCONTEXT_CLASS)){
            return new SaAnalysisContext_ClassProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAANALYSISCONTEXT_NODE)){
            return new SaAnalysisContext_NodeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAANALYSISCONTEXT_BEHAVIOR)){
            return new SaAnalysisContext_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SACOMMHOST_PARAMETER)){
            return new SaCommHost_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SACOMMHOST_ASSOCIATIONEND)){
            return new SaCommHost_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SACOMMHOST_ATTRIBUTE)){
            return new SaCommHost_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SACOMMHOST_CLASSIFIER)){
            return new SaCommHost_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SACOMMHOST_LINK)){
            return new SaCommHost_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SACOMMHOST_INSTANCE)){
            return new SaCommHost_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SACOMMHOST_ASSOCIATION)){
            return new SaCommHost_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SACOMMHOST_LIFELINE)){
            return new SaCommHost_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAENDTOENDFLOW_MODELELEMENT)){
            return new SaEndtoEndFlow_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAEXECHOST_ASSOCIATIONEND)){
            return new SaExecHost_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAEXECHOST_CLASSIFIER)){
            return new SaExecHost_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAEXECHOST_ATTRIBUTE)){
            return new SaExecHost_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAEXECHOST_LINK)){
            return new SaExecHost_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAEXECHOST_INSTANCE)){
            return new SaExecHost_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAEXECHOST_PARAMETER)){
            return new SaExecHost_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAEXECHOST_ASSOCIATION)){
            return new SaExecHost_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SAEXECHOST_LIFELINE)){
            return new SaExecHost_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASCHEDOBS_CONSTRAINT)){
            return new SaSchedObs_ConstraintProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASHAREDRESOURCE_CLASSIFIER)){
            return new SaSharedResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASHAREDRESOURCE_PARAMETER)){
            return new SaSharedResource_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATIONEND)){
            return new SaSharedResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASHAREDRESOURCE_ATTRIBUTE)){
            return new SaSharedResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASHAREDRESOURCE_LINK)){
            return new SaSharedResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASHAREDRESOURCE_INSTANCE)){
            return new SaSharedResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATION)){
            return new SaSharedResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASHAREDRESOURCE_LIFELINE)){
            return new SaSharedResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SASTEP_MODELELEMENT)){
            return new SaStep_ModelElementProperty();
        }
        return new DefaultProperty();
    }

}
