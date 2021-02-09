package org.modelio.module.marte.profile.rsm.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.DISTRIBUTE_DEPENDENCY)){
            return new Distribute_DependencyProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERREPETITION_CONNECTOR)){
            return new InterRepetition_ConnectorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESHAPE_CONNECTOR)){
            return new Reshape_ConnectorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAPED_ASSOCIATIONEND)){
            return new Shaped_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAPED_ATTRIBUTE)){
            return new Shaped_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAPED_BINDABLEINSTANCE)){
            return new Shaped_BindableInstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAPED_CONNECTOREND)){
            return new Shaped_ConnectorEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAPED_PARAMETER)){
            return new Shaped_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TILER_CONNECTOR)){
            return new Tiler_ConnectorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TILER_CONNECTOREND)){
            return new Tiler_ConnectorEndProperty();
        }
        return new DefaultProperty();
    }

}
