package org.modelio.module.marte.profile.sam.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaStep_ModelElementProperty implements IPropertyContent {
    private static List<ModelElement> _sharedRes = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_DEADLINE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SPARECAP, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SCHSLACK, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_PREEMPTT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_READYT, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING, value);
        }
        else if(row == 7){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _sharedRes, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SHAREDRES_SASTEP, 
        //                    MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SHAREDRES, 
                    value
            );
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_DEADLINE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_DEADLINE),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SPARECAP, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SPARECAP),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SCHSLACK),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_PREEMPTT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_PREEMPTT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_READYT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_READYT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING),value);
        
        _sharedRes = MARTESearchUtils.searchSaSharedresource();   
        String[] tab_sharedRes = ModelUtils.createListString(_sharedRes);      
        String value_sharedRes = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SHAREDRES_SASTEP, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SHAREDRES), value_sharedRes, tab_sharedRes);
            
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SASTEP_MODELELEMENT_SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS),value);
    }

}
