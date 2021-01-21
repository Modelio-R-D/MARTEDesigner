package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("169d9ef0-b8b9-4ba7-90a5-1e4259cc5a8b")
public class PropertyManager {
    @objid ("be8cb608-1c82-4c5a-8d4b-26cd5e82238c")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.PACOMMSTEP_MODELELEMENT)){
            return new PaCommStep_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATIONEND)){
            return new PaLogicalResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PALOGICALRESOURCE_ATTRIBUTE)){
            return new PaLogicalResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PALOGICALRESOURCE_LINK)){
            return new PaLogicalResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PALOGICALRESOURCE_INSTANCE)){
            return new PaLogicalResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PALOGICALRESOURCE_PARAMETER)){
            return new PaLogicalResource_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATION)){
            return new PaLogicalResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PALOGICALRESOURCE_LIFELINE)){
            return new PaLogicalResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PAREQUESTEDSERVICE_MODELELEMENT)){
            return new PaRequestedService_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PARESPASSSTEP_MODELELEMENT)){
            return new PaResPassStep_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PARUNTINSTANCE_MODELELEMENT)){
            return new PaRunTInstance_ModelElementProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PASTEP_MODELELEMENT)){
            return new PaStep_ModelElementProperty();
        }
        return new DefaultProperty();
    }

}
