package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f3f4200c-94d0-4cb7-b2cc-7dd83451ea55")
public class Release_CollaborationProperty implements IPropertyContent {
    @objid ("90fa3a4f-cde7-46a0-a90c-ff21849eceed")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER, value);
        }
    }

    @objid ("d7c71032-e596-408a-a0ee-a6de421f3c1b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //Gr Services
        //
        String value_owner = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER),value_owner);
    }

}
