package org.modelio.module.marte.profile.time.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9aa198d2-a4d5-487f-a690-7dddec161b45")
public class TimedDurationObservation_Note extends TimedObservation_Note {
    @objid ("888ebe62-4b64-438f-bf01-e850967fdd28")
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

    @objid ("777d201e-45f8-4720-ae1e-258c8a473b30")
    public TimedDurationObservation_Note(Note element) {
        super(element);
    }

    @objid ("a9f14721-0643-462a-a68e-1ee76f0a5cb8")
    public String getobsKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, this.element);
    }

    @objid ("35d88757-a7aa-4c13-9665-b77989965e56")
    public void setobsKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDDURATIONOBSERVATION_NOTE_TIMEDDURATIONOBSERVATION_NOTE_OBSKIND, value);
    }

    @objid ("542ce07e-6717-450f-b308-97af14e26ed5")
    public enum EventKind {
        start,
        finish,
        send,
        receive,
        consume;
    }

}
