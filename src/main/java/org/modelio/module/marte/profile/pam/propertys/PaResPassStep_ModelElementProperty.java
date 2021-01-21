package org.modelio.module.marte.profile.pam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d57c0ebe-496a-43ee-ae65-21175861d0d2")
public class PaResPassStep_ModelElementProperty implements IPropertyContent {
    @objid ("4aa7df02-cae8-4457-bd49-d3f34f262dfd")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PARESPASSSTEP_MODELELEMENT_PARESPASSSTEP_MODELELEMENT_RESOURCE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.PARESPASSSTEP_MODELELEMENT_PARESPASSSTEP_MODELELEMENT_RESUNITS, value);
        }
    }

    @objid ("05bb83a9-63c8-47c5-a14c-c42fb446aefc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PARESPASSSTEP_MODELELEMENT_PARESPASSSTEP_MODELELEMENT_RESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PARESPASSSTEP_MODELELEMENT_PARESPASSSTEP_MODELELEMENT_RESOURCE),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PARESPASSSTEP_MODELELEMENT_PARESPASSSTEP_MODELELEMENT_RESUNITS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.PARESPASSSTEP_MODELELEMENT_PARESPASSSTEP_MODELELEMENT_RESUNITS),value);
    }

}
