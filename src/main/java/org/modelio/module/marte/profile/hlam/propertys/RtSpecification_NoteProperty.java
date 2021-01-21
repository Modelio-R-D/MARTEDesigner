package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("74c9ed3d-1e93-452e-b29a-d7e75ba4a6c7")
public class RtSpecification_NoteProperty implements IPropertyContent {
    @objid ("0723bbfd-504b-4479-8c9a-db2992e882cc")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            elt.setName(value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_UTILITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_OCCKIND, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_TREF, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RELDL, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_ABSDL, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_BOUNDDL, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RDTIME, value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_MISS, value);
        }
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_PRIORITY, value);
        }
    }

    @objid ("47fe40b1-1b76-4a39-a6b6-8b1c60c12820")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName("Name"), elt.getName());
        
        String value_utility = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_UTILITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_UTILITY),value_utility);
        
        String value_RtSpecification_Note_occKind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_OCCKIND, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_OCCKIND),value_RtSpecification_Note_occKind);
        
        String value_RtSpecification_Note_tRef = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_TREF, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_TREF),value_RtSpecification_Note_tRef);
        
        
        String value_RtSpecification_Note_relDl = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RELDL, elt);
        if(value_RtSpecification_Note_relDl.equals("")){
            value_RtSpecification_Note_relDl = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RELDL),value_RtSpecification_Note_relDl);
        
        
        String value_RtSpecification_Note_absDl = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_ABSDL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_ABSDL),value_RtSpecification_Note_absDl);
        
        
        String value_RtSpecification_Note_boundDl = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_BOUNDDL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_BOUNDDL),value_RtSpecification_Note_boundDl);
        
        
        String value_RtSpecification_Note_rdTime = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RDTIME, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RDTIME),value_RtSpecification_Note_rdTime);
        
        
        String value_RtSpecification_Note_miss = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_MISS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_MISS),value_RtSpecification_Note_miss);
        
        String value_RtSpecification_Note_priority = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_PRIORITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_PRIORITY),value_RtSpecification_Note_priority);
        
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_CONTEXT),((ModelElement)((Note)elt).getCompositionOwner()).getName());
    }

}
