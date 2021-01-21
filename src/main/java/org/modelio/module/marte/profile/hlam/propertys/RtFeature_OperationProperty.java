package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("63888263-5be0-4bab-86fd-3ea8585870d6")
public class RtFeature_OperationProperty implements IPropertyContent {
    @objid ("bbc8937e-4f8f-45ed-9093-2f2bb1ce3ceb")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("04216b9a-43b9-43af-9c88-46cc4a178aa0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerNoteTypes.RTFEATURE_OPERATION_RTFEATURE_OPERATION_SPECIFICATION),
                ModelUtils.getNotesNames(elt, MARTEDesignerNoteTypes.RTFEATURE_OPERATION_RTFEATURE_OPERATION_SPECIFICATION));
    }

}
