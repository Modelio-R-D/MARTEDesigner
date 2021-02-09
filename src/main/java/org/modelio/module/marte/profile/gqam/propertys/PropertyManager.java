package org.modelio.module.marte.profile.gqam.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.GAACQSTEP_MODELELEMENT)){
            return new  GaAcqStep_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAANALYSISCONTEXT_BEHAVIOR)){
            return new  GaAnalysisContext_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAANALYSISCONTEXT_CLASS)){
            return new  GaAnalysisContext_ClassProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAANALYSISCONTEXT_COLLABORATION)){
            return new  GaAnalysisContext_CollaborationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAANALYSISCONTEXT_NODE)){
            return new  GaAnalysisContext_NodeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAANALYSISCONTEXT_PACKAGE)){
            return new  GaAnalysisContext_PackageProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMCHANNEL_ASSOCIATION)){
            return new  GaCommChannel_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMCHANNEL_ASSOCIATIONEND)){
            return new  GaCommChannel_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMCHANNEL_ATTRIBUTE)){
            return new  GaCommChannel_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMCHANNEL_CLASSIFIER)){
            return new  GaCommChannel_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMCHANNEL_INSTANCE)){
            return new  GaCommChannel_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMCHANNEL_LIFELINE)){
            return new  GaCommChannel_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMCHANNEL_LINK)){
            return new  GaCommChannel_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMCHANNEL_PARAMETER)){
            return new  GaCommChannel_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMHOST_PARAMETER)){
            return new  GaCommHost_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMHOST_ASSOCIATIONEND)){
            return new  GaCommHost_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMHOST_ASSOCIATION)){
            return new  GaCommHost_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMHOST_ATTRIBUTE)){
            return new  GaCommHost_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMHOST_CLASSIFIER)){
            return new  GaCommHost_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMHOST_INSTANCE)){
            return new  GaCommHost_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMHOST_LINK)){
            return new  GaCommHost_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMHOST_LIFELINE)){
            return new  GaCommHost_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_PARAMETER)){
            return new  GaExecHost_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GACOMMSTEP_MODELELEMENT)){
            return new  GaCommStep_ModelElementProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEVENTTRACE_MODELELEMENT)){
            return new  GaEventTrace_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_ASSOCIATION)){
            return new  GaExecHost_AssociationProperty();
        }     
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_ASSOCIATIONEND)){
            return new  GaExecHost_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_ATTRIBUTE)){
            return new  GaExecHost_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_CLASSIFIER)){
            return new  GaExecHost_ClassifierProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_INSTANCE)){
            return new  GaExecHost_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_LIFELINE)){
            return new  GaExecHost_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_LINK)){
            return new  GaExecHost_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAEXECHOST_PARAMETER)){
            return new  GaExecHost_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GALATENCYOBS_CONSTRAINT)){
            return new  GaLatencyObs_ConstraintProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GARELSTEP_MODELELEMENT)){
            return new  GaRelStep_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAREQUESTEDSERVICE_MODELELEMENT)){
            return new  GaRequestedService_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GARESOURCESPLATFORM_CLASSIFIER)){
            return new  GaResourcesPlatform_ClassifierProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.GASCENARIO_MODELELEMENT)){
            return new  GaScenario_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GASTEP_MODELELEMENT)){
            return new  GaStep_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GATIMEDOBS_CONSTRAINT)){
            return new  GaTimedObs_ConstraintProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAWORKLOADBEHAVIOR_MODELELEMENT)){
            return new  GaWorkloadBehavior_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAWORKLOADEVENT_MODELELEMENT)){
            return new  GaWorkloadEvent_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GAWORKLOADGENERATOR_BEHAVIOR)){
            return new  GaWorkloadGenerator_BehaviorProperty();
        }
        return new DefaultProperty();
    }

}
