package org.modelio.module.marte.profile.alloc.model;

import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Assign_Note {
    protected Note element;

    public Assign_Note() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNote();
        this.element.setModel(MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getNoteType(IMARTEDesignerPeerModule.MODULE_NAME,  MARTEDesignerNoteTypes.MODELELEMENT_ASSIGN, MARTEModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(ModelElement.class)));
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ASSIGN_NOTE);
        this.element.setName(MARTEResourceManager.getName("Assign_Note"));
    }

    public Assign_Note(Note element) {
        this.element = element;
    }

    public Note getElement() {
        return this.element;
    }

    public void setParent(ModelElement parent) {
        this.element.setSubject(parent);
    }

    public String getAssign_Note_kind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_KIND, this.element);
    }

    public void setAssign_Note_kind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_KIND, value);
    }

    public String getAssign_Note_nature() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_NATURE, this.element);
    }

    public void setAssign_Note_nature(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_NATURE, value);
    }

    public enum AssignementKind {
        structural,
        behavioral,
        hybrid;
    }

    public enum AssignementNature {
        spatialAllocation,
        timeScheduling;
    }

}
