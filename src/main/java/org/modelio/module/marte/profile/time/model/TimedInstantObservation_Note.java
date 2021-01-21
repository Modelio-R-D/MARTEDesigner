package org.modelio.module.marte.profile.time.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b87f4941-4c41-4003-948a-bea956f117dc")
public class TimedInstantObservation_Note extends TimedObservation_Note {
    @objid ("55c7c314-3167-4b6c-93a6-26595d354e78")
    public TimedInstantObservation_Note() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNote());
        //        try{
        //            this.element.setModel(MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getNoteType(ModelElement.class, MARTEDesignerNoteTypes.MODELELEMENT_TIMEDINSTANTOBSERVATION));
        
            ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDINSTANTOBSERVATION_NOTE);
            this.element.setName(MARTEResourceManager.getName("TimedInstantObservation_Note")+ModelUtils.getNbElement(Note.class, MARTEDesignerStereotypes.TIMEDINSTANTOBSERVATION_NOTE));
        //        }catch(MdaExtensionNotFoundException e){
        //           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        //        }
    }

    @objid ("3011c58b-79de-4b9c-b829-bfd1542ef422")
    public TimedInstantObservation_Note(Note element) {
        super(element);
    }

    @objid ("f8135629-d682-4415-8566-e7a1b8041c7d")
    public String getobsKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_OBSKIND, this.element);
    }

    @objid ("a7a387ce-732c-48bf-a7b3-248e63a76a94")
    public void setobsKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_OBSKIND, value);
    }

    @objid ("6b69298d-a788-4444-bc53-330c9373d9a4")
    public enum EventKind {
        start,
        finish,
        send,
        receive,
        consume;
    }

}
