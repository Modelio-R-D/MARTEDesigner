package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("db12f026-11b1-4efc-89dd-ad8f51267c48")
public class SaCommStep_ModelElementProperty implements IPropertyContent {
    @objid ("aa97246d-13ca-4199-bd62-40ce0110b157")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_DEADLINE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SPARECAP, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SCHSLACK, value);
        }
    }

    @objid ("1b2a64c6-9edc-47dd-8149-dc2fff15c4ed")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_DEADLINE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_DEADLINE),value);
             
                value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SPARECAP, elt);
                table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SPARECAP),value);
                
                value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SCHSLACK, elt);
                table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMSTEP_MODELELEMENT_SACOMMSTEP_MODELELEMENT_SCHSLACK),value);
    }

}
