package org.modelio.module.marte.profile.gqam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("09b89e82-0ab5-4938-b85d-782aba131fae")
public class GaTimedObs_ConstraintProperty implements IPropertyContent {
    @objid ("4e31ea63-aa5e-4cbe-8d09-ef9eeb5adcb3")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY, value);
        }
        if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS, value);
        }
        if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS, value);
        }
    }

    @objid ("7dccf48d-a5a8-4ea1-9e6b-646b2ac6cfcd")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String[] types_laxitykind = MARTEEnumerationUtils.getLaxityKind();
        String value_laxitykind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY),value_laxitykind, types_laxitykind);
        
        String value_startObs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS),value_startObs);
        
              
        String value_endObs = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS),value_endObs);
    }

}
