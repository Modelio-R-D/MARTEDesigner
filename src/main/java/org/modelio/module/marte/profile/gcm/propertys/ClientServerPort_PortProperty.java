package org.modelio.module.marte.profile.gcm.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClientServerPort_PortProperty implements IPropertyContent {
    private static List<ModelElement> _clientServerSpecifications = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_SPECIFICATIONKIND, value);
        }
        else if(row == 2){
           
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_KIND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_PROVINTERFACE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_REQINTERFACE, value);
        }
        else if(row == 5){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _clientServerSpecifications, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_FEATURESSPEC_CLIENTSERVERPORT_CLIENTSERVERSPECIFICATION, 
        //                    MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_FEATURESSPEC, 
                    value
            );
        
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] tabSpecKind = MARTEEnumerationUtils.getPortSpecificationKind();
        String value_specificationKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_SPECIFICATIONKIND, elt);
        if (!(MARTEEnumerationUtils.isPortSpecificationKind(value_specificationKind))){
            value_specificationKind = "interfaceBased";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_SPECIFICATIONKIND),value_specificationKind, tabSpecKind);
               
        String[] tabKind = MARTEEnumerationUtils.getClientServerKind();
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_KIND, elt);
        if (!(MARTEEnumerationUtils.isClientServerKind(value_kind))){
            value_kind = "proreq";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_KIND),value_kind, tabKind);
        
        
        String value_provInterface = ModelUtils.getProvidedNames((Port)elt);
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_PROVINTERFACE),value_provInterface);
        
        
        String value_reqInterface = ModelUtils.getRequiredNames((Port)elt);
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_REQINTERFACE),value_reqInterface);
        
        
        _clientServerSpecifications = MARTESearchUtils.searchClientServerSpecification();   
        String[] tab_featuresSpec = ModelUtils.createListString(_clientServerSpecifications);      
        String value_featuresSpec = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_FEATURESSPEC_CLIENTSERVERPORT_CLIENTSERVERSPECIFICATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLIENTSERVERPORT_PORT_CLIENTSERVERPORT_PORT_FEATURESSPEC), value_featuresSpec, tab_featuresSpec);
    }

}
