package org.modelio.module.marte.profile.time.model;

import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedDurationObservation_Note extends TimedObservation_Note {
    public TimedDurationObservation_Note() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNote());
        
        //        try{
        //            this.element.setModel(MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getNoteType(ModelElement.class,MARTEDesignerNoteTypes.MODELELEMENT_TIMEDDURATIONOBSERVATION ));
            ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDDURATIONOBSERVATION_NOTE);
            this.element.setName(MARTEResourceManager.getName("TimedDurationObservation_Note")+ModelUtils.getNbElement(Note.class, MARTEDesignerStereotypes.TIMEDDURATIONOBSERVATION_NOTE));
        //        }catch(MdaExtensionNotFoundException e){
        //           MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        //        }
    }

    public TimedDurationObservation_Note(Note element) {
        super(element);
    }

    public String getobsKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, this.element);
    }

    public void setobsKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, value);
    }

    public enum EventKind {
        start,
        finish,
        send,
        receive,
        consume;
    }

}
