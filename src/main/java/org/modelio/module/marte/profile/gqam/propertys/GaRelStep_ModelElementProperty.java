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

@objid ("8a1334ea-f6e2-46ba-9648-02593125ff78")
public class GaRelStep_ModelElementProperty implements IPropertyContent {
    @objid ("831cef5a-97f3-46ef-823c-2eb3ac30648a")
    private static List<ModelElement> _resources = null;

    @objid ("7a7bf174-0786-447c-9320-ccf90ae13065")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _resources, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RELRES_GAACQSTEP, 
        //                    MARTEDesignerTagTypes.GARELSTEP_MODELELEMENT_GARELSTEP_MODELELEMENT_RELRES, 
                    value
            );
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GARELSTEP_MODELELEMENT_GARELSTEP_MODELELEMENT_RESUNITS, value);
        }
    }

    @objid ("d8aefa73-1834-437b-9e3c-809c8676d346")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        _resources = MARTESearchUtils.searchResource();   
        String[] tab_resource = ModelUtils.createListString(_resources);      
        String value_resource = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RELRES_GAACQSTEP, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GARELSTEP_MODELELEMENT_GARELSTEP_MODELELEMENT_RELRES), value_resource, tab_resource);
            
        String value_resunits = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GARELSTEP_MODELELEMENT_GARELSTEP_MODELELEMENT_RESUNITS, elt);
        if (value_resunits.equals(""))
            value_resunits = "1";
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GARELSTEP_MODELELEMENT_GARELSTEP_MODELELEMENT_RESUNITS),value_resunits);
    }

}
