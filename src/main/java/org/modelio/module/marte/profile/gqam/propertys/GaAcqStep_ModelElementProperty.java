package org.modelio.module.marte.profile.gqam.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("80ac5769-433f-4bbe-807b-dfda576ce5b5")
public class GaAcqStep_ModelElementProperty implements IPropertyContent {
    @objid ("31b14fe7-cfa0-4897-89c2-5ab85505e459")
    private static List<ModelElement> _resources = null;

    @objid ("bdffd978-7a2e-47d4-8a5e-dd9b2580ed06")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if (row == 1) {
            ModelUtils.manageSingleOrientedLink(elt, 
                    _resources, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ACQRES_GAACQSTEP, 
        //                    MARTEDesignerTagTypes.GAACQSTEP_MODELELEMENT_GAACQSTEP_MODELELEMENT_ACQRES, 
                    value
            );
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GAACQSTEP_MODELELEMENT_GAACQSTEP_MODELELEMENT_RESUNITS, value);
        }
    }

    @objid ("3ab1263b-52bc-4ccc-ab97-bf1ffec4a8da")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        _resources = MARTESearchUtils.searchResource();   
         String[] tab_resource = ModelUtils.createListString(_resources);      
         String value_resource = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ACQRES_GAACQSTEP, elt);
         table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAACQSTEP_MODELELEMENT_GAACQSTEP_MODELELEMENT_ACQRES), value_resource, tab_resource);
             
        String value_context = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAACQSTEP_MODELELEMENT_GAACQSTEP_MODELELEMENT_RESUNITS,elt);
        if (value_context.equals(""))
            value_context = "1";
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GAACQSTEP_MODELELEMENT_GAACQSTEP_MODELELEMENT_RESUNITS),value_context);
    }

}
