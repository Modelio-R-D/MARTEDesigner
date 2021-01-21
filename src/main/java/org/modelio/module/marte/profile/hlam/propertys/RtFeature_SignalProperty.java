package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b5efdf19-316d-4e45-b982-7abd9f332bbe")
public class RtFeature_SignalProperty implements IPropertyContent {
    @objid ("bf0e7ace-e7c4-4f4d-9b41-1074ff197b8c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("3266ad13-3f4f-4a69-b7ec-278724411484")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerNoteTypes.RTFEATURE_SIGNAL_RTFEATURE_SIGNAL_SPECIFICATION),
                ModelUtils.getNotesNames(elt, MARTEDesignerNoteTypes.RTFEATURE_SIGNAL_RTFEATURE_SIGNAL_SPECIFICATION));
    }

}
