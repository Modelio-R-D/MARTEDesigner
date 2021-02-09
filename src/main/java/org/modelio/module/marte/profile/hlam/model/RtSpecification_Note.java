package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtSpecification_Note {
    protected Note element;

    public RtSpecification_Note() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNote();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTSPECIFICATION_NOTE);
        this.element.setName(MARTEResourceManager.getName("RtSpecification_Note"));
    }

    public RtSpecification_Note(Note element) {
        this.element = element;
    }

    public Note getElement() {
        return this.element;
    }

    public void setParent(ModelElement parent) {
        this.element.setSubject(parent);
    }

    public String getRtSpecification_Note_utility() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_UTILITY, this.element);
    }

    public void setRtSpecification_Note_utility(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_UTILITY, value);
    }

    public String getRtSpecification_Note_occKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_OCCKIND, this.element);
    }

    public void setRtSpecification_Note_occKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_OCCKIND, value);
    }

    public String getRtSpecification_Note_tRef() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_TREF, this.element);
    }

    public void setRtSpecification_Note_tRef(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_TREF, value);
    }

    public String getRtSpecification_Note_relDl() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RELDL, this.element);
    }

    public void setRtSpecification_Note_relDl(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RELDL, value);
    }

    public String getRtSpecification_Note_absDl() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_ABSDL, this.element);
    }

    public void setRtSpecification_Note_absDl(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_ABSDL, value);
    }

    public String getRtSpecification_Note_boundDl() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_BOUNDDL, this.element);
    }

    public void setRtSpecification_Note_boundDl(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_BOUNDDL, value);
    }

    public String getRtSpecification_Note_rdTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RDTIME, this.element);
    }

    public void setRtSpecification_Note_rdTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_RDTIME, value);
    }

    public String getRtSpecification_Note_miss() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_MISS, this.element);
    }

    public void setRtSpecification_Note_miss(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_MISS, value);
    }

    public String getRtSpecification_Note_priority() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_PRIORITY, this.element);
    }

    public void setRtSpecification_Note_priority(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_PRIORITY, value);
    }

    public String getRtSpecification_Note_context() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_CONTEXT, this.element);
    }

    public void setRtSpecification_Note_context(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSPECIFICATION_NOTE_RTSPECIFICATION_NOTE_CONTEXT, value);
    }

}
