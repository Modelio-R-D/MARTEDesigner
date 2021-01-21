package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("497f41c1-7ef6-4cf9-b671-4f529c2282d9")
public class SaEndtoEndFlow_ModelElementProperty implements IPropertyContent {
    @objid ("8fc82006-0fb4-48b3-9c8b-0a621b0a2c7e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_SCHSLACK, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_TIMING, value);
        }
    }

    @objid ("da7fbd0d-25ca-4c7f-bc67-225dca846b63")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ISSCHED, elt));
        
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_SCHSLACK),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_TIMING, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SAENDTOENDFLOW_MODELELEMENT_SAENDTOENDFLOW_MODELELEMENT_TIMING),value);
    }

}
