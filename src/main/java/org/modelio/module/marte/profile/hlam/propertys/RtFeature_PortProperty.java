package org.modelio.module.marte.profile.hlam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("56f038bc-ba1c-4665-87fe-da8c007204f4")
public class RtFeature_PortProperty implements IPropertyContent {
    @objid ("e0fae7ff-968d-4762-85da-e9c200314795")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
    }

    @objid ("98455846-8bd4-4ac2-b2e9-0756b4ea9b71")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerNoteTypes.RTFEATURE_PORT_RTFEATURE_PORT_SPECIFICATION),
                ModelUtils.getNotesNames(elt, MARTEDesignerNoteTypes.RTFEATURE_PORT_RTFEATURE_PORT_SPECIFICATION));
    }

}
