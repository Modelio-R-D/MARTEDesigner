package org.modelio.module.marte.profile.coreelements.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("4909174f-05ae-4dca-a024-b5922a27204d")
public class PropertyManager {
    @objid ("45fd0661-c31f-4d01-9a43-4bf2f3990035")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.CONFIGURATION_BEHAVIOR)){
            return new Configuration_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CONFIGURATION_CLASS)){
            return  new Configuration_ClassProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CONFIGURATION_COLLABORATION)){
            return new Configuration_CollaborationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CONFIGURATION_NODE)){
            return new Configuration_NodeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CONFIGURATION_PACKAGE)){
            return  new Configuration_PackageProperty();
        }
        return new DefaultProperty();
    }

}
