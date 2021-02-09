package org.modelio.module.marte.profile.alloc.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Assign_NoteProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_NATURE, value);
        }
        else if(row == 3) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_FROM, value);
        }
        else if (row == 4) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_TO, value);
        }
        else if (row == 5) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_IMPLIEDCONSTRAINT, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        // KIND
        String[] types = new String[]{"structural", "behavioral", "hybrid"};
        String value_Assign_Note_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_KIND, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_KIND),value_Assign_Note_kind, types);
        
        // NATURE
        types = new String[]{"spatialAllocation", "timeScheduling"};
        String value_Assign_Note_nature = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_NATURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_NATURE),value_Assign_Note_nature);
        
        // FROM
        String value_Assign_Note_from = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_FROM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_FROM),value_Assign_Note_from);
        
        // TO
        String value_Assign_Note_to = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_TO, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_TO),value_Assign_Note_to);
        
        // IMPLIED CONSTRAINT
        String value_Assign_Note_implied = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_IMPLIEDCONSTRAINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_IMPLIEDCONSTRAINT),value_Assign_Note_implied);
    }

}
