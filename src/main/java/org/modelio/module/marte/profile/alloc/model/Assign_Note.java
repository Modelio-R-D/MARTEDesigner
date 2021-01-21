package org.modelio.module.marte.profile.alloc.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("240cf10e-ffbb-4677-84cb-77e402dac431")
public class Assign_Note {
    @objid ("504928ac-f9c8-40b6-bf04-29dc20e2641e")
    protected Note element;

    @objid ("3e650a65-c04d-4b3e-b0c5-9cb663b2f23d")
    public Assign_Note() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNote();
        this.element.setModel(MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getNoteType(IMARTEDesignerPeerModule.MODULE_NAME,  MARTEDesignerNoteTypes.MODELELEMENT_ASSIGN, MARTEModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(ModelElement.class)));
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ASSIGN_NOTE);
        this.element.setName(MARTEResourceManager.getName("Assign_Note"));
    }

    @objid ("0490d894-1aff-45e7-ab41-f59e72771e49")
    public Assign_Note(Note element) {
        this.element = element;
    }

    @objid ("9d9b83f2-687f-460f-8a1a-0769e535c1c3")
    public Note getElement() {
        return this.element;
    }

    @objid ("b02ec3b6-4761-4198-92a6-113c408a3129")
    public void setParent(ModelElement parent) {
        this.element.setSubject(parent);
    }

    @objid ("320d069f-5fc9-40d3-b590-000140f7fd90")
    public String getAssign_Note_kind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_KIND, this.element);
    }

    @objid ("b9b54c63-0427-495f-b884-d235aea6dfeb")
    public void setAssign_Note_kind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_KIND, value);
    }

    @objid ("0682b531-1aae-4907-9645-eba30c062d7a")
    public String getAssign_Note_nature() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_NATURE, this.element);
    }

    @objid ("f5ef3bbe-a3b2-44ff-ac56-309ba76434d4")
    public void setAssign_Note_nature(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ASSIGN_NOTE_ASSIGN_NOTE_NATURE, value);
    }

    @objid ("cd54dffe-c1dc-4caa-bec9-9289b76d50d8")
    public enum AssignementKind {
        structural,
        behavioral,
        hybrid;
    }

    @objid ("608f9d1d-7171-4148-bd04-95a6ec8651e9")
    public enum AssignementNature {
        spatialAllocation,
        timeScheduling;
    }

}
