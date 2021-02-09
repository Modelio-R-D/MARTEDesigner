package org.modelio.module.marte.profile.time.model;

import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedInstantObservation_Note extends TimedObservation_Note {
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

    public TimedInstantObservation_Note(Note element) {
        super(element);
    }

    public String getobsKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_OBSKIND, this.element);
    }

    public void setobsKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDINSTANTOBSERVATION_NOTE_TIMEDINSTANTOBSERVATION_NOTE_OBSKIND, value);
    }

    public enum EventKind {
        start,
        finish,
        send,
        receive,
        consume;
    }

}
